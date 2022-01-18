grammar JavaFiveGrammar;

/* This will be the entry point of our parser. */
javaProgram
    :   clazz
    |   method
    |   field
    |   statement
    |   exp
    ;

clazz
    :   AccessModifier Class Identifier '{' field* method* '}'
    ;

method
    :   AccessModifier Static? type Identifier '(' (type Identifier (',' type Identifier)*)? ')' blockStatement
    ;

field
    :   AccessModifier Static? localVarDeclarationStatement ';'
    ;

/* Keep in mind that statements are only whithin a block are enforced to have semicolon at the end because
    we also want to use them in a for loop for example */
statement
    :   ifStatement
    |   switchStatement
    |   whileStatement
    |   dowhileStatement
    |   forStatement
    |   blockStatement
    |   localVarDeclarationStatement
    |   returnStatement
    |   methodCallExp
    |   newExp
    |   localVarDeclarationStatement
    |   Identifier '++' // Can also use them as a statement... (these guys are everywhere!!)
    |   Identifier '--'
    |   '++' Identifier
    |   '--' Identifier
    |   Continue
    |   Break
    ;

/* Note that the precedence of the rules is important otherwise the blocks of the if will not be
    recognized as the body!!! (same applies for the while and for loop)
    */
ifStatement
    :   If '(' exp ')' (';'|(blockStatement (Else (ifStatement|blockStatement))?))?
    |   If '(' exp ')' statement';' Else statement ';'
    ;

switchStatement
    :   Switch '(' exp ')' '{'  (Case exp ':' statement*)*
                    (Default ':' statement*)*
                    (Case exp ':' statement*)* '}'
    ;

whileStatement:     While '(' exp ')' (blockStatement|';'|statement ';')?;

dowhileStatement:   Do (statement? ';'|blockStatement) While '(' exp ')';

/*
    TODO "for(new A(), new A();; new A(), new A())" is not possible
    */
forStatement:   For '(' statement? ';' exp? ';' statement? ')' (blockStatement|';'|statement';')?;

/*
    TODO int a = 0 = 0 is not possible, should this check the parser or semantic analysis ???? */
localVarDeclarationStatement
    :   type Identifier ('=' exp)? (',' Identifier ('=' exp)?)*
    ;

/* Conditionals, loops (except do-while) and blocks are not enforced to have a semicolon at the end because
    they have their own rules.
    Do-while is an exception because it always needs a semicolon after the while.
    */
blockStatement
    :   '{' (ifStatement|switchStatement|whileStatement|forStatement|blockStatement|statement ';')* '}'
    ;

returnStatement
    :   Return exp?
    ;

/* Primitive type or some class type */
type
    :   Primitive
    |   Identifier
    ;

/* New alternative definition of expressions which is simpler since the prior version did some slight type
    checking (see commented out definitions) */
exp
    :   (Int|Char|Bool|Identifier)
    |   exp '++'
    |   exp '--'
    |   '++' exp
    |   '--' exp
    |   '+' exp
    |   '-' exp
    |   '~' exp
    |   '!' exp
    |   exp '*' exp
    |   exp '/' exp
    |   exp '%' exp
    |   exp '+' exp
    |   exp '-' exp
    |   exp '<<' exp
    |   exp '>>' exp
    |   exp '>>>' exp
    |   exp '<' exp
    |   exp '<=' exp
    |   exp '>=' exp
    |   exp '>' exp
    |   exp '==' exp
    |   exp '!=' exp
    |   exp '&' exp
    |   exp '^' exp
    |   exp '|' exp
    |   exp '&&' exp
    |   exp '||' exp
    |   exp '?' exp ':' exp
    |   exp '=' exp
    |   exp '+=' exp
    |   exp '-=' exp
    |   exp '*=' exp
    |   exp '/=' exp
    |   exp '%=' exp
    |   exp '&=' exp
    |   exp '^=' exp
    |   exp '|=' exp
    |   exp '<<=' exp
    |   exp '>>=' exp
    |   exp '>>>=' exp
    |   methodCallExp
    |   newExp
    ;

methodCallExp
    :   (This|Identifier) '.' Identifier ('.' Identifier)* '(' (exp (',' exp)*)? ')'
    ;

newExp
    :   New Identifier '(' exp? ')'
    |   New Identifier '(' (exp ',')+ exp ')'
    ;

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