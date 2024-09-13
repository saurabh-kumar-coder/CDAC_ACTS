a=4;
b=7;
c=4;
d=0;

addition=`expr $a + $b`;
echo "addition of a and b is : $addition"

subtraction=`expr $a - $b`;
echo "sutbtraction of a and b is : $subtraction"

let sum=a+b
echo "sum is : $sum";

total=$((a+b))
echo "total is : $total";

let count=1;
echo `expr $count + 1`;
count=$count+1;
$((count++))
