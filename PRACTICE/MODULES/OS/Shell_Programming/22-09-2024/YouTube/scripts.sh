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

readonly PI=3.14;
echo "value of PI is : $PI";
A

#----------Array-----------
<<A
	defining a array
	myArray=( 1 2 Hello "Hello World");
A
<<A
myArray=( 1 20 32.5 Hello "Hey Bro");
echo "value of 3rd index : ${myArray[3]}";
#to print each element in an array.
echo "all element in array are : ${myArray[*]}";
#get length of an array
echo "length of array myArray is : ${#myArray[*]}";
#get a particular range of values:
echo "value from 2 to 4 (2, 3, 4) are : ${myArray[*]:2:3}";
#update an array
myArray+=( pooh 30 05);
echo "Updated array is : ${myArray[*]}"
#key value pair of an array.
declare -A newArray
newArray=( [name]=Saurabh [age]=12 [address]="Pitam Pura" );
echo "new array is : ${newArray[*]}";
#get using key from array
echo "name is : ${newArray[name]}";
A

#---------String Operations---------
#creating a string variable.
strVar="Hello welcome to this course. Are you enjoying??";
strVarLength=${#strVar};
echo "string taken is : ${strVar}";
echo "length of strVar is : ${strVarLength}";
#printing string in upper case:
echo "upper case string : ${strVar^^}";
#printing string in lower case:
echo "lower case string : ${strVar,,}";

#	replacement in the string:
#	${myString/first/second};
#	myString : string name
#	first : value to be removed
#	second : value to be placed

newVar=${strVar/Hello/Hello,}
echo "New Var is : ${newVar}";

#Slicing in a string
#based on indexing
#getting a particular data from string
newVar=${newVar:2:5};
echo "New Var is : ${newVar}";
