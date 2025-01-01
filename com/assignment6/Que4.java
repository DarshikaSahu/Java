package com.assignment6;

// Q4 Write a program that accept string as command line argument and generate
// the output in specific way
// Example if two
// command line argument are wipro and bangalore then the output generated should be
// wipro technology bangalore 
// If the argument
// are ABC and Mumbai then output should be ABC technology mumbai
//demonstrate command line argument
//javac CmdExample.java  --> bytecode
//java CmdExample
//java CmdExample Cdac Noida India 
//to pass value through eclipse
//run--> run configuration --> select filename --> Argument  ---   ---- run 
public class Que4 {

    public static void main(String[] args) {

        System.out.println(args[0] + " technology " + args[1]);

    }

}
