#!/bin/bash

# getting the file name of the current file.
echo "this is the script...$0..."

# getting the current shell process number.
echo "current shell process number...$$..."

# fetch the arguments from the shell command :
# bash ./variables.sh saurabh
echo "My First name is : ..$1.."

#+++++++++++++++++++++++++++++++++++++++++++

echo "------------GLOBAL VARIABLES-------------------"
# getting username
echo "$USER"

# getting HOSTNAME
echo "$HOSTNAME"

# getting PATH
echo "$PATH"

# getting PWD
echo "$PWD" 

# getting home
echo "$HOME" 

# getting language
echo "$LANG" 

#getting editor
#echo "$EDITOR"

# getting UID  
echo "$UID" 

# getting shell type
echo "$SHELL"

#++++++++++++++++++++++++++++++++++++++++++++++++++++++
echo "------------LOCAL VARIABLES-------------------"

var="saurabh"
echo "var value is : $var"

let a=10
echo "value of a is : $a"

# gives output as 0 because 'let' is used for numeric datas
let b="sau"
echo "value of b is: $b"

c=False
echo "value of c is: $c"
