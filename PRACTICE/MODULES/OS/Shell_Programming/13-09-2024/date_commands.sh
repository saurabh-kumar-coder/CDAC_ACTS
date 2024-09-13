#!/bin/bash

<<A
	Fri 13 Sep 2024 05:39:16 AM PDT
A
date


<<A
	Today is Friday, 09/13/24 September 2024
A
date +"Today is %A, %D %B %Y"


<<A
	Today is Fri, 13 Sep 24
A
date +"Today is %a, %d %b %y"

<<A
	to get only day.
	Friday
A
date +%A

<<A
	today's day 
	09/13/24
A
date +%D

<<A
	to get current year
	2024
A
date +%Y

<<A
	To print current month
	September
A
date +%B

<<A
	to print current month
	Sep
A
date +%b

<<A
	to get time
	06:20:48
A
date +%T

<<A
	to get current hour
	06
A
date +%H

<<A
	to get current minute
	20

A
date +%M

<<A
	to get current seconds
	48
A
date +%S

