listPrime()
{
    currIndex=0;
    arr[0]=-1;
    for val in $*; do
        if [[ $val -gt 1 ]]; then
            flag=true;
            for (( j = 2; j <= val/2; j++ )); do
                if [ $(( $val % $j )) -eq 0 ]; then
                    flag=false;
                fi
            done
            if $flag ; then
                arr[$currIndex]=$val;
             currIndex=$(( $currIndex + 1))
            fi
        fi
    done
    if [[ arr[0] -eq -1 ]]; then
        echo "No prime num found!";
    else
        for res in ${arr[@]}; do
            echo -n "$res ";
        done
    fi
    echo ""
}
