listCP()
{
    arr[0]=-1;
    cNum=0;
    for val in $*; do
        tmp=$(echo "sqrt($val)" | bc);
        if [[ $(( tmp*tmp )) -eq $val ]]; then
            arr[$cNum]=$val;
            cNum=$(( $cNum + 1 ));
        fi
    done

    if [[ arr[0] -eq -1 ]]; then
        echo "No num found!"
    else
        for val in ${arr[@]}; do
            echo -n "$val ";
        done
    fi
    echo "";
}
