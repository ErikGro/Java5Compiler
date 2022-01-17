grammar Exp;

/* This will be the entry point of our parser. */
javaProgram
    :   class
    |   method
    |   field
    |   statement
    |   exp
    ;

class
    :   AccessModifier Class Identifier '{' field* method* '}'
    ;

method
    :   AccessModifier Static? type Identifier '(' (type Identifier (',' type Identifier)*)? ')' blockStatement
    ;

field
    :   AccessModifier Static? localVarDeclarationStatement ';'
    ;

/* All statements: Note that the definitions of the statements do not require a semicolon that is so we can
    use them in a for loop without the */
statement
    :   ifStatement
    |   whileStatement
    |   dowhileStatement
    |   forStatement
    |   localVarDeclarationStatement ';'
    |   blockStatement
    |   returnStatement ';'
    |   methodCallExp ';'
    |   newExp ';'
    |   assignmentExp ';'
    |   postAndPrefixExp ';' // Can also use them as a statement... (these guys are everywhere!!)
    |   Continue ';'
    |   Break ';'
    ;

/* Note that the precedence of the rules is important otherwise the blocks of the if will not be
    recognized as the body!!! (same applies for the while and for loop)*/
ifStatement
    :   If '(' boolExp ')' blockStatement ('else' (ifStatement|blockStatement))?
    |   If '(' boolExp ')' ';'?
    ;


whileStatement
    :   While '(' boolExp ')' blockStatement
    |   While '(' boolExp ')' ';'?
    ;

dowhileStatement
    :   Do ';' While '(' boolExp ')' ';'
    |   Do statement While '(' boolExp ')' ';'
    |   Do blockStatement While '(' boolExp ')' ';'
    ;

/* for loop in all variations */
forStatement
    :   forDeclaration blockStatement
    |   forDeclaration  ';'?
    ;

/* The for declaration without any block */
forDeclaration
    :   For '(' (statementExp (',' statementExp)*)? ';'
                    boolExp? ';'
                    (statementExp (',' statementExp)*)? ')' // includes for(;;) as infinite loop
    |   For '(' localVarDeclarationStatement (',' assignmentExp)* ';'
                        boolExp? ';'
                        (statementExp (',' statementExp)*)? ')'
    ;

localVarDeclarationStatement
    :   type Identifier
    |   type assignmentExp
    ;

blockStatement
    :   '{' statement* '}'
    ;

returnStatement
    :   Return exp?
    ;

/* Primitive type or some class type */
type
    :   Primitive
    |   Identifier
    ;

/* All expressions and statement expressions */
exp
    :   pureExp
    |   statementExp
    ;

/* These are statement expressions but defined without the semicolon so we can use the as expressions e.g.
    as method arguments, etc. */
statementExp
    :   methodCallExp
    |   newExp
    |   assignmentExp
    |   postAndPrefixExp // need them for for-loops
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
pureExp
    :   Number|Char|Bool|Identifier
    |   '(' pureExp ')'
    |   postAndPrefixExp
    |   unaryExp
    |   arithmeticExp
    |   shiftExp
    |   relationalExp
    |   equalityExp
    |   bitwiseExp
    |   logicalExp
    |   ternaryExp
    ;

unaryExp
    :   unaryNumberExp
    |   unaryBoolExp
    ;

equalityExp
    :   numberEqualityExp
    |   boolEqualityExp
    ;

bitwiseExp
    :   numberBitwiseExp
    |   boolBitwiseExp
    ;

ternaryExp: boolExp '?' pureExp ':' pureExp;

/* All expressions that produce a boolean as a result, this does also include comparisons of numbers
    (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html) */

boolExp
    :   boolIdentifierOrNumberBoolExp
    |   unaryBoolExp
    |   boolEqualityExp
    |   boolBitwiseExp
    |   logicalExp
    ;

unaryBoolExp
    :   '!' boolIdentifierOrNumberBoolExp
    ;

boolEqualityExp
    :   boolEqualityExp '==' boolExp
    |   boolEqualityExp '!=' boolExp
    |   boolIdentifierOrNumberBoolExp
    ;

boolBitwiseExp
    :   boolBitwiseExp '&' boolExp
    |   boolBitwiseExp '^' boolExp
    |   boolBitwiseExp '|' boolExp
    |   boolIdentifierOrNumberBoolExp
    ;

logicalExp
    :   logicalExp '&&' boolExp
    |   logicalExp '||' boolExp
    |   boolIdentifierOrNumberBoolExp
    ;

/* The atomic values of a boolean expression are either booleans, identifiers or number expressions that
    evaluate to a boolean */
boolIdentifierOrNumberBoolExp
    :   Bool
    |   Identifier
    |   numberBoolExp
    ;

/* All operators that compare numbers with each other and produce a boolean value
    Note that number boolean expressions are not allowed to evaluate recursively to prevent 1<1<1
    which would be a comparison between boolean and number */

numberBoolExp
    :   '(' numberBoolExp ')'
    |   relationalExp
    |   numberEqualityExp
    ;

relationalExp
    :   numberExp '<' numberExp
    |   numberExp '<=' numberExp
    |   numberExp '>=' numberExp
    |   numberExp '>' numberExp
    ;

numberEqualityExp
    :   numberExp '==' numberExp
    |   numberExp '!=' numberExp
    ;


/* All expressions that produce a number or as a result
    (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html) */

numberExp
    :   numberCharOrIdentifier
    |   '(' numberExp ')'
    |   postAndPrefixExp
    |   unaryNumberExp
    |   arithmeticExp
    |   shiftExp
    |   numberBitwiseExp
    ;

postAndPrefixExp
    :   Identifier '++'
    |   Identifier '--'
    |   '++' Identifier
    |   '--' Identifier
    ;

unaryNumberExp
    :   '~' numberExp
    |   '-' numberExp
    |   '+' numberExp
    ;

arithmeticExp
    :   arithmeticExp '*' numberExp
    |   arithmeticExp '/' numberExp
    |   arithmeticExp '%' numberExp
    |   arithmeticExp '+' numberExp
    |   arithmeticExp '-' numberExp
    |   numberCharOrIdentifier
    ;

shiftExp
    :   shiftExp '<<' numberExp
    |   shiftExp '>>' numberExp
    |   shiftExp '>>>' numberExp
    |   numberCharOrIdentifier
    ;

numberBitwiseExp
    :   numberBitwiseExp '&' numberExp
    |   numberBitwiseExp '^' numberExp
    |   numberBitwiseExp '|' numberExp
    |   numberCharOrIdentifier
    ;

/* All number expressions can be applied to a mixture of integers and char values therefore we
    need this pattern */
numberCharOrIdentifier
    :   Number
    |   Char
    |   Identifier
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
    TODO switch and do-while missing
    */
Class:'class';
Static:'static';
For:'for';
While:'while';
Do:'do';
If:'if';
Else:'else';
Return:'return';
This:'this';
New :'new';
Break:'break';
Continue:'continue';

/* A number: can be an integer value (decimal is disallowed)
    Number has to go on top of Digit otherwise the parser see's an JavaLetterOrDigit instead
    of a number and everything goes to hell*/
Number
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
    |   '\'\\u' Hex Hex Hex Hex '\''
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