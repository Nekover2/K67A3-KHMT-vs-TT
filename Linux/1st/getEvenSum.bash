getEvenIndexSum()
{
    sum=0;
    for((i=1 ; i<$# ; i= i+2)); do
            sum=$(( $[$i] + $sum ));
    done
    echo $sum;
}


getEvenIndexSum 1 2 3 4 5 6