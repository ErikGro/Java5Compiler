grammar JavaFiveGrammar;

/* This will be the entry point of our parser. */
javaProgram:    clazz;

clazz:   AccessModifier Class Identifier '{' fieldOrMethod* '}';

fieldOrMethod: field|method;

method:   AccessModifier Static? type Identifier '(' methodParameterList ')' blockStatement;

methodParameterList: (type Identifier (',' type Identifier)*)?;

field:   AccessModifier Static? localVarDeclarationStatement ';';

///////////////////////////////////////////////////////////////////////////////////////
//
//  Statements and Statement Expressions
//
///////////////////////////////////////////////////////////////////////////////////////

statement
    :   ';'
    |   blockStatement
    |   ifStatement
    |   switchStatement
    |   whileStatement
    |   doWhileStatement
    |   forStatement
    |   localVarDeclarationStatement ';'
    |   returnStatement
    |   statementExpression
    |   Continue ';'
    |   Break ';'
    ;

ifStatement: If parExpression statement (Else statement)?;

switchStatement: Switch parExpression '{' (Case|Default) ':' statement* '}' ;

whileStatement: While parExpression statement;

doWhileStatement: Do statement While parExpression ';';

forStatement: For '(' localVarDeclarationStatement? ';' expression? ';' statementExpression? ')' statement;

localVarDeclarationStatement:   type Identifier ('=' expression)?;

returnStatement: Return expression;

statementExpression: expression ';';

blockStatement
    :   '{' statement* '}'
    ;

type
    :   Primitive
    |   Identifier
    ;

///////////////////////////////////////////////////////////////////////////////////////
//
// Expressions
//
///////////////////////////////////////////////////////////////////////////////////////

expression
    :   (Int|Char|Bool|Identifier|This)
    |   parExpression
    |   methodCall // TODO make AST
    |   newExp
    |   expression ('++'|'--')
    |   ('++'|'--'|'+'|'-'|'~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<<'|'>>'|'>>>') expression
    |   expression ('<'|'>'|'<='|'>=') expression
    |   expression ('=='|'!=') expression
    |   expression ('&'|'^'|'|') expression
    |   expression ('&&'|'||') expression
    |   expression '?' expression ':' expression
    |   assignment
    ;

methodCall
    :   Identifier ('.' (expression|Identifier))* '(' expressionList? ')'
    |   This ('.' (expression|Identifier))* '(' expressionList? ')'
    ;

newExp:   New Identifier '(' expressionList? ')';

assignment
    :   Identifier (('='|'+='|'-='|'*='|'/='|'%='|'&='|'^='|'|='|'<<='|'>>='|'>>>=') Identifier)*
                   ('='|'+='|'-='|'*='|'/='|'%='|'&='|'^='|'|='|'<<='|'>>='|'>>>=') expression
    ;

expressionList
    :   expression (',' expression)*
    ;

parExpression: '(' expression ')';

/**
  * Terminal symbols.
  */

AccessModifier
    :   'public'
    |   'private'
    ;

Primitive
    :   'char'
    |   'int'
    |   'boolean'
    |   'void'
    ;

/* A boolean value true or false */
Bool:'true'|'false';

/* Keywords per java specification that are relevant to our task
    (https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.9)
    */
Class:'class';
Static:'static';
For:'for';
While:'while';
Do:'do';
If:'if';
Switch:'switch';
Case:'case';
Default:'default';
Else:'else';
Return:'return';
This:'this';
New :'new';
Break:'break';
Continue:'continue';

/* Int has to go on top of Digit otherwise the parser see's an JavaLetterOrDigit instead
    of a number and everything goes to hell*/
Int
    :    Digit+
    ;

/* A character value
    */
Char
    :   '\'' [ a-zA-Z0-9] '\''
    |   '\'\\t\''
    |   '\'\\\'\''
    |   '\'\\"\''
    |   '\'\\r\''
    |   '\'\\\\\''
    |   '\'\\n\''
    |   '\'\\f\''
    |   '\'\\b\''
    |   '\'\\u' Hex Hex Hex Hex '\'' // Unicode character
    ;

/* An identifer is a class name, method name or field that does not match a keyword
    (https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.8)
    Note that key words are automatically excluded by the rule precedence of antlr
    e.g. static always evaluates to Static and not Identifier because the Static rule is declared before
    the Identifier rule
    */
Identifier
    :   IdentifierChars
    ;

IdentifierChars
    :   JavaLetter JavaLetterOrDigit*
    ;

JavaLetterOrDigit
    :   JavaLetter|Digit
    ;

Digit
    :   [0-9]
    ;

Hex
    :   [0-9abcdefABCDEF]
    ;

/* TODO This should include all unicode characters per specification. Is this required for the task?
*/
JavaLetter
    :   [a-zA-Z_$]
    ;

/* We're going to ignore all white space characters */
WS
    :   (' ' | '\t' | '\r'| '\n') -> channel(HIDDEN)
    ;