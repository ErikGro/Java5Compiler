grammar Exp;

/* This will be the entry point of our parser. */
eval
    :   exp
    | statement
    ;

statement
    :   methodCallStatement ';'
    |   newStatement ';'
    |   assignmentStatement ';'
    ;

/* These are statement expressions defined statements they require a semicolon at the end */
methodCallStatement
    :   Identifier '.' Identifier '(' pureExp? ')'
    |   Identifier '.' Identifier '(' (pureExp ',')+ pureExp ')'
    ;

newStatement
    :   'new' Identifier '(' pureExp? ')'
    |   'new' Identifier '(' (pureExp ',')+ pureExp ')'
    ;

assignmentStatement
    :   (Identifier '=')+ pureExp
    ;

exp
    :   methodCallExp
    |   newExp
    |   assignmentExp
    |   pureExp
    ;

/* These are statement expressions but defined as expressions so we can use them without the semicolon
    as method arguments, etc. */
methodCallExp
    :   Identifier '.' Identifier '(' exp? ')'
    |   Identifier '.' Identifier '(' (exp ',')+ exp ')'
    ;

newExp
    :   'new' Identifier '(' exp? ')'
    |   'new' Identifier '(' (exp ',')+ exp ')'
    ;

assignmentExp
    :   (Identifier '=')+ exp
    ;

/* Pure expressions are all expressions that are not statements at the same time */
pureExp
    : '(' pureExp ')'
    |   postAndPrefixExp
    |   unaryExp
    |   arithmeticExp
    |   shiftExp
    |   relationalExp
    |   equalityExp
    |   bitwiseExp
    |   logicalExp
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
    Note that number boolean expressions are not allowed to evaluate recursively because to prevent 1<1<1
    which be a comparison between boolean and a number*/

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

/* A number: can be an integer value (decimal is disallowed)
    Number has to go on top of Digit otherwise the parser see's an JavaLetterOrDigit instead
    of a number and everything goes to hell*/
Number
    :    Digit+
    ;

/* An identifer is a class name, method name or field that does not match a keyword
    (https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.8)
    TODO Exclude keywords from pattern
    */
Identifier
    :   IdentifierChars
    ;


IdentifierChars
    :   JavaLetter JavaLetterOrDigit*
    ;

JavaLetterOrDigit
    : JavaLetter|Digit
    ;

Digit
    : [0-9]
    ;

/* TODO This should include all unicode characters per specification. Is this required for the task?
*/
JavaLetter
    :   [a-zA-Z_$]
    ;

/* Keywords per java specification that are relevant to our task
    (https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.9)
    TODO switch and do-while missing
    */
KeyWord
    :   'public'
    |   'private'
    |   'static'
    |   'for'
    |   'while'
    |   'if'
    |   'else'
    |   'return'
    |   'void'
    |   'int'
    |   'char'
    |   'boolean'
    |   'this'
    |   'new'
    |   'break'
    |   'continue'
    |   Bool
    ;

/* A boolean value true or false */
Bool
    :   'true'
    |   'false'
    ;

/* A character value
    TODO Escape chars (\t, \n,...) and unicode values (\u0000,...)
    */
Char
    :   '\'' [ a-zA-Z0-9] '\''
    ;

/* We're going to ignore all white space characters */
WS
    :   (' ' | '\t' | '\r'| '\n') -> channel(HIDDEN)
    ;