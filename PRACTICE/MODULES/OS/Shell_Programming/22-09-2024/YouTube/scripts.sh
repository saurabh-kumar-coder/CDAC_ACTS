#!/bin/bash

# printing hello using echo
<<A
echo "Hello";
A

<<A
# variables
a=10;
name="Prashant";
age=23
echo "a $a";
echo "$a -> $name -> $age";
name="Puppy Bhai";
echo "name updated to $name";

hostName=$(hostname);
WHOAMI=$(whoami);
echo "$hostName";
echo "$WHOAMI"
A

readonly PI=3.14;
echo "value of PI is : $PI";
