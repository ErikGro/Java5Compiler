grammar JavaFiveGrammar;

/* This will be the entry point of our parser. */
javaProgram:    clazz+;

clazz:   AccessModifier Class Identifier LCurlyBracket clazzMember* RCurlyBracket;

clazzMember: field|method|constructor;

constructor: AccessModifier Identifier LRoundBracket parameterList RRoundBracket blockStatement;

method:   AccessModifier Static? type Identifier LRoundBracket parameterList RRoundBracket blockStatement;

parameterList: (type Identifier (Comma type Identifier)*)?;

field:   AccessModifier Static? localVarDeclarationStatement;


///////////////////////////////////////////////////////////////////////////////////////
//
//  Statements and Statement Expressions
//
///////////////////////////////////////////////////////////////////////////////////////

statement
    :   Semicolon
    |   blockStatement
    |   ifStatement
    |   switchStatement
    |   whileStatement
    |   doWhileStatement
    |   forStatement
    |   localVarDeclarationStatement
    |   returnStatement
    |   statementExpression
    |   Continue Semicolon
    |   Break Semicolon
    ;

ifStatement: If parExpression statement (Else statement)?;

switchStatement: Switch parExpression LCurlyBracket ((Case|Default) Colon statement)* RCurlyBracket ;

whileStatement: While parExpression statement;

doWhileStatement: Do statement While parExpression Semicolon;

forStatement: For LRoundBracket localVarDeclarationStatement? Semicolon expression? Semicolon statementExpression? RRoundBracket statement;

localVarDeclarationStatement:   type Identifier (SimpleAssignmentOp expression)? Semicolon;

returnStatement: Return expression Semicolon;

statementExpression: expression Semicolon;

blockStatement
    :   LCurlyBracket statement* RCurlyBracket
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
    |   methodCall
    |   expression Selector methodCall // antlr cries because of mutually left recursive when (expression '.')? ...
    |   expression Selector Identifier // object access
    |   newExp
    |   expression IncDecOp
    |   (IncDecOp|AddOp|UnaryOp) expression
    |   expression MultOp expression
    |   expression AddOp expression
    |   expression ShiftOp expression
    |   expression RelationalOp expression
    |   expression EqualityOp expression
    |   expression BitwiseOp expression
    |   expression ConditionalOp expression
    |   expression QuestionMark expression Colon expression
    |   assignment
    ;

methodCall:  Identifier LRoundBracket expressionList? RRoundBracket;

newExp:   New Identifier LRoundBracket expressionList? RRoundBracket;

assignment
    :   Identifier ((SimpleAssignmentOp|AdvancedAssignmentOp) Identifier)*
                   (SimpleAssignmentOp|AdvancedAssignmentOp) expression
    ;


expressionList
    :   expression (Comma expression)*
    ;

parExpression: LRoundBracket expression RRoundBracket;

/**
  * Terminal symbols.
  */
IncDecOp:               '++'|'--';
UnaryOp:                '~'|'!';
MultOp:                 '*'|'/'|'%';
AddOp:                  '+'|'-';
ShiftOp:                '<<'|'>>'|'>>>';
RelationalOp:           '<'|'>'|'<='|'>=';
EqualityOp:             '=='|'!=';
BitwiseOp:              '&'|'^'|'|';
ConditionalOp:          '&&'|'||';
QuestionMark:           '?';
AdvancedAssignmentOp:   '+='|'-='|'*='|'/='|'%='|'&='|'^='|'|='|'<<='|'>>='|'>>>=';
SimpleAssignmentOp:     '=';
Selector:               '.';


LCurlyBracket: '{';
RCurlyBracket: '}';

LRoundBracket: '(';
RRoundBracket: ')';

Comma: ',';
Semicolon: ';';
Colon: ':';

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

JavaLetter
    :   [a-zA-Z_$]
    ;

/* We're going to ignore all white space characters */
WS
    :   (' ' | '\t' | '\r'| '\n') -> channel(HIDDEN)
    ;