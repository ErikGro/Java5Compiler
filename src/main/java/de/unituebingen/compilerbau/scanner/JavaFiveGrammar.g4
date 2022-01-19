grammar JavaFiveGrammar;

/* This will be the entry point of our parser. */
javaProgram
    :   clazz
    |   method
    |   field
    |   statement
    |   expression
    ;

clazz
    :   AccessModifier Class Identifier '{' (field|method)* '}'
    ;

method
    :   AccessModifier Static? type Identifier '(' (type Identifier (',' type Identifier)*)? ')' blockStatement
    ;

field
    :   AccessModifier Static? localVarDeclarationStatement ';'
    ;

///////////////////////////////////////////////////////////////////////////////////////
//
//  Statements
//
///////////////////////////////////////////////////////////////////////////////////////

statement
    :   ';'
    |   blockStatement
    |   If parExpression statement (Else statement)?
    |   Switch parExpression '{' (Case|Default) ':' statement* '}'
    |   While parExpression statement
    |   Do statement While parExpression ';'
    |   For '(' forControl ')' statement
    |   localVarDeclarationStatement ';'
    |   Return statement
    |   expression ';' //statement expression
    |   Continue ';'
    |   Break ';'
    ;

forControl: forInit? ';' expression? ';' expressionList?;

forInit: localVarDeclarationStatement | expressionList;

localVarDeclarationStatement:   type Identifier ('=' expression)?;

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
    |   expression '.' (methodCall|Identifier)
    |   methodCall
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
    |   expression ('='|'+='|'-='|'*='|'/='|'%='|'&='|'^='|'|='|'<<='|'>>='|'>>>=') expression
    ;

methodCall
    :   Identifier '(' expressionList? ')'
    |   This '(' expressionList? ')'
    ;

newExp:   New Identifier '(' expressionList? ')';

expressionList
    :   expression (',' expression)*
    ;

parExpression: '(' expression ')';

/* All expressions and statement expressions */
/*exp
    :   pureExp
    |   statementExp
    ;

/* These are statement expressions but defined without the semicolon so we can use the as expressions e.g.
    as method arguments, etc. */
/*statementExp
    :   methodCallExp
    |   newExp
    |   assignmentExp
    |   Identifier '++' // need them for for-loops
    |   Identifier '--'
    |   '++' Identifier
    |   '--' Identifier
    ;

methodCallExp
    :   (This|Identifier) '.' Identifier ('.' Identifier)* '(' (exp (',' exp)*)? ')'
    ;

newExp
    :   New Identifier '(' exp? ')'
    |   New Identifier '(' (exp ',')+ exp ')'
    ;

assignmentExp
    :   assigmentPart+ exp
    ;

assigmentPart
    :   Identifier '='
    |   Identifier '+='
    |   Identifier '-='
    |   Identifier '*='
    |   Identifier '/='
    |   Identifier '%='
    |   Identifier '&='
    |   Identifier '^='
    |   Identifier '|='
    |   Identifier '<<='
    |   Identifier '>>='
    |   Identifier '>>>='
    ;

/* Pure expressions are all expressions that are not statements at the same time */
/*pureExp
    :   Int|Char|Bool|Identifier
    |   '(' pureExp ')'
    |   numberExp
    |   boolExp
    |   ternaryExp
    ;

ternaryExp: boolExp '?' pureExp ':' pureExp;

/* All expressions that produce a boolean as a result, this does also include comparisons of numbers
    (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html) */

/*boolExp
    :   (Bool|Identifier|numberBoolExp)
    |   '!' (Bool|Identifier|numberBoolExp)
    |   boolExp '==' boolExp
    |   boolExp '!=' boolExp
    |   boolExp '&' boolExp
    |   boolExp '^' boolExp
    |   boolExp '|' boolExp
    |   boolExp '&&' boolExp
    |   boolExp '||' boolExp
    ;

/* All operators that compare numbers with each other and produce a boolean value
    Note that number boolean expressions are not allowed to evaluate recursively to prevent 1<1<1
    which would be a comparison between boolean and number */

/*numberBoolExp
    :   '(' numberBoolExp ')'
    |   numberExp '<' numberExp
    |   numberExp '<=' numberExp
    |   numberExp '>=' numberExp
    |   numberExp '>' numberExp
    |   numberExp '==' numberExp
    |   numberExp '!=' numberExp
    ;

/* All expressions that produce an int or char as a result
    (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html) */
/*numberExp
    :   (Int|Char|Identifier)
    |   '(' numberExp ')'
    |   Identifier '++'
    |   Identifier '--'
    |   '++' Identifier
    |   '--' Identifier
    |   '-' numberExp
    |   '+' numberExp
    |   '~' numberExp
    |   numberExp '*' numberExp
    |   numberExp '/' numberExp
    |   numberExp '%' numberExp
    |   numberExp '+' numberExp
    |   numberExp '-' numberExp
    |   numberExp '<<' numberExp
    |   numberExp '>>' numberExp
    |   numberExp '>>>' numberExp
    |   numberExp '&' numberExp
    |   numberExp '^' numberExp
    |   numberExp '|' numberExp
    ;

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