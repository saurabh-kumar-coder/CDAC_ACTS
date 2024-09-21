#!/bin/bash

counter=1;

while [ $counter -lt 10 ] 
do
	echo "value of counter is : $counter";
	counter=$((counter+1));
done

counter=1;
echo $counter
while [ $counter -lt 10 ] 
do 
	if [ $((counter%2)) -eq 0 ]; then
		echo "$counter is divisible by 2";
	else 
		echo "$counter is not divisible by 2";
	fi
	counter=$((counter+1));
done
