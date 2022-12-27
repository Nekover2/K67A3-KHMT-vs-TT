getAve()
{
    sum=0;
    for val in $* ; do
        sum=$(( $sum + $val ));
    done
    Ave=$(echo "scale = 2 ; $sum/$#" | bc )
    echo $Ave;
}
