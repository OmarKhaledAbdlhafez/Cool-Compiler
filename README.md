# Cool compiler 
 An implementation of the "Classroom Object-Oriented Language" compiler for Compilers course in Shoubra Faculty of Engineering.  
The files in this directory can get pretty messy, so here is a basic tour:
# Cool Lexer
 
This directory contains the classes and code for Lexical Analyzer phase. 

# Cool Parser
 
This directory contains the classes and code for Parese Tree phase. 
# Requirements 

 1. Install intelliJ IDEA.
 2. Install ANTLRv4. Please follow the quickstart guide [here](https://www.antlr.org/), or you can simply install ANTLR from IDEA's plugin manager. 
 3. Import antlr runtime jar.
 4. To connect intellij with ANTRL see this [video](https://www.youtube.com/watch?v=rCFMKUtN7rM&feature=emb_logo).
 5. Use your terminal to run the program.


# **Phase 1 : Lexer analyzer**

-   First, create the Token file which contains all the tokens we want to compile and its possible values.
-   Press right click and click generate Antlr Recognizer.
-   Second, Create controller.java that will test the cool input using tokens and generated files
-   Pass the test cases files named (good.cl or bad.cl) as an argument to main.
-   If there are no errors, the program will output a sequence of tokens in a file called good.cl-lex, otherwise it will report errors with their line numbers.


# **Phase 2 : Parse Tree**

-   First, create the Token file which contains all the tokens we want to compile and its possible values.
-   create the grammer file and import the token file in it and put all the cool relues  
-   Press right click and click generate Antlr Recognizer.
-   Second, Create controller.java that will test the cool input using tokens and generated files
-   create the ParseErrorListener class in which you can listen for sentax error 
-   Pass the test cases files named (good.cl or bad.cl) as an argument to main.
-   If there are no errors, the program will output a sequence of tokens in a file called good.cl-lex and will write the parse tree in
the  good-cst file 
-   otherwise it will report errors with their line numbers .












