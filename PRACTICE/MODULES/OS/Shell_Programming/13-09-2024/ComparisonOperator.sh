#!/bin/bash

a=4;
b=7;
c=4;
d=0;

<<A


less than		-lt
greater than		-gt
greater than equals	-ge
less than equals	-le
equals			-eq
not equals		-ne

A

#--------------------------------------

if [ $a -gt 0 ]; then
	echo "hello"
fi

#--------------------------------------

if [ $a -gt $b ]; then
	echo "$a (a) is greater..";
elif [ $b -gt $a ]; then
	echo "$b (b) is greater..";
fi

#--------------------------------------

if [ $a -lt $b ] && [ $b -gt $c ]; then
	echo "first check win's";
else
	echo "second check win's";
fi

#--------------------------------------

if [ $a -gt $b ] && [ $b -gt $c ]; then
	echo "first check win's";
elif [ $c -gt $d ] || [ $a -lt $b ]; then
	echo "second check win's";
fi

#--------------------------------------

if [ $a -gt $b ] && [ $b -gt $c ]; then
	echo "first check win's";
elif [ $c -lt $d ] && [ $a -lt $b ]; then
	echo "second check win's";
else
	echo "no check win's";
fi

