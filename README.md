# Cool compiler 
 An implementation of the "Classroom Object-Oriented Language" compiler for compiler course in Shoubra faculty of engineering  
The files in this directory can get pretty messy, so here is a basic tour:
# Cool Lexer

This directory contains the classes and code for Lexical Analyzer phase. 
# Requirements 

 1. Install intelliJ IDEA.
 2. Install ANTLRv4. Please follow the quickstart guide [here](https://www.antlr.org/).
 3. Import antlr runtime jar.
 4. To connect intellij with ANTRL see this [video](https://www.youtube.com/watch?v=rCFMKUtN7rM&feature=emb_logo).
 5. Use your terminal to run the program.


# **Phase 1 : Lexer analyzer**

-   Firstly, create the Token file which contains all the tokens we want to compile and its possible values.
-   Right click and generate Antlr Recognizer.
-   Secondly, Create controller.java that will test the cool input using tokens and generated files
-   pass test cases file name (good.cl or bad.cl) as an argument to main.
-   If there's no errors, the program will output a sequence of tokens in a file called good.cl-lex, otherwise it will report errors with their line numbers.













