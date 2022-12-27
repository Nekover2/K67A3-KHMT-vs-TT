getOddSum()
{
    sum=0;
    for val in $* ; do
        if [ $(($val % 2)) -ne 0 ]; then
            sum=$(( $sum + $val ));
        fi
    done
    echo $sum;
}
