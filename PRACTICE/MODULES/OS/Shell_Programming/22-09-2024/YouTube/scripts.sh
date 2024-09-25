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

<<A
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
#to slice a string
#${strVar:<starting_point>:<how_many_characters>}
echo "After slice ${strVar:6:10}";
A

#--------------------USER INTERACTIONS-----------------
#taking data from user.
#read <var_name>;
#read -p "Your name : " NAME;
<<A
echo "What is your name? ";
read name;
echo "My Name is : ${name}";
A
<<A
read -p "What is your name? " name;
echo "Your name is : ${name}";
A

#---------------ARITHMATIC OPERATIONS------------
#use 'let' keyword & '$(())'  everytime.

<<A

x=20;

y=10;
let mul=$x*$y;
echo "Multiplication Value is : ${mul}";

let add=$x+$y
echo  "Addition Value is : ${add}";

echo "subtracted value is : $
(($x-$y))";

echo "divided value is : $
(($x/$y))"; #gives integer value result always.

A

#-----------if-else condition-----------
<<A
	#syntax format
	if [ $marks -gt 40 ]
	then,
		echo "Hello";
	else
		echo "Bye";
	fi
A

<<A
read -p "enter your marks : " marks;
if [ $marks -gt 40 ];
then
	echo "Pass";
else 
	echo "Fail";
fi
A

<<A
read -p "Enter your age : " age;
if [[ $age -gt 18 ]]
then
	echo "able to vote";
else 
	echo "not able to pass";
fi
A

<<A
#-----------operators----------
equal 			-> -eq / ==
greaterThanOrEqual 	-> -ge
lessThanOrEqual 	-> -le
Not equal 		-> -ne
greaterThan 		-> -gt
lessThan 		-> -lt
A

<<A
read -p "enter your marks : " marks;
if [ $marks -gt 80 ];
then
	echo "First Division";
elif [ $marks -ge 60 ];
then
	echo "second division";
else
	echo "Fail";
fi
A
<<A
#-------------CASE STATEMENT-------------
echo "choose an option";
echo "a) To see the current date"
echo "a) List all files in current dir"

read choice

case $choice in
	a) date;;
	b) ls;;
	*) echo "Not a valid input";
esac
A
<<A
#----------Ternary Operator----------
#syntax
age=18;
[[ $age -ge 18 ]] && echo "Adult" || echo "Minor"
A

#----------Loops-----------
<<A
#--for loop 1
for i in 1 2 3 4 5 6 7 8 9 0
do
	echo "number is $i";
done
### using string
for i in 1 2 3 four 5 6 great 8 name 0
do
	echo "number is $i";
done
### using wild card
for i in {1..5}
do
	echo "number is : $i";
done
A
#--for loop 2
### using file
<<A
FILE="/home/saurabh/Desktop/CDAC_ACTS/PRACTICE/MODULES/OS/Shell_Programming/22-09-2024/YouTube/commands.txt";

for name in $
(cat $FILE) 
do
	echo "text is : $name";
done

A

### using array
<<A
myArray=( 1 2 4 5 6 7 )
length=${#myArray[*]}
echo "${length}";
for (( i=0;i<$length;i++ ))
do
	echo "Value of array is : ${myArray[$i]}";
done
A

<<A
#---------While loop---------
count=0;
num=10;
while [ $num -gt $count ]
do
	echo "num is : $num";
	let num--;
done
A

<<A
#-------Until loop-----------
# jb tk condition true nahi ho jati tb tk chalega
a=10;
until [ $a -eq 1 ]
do
	echo $a
	let a--;
done
A

<<A
#-----read file using while loop-----
FILE="/home/saurabh/Desktop/CDAC_ACTS/PRACTICE/MODULES/OS/Shell_Programming/22-09-2024/YouTube/commands.txt"

while read txt
do
	echo "$txt"
done < $FILE
A

<<A
#----To read content from a CSV file------
# f1, f2, f3, f4 are column.
while IFS="," read f1 f2 f3 f4
do
	echo $f1;
	echo $f2;
	echo $f3;
	echo $f4;
done < file.csv
A

#-------------FUNCTIONS-------------
#Syntax
<<A
	function myFun {
		echo "hi";
	}
#-------OR----
	myFun() {
		echo "hi";
	}
#calling a function
# ->	myFun
A
<<A
addition() {
	local num1=$1;
	local num2=$2;
	let sum=$num1+$num2;
	echo "sum is $sum";
}
addition 12 11;
A

#------command line arguments
<<A
echo "first arg : $1"
echo "Second arg : $2"
echo "All the argument are : $@";
echo "Number of argument are : $#";
A

<<A
###loop on cmd line arg
for cmd in $@
do
	echo "data is : $cmd";
done
A

<<A
#-------Break-------
a=10;
until [ $a -eq 1 ]
do
	if [ $a -eq 5 ]
	then
		echo "$a is found"
		break;
	fi
	echo "Number is $a";
	let a--;
done
A

<<A
a=10;
until [ $a -eq 1 ]
do
	let r=$a%2;
	if [ $r -eq 0 ]
	then
		echo "$a is even"
		let a--;
		continue;
	fi
	echo "Number is $a";
	let a--;
done
A

#----------RANDOM----------
<<A
NO=$(( $RANDOM%6 + 1))
echo "Number is $NO";
A

<<A
#-----------> & >> operator-----
# > is used to create a new file and write into it.

date > date.txt; 
ls > fileName.txt;

# >> is used to append data into the file.

date >> data.txt;
ls >> data.txt;
A
