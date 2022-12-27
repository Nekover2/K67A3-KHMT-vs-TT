getAve()
{
    sum=0;
    for val in $* ; do
        sum=$(( $sum + $val ));
    done
    Ave=$(echo "scale = 2 ; $sum/$#" | bc )
    echo -n "Average: "
    echo $Ave;
}

getSum()
{
    sum=0;
    for i in $*; do
        sum=$((sum+i));
    done
    echo "Sum: $sum";
}

getMin()
{
    _Min=$1;
    for val in $* ; do
        if [[ val -lt _Min ]] ; then
            _Min=$val;
        fi
    done
    echo "Min: $_Min"
}

getMax()
{
    _Max=$1;
    for val in $* ; do
        if [ $val -gt $_Max ] ; then
            _Max=$val;
        fi
    done
    echo "Max: $_Max"
}

getOddSum()
{
    sum=0;
    for val in $* ; do
        if [ $(($val % 2)) -ne 0 ]; then
            sum=$(( $sum + $val ));
        fi
    done
    echo "Odd sum: $sum;"
}

getEvenIndexSum()
{
    sum=0;
    for((i=1 ; i<$# ; i= i+2)); do
            sum=$(( $[$i] + $sum ));
    done
    echo "Even indexes Sum: $sum;"
}

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
        echo -n "List of prime num: "
        for res in ${arr[@]}; do
            echo -n "$res ";
        done
    fi
    echo ""
}

listCP()
{
    arr[0]=-1;
    cNum=0;
    for val in $*; do
    if [[ $val -gt 2 ]]; then
        tmp=$(echo "sqrt($val)" | bc);
        if [[ $(( tmp*tmp )) -eq $val ]]; then
            arr[$cNum]=$val;
            cNum=$(( $cNum + 1 ));
        fi
    fi
    done

    if [[ arr[0] -eq -1 ]]; then
        echo "No num found!"
    else
        echo -n "List of CP num: "
        for val in ${arr[@]}; do
            echo -n "$val ";
        done
    fi
    echo "";
}


read -p "Enter nums: " Str;

getSum $Str;

getMin $Str;

getMax $Str;

getAve $Str;

getOddSum $Str;

getEvenIndexSum $Str;

listCP $Str;

listPrime $Str;