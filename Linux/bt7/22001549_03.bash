ktngto()
{
    _TmpNum=$1;
    if [[ _TmpNum -gt 1 ]]; then
        i=2;
        while [[ i -lt _TmpNum ]]; do
            if [[ $((_TmpNum%i)) -eq 0 ]]; then
                i=$((_TmpNum+1));
            else
                i=$((i+1))
            fi
        done
        if [[ i -eq _TmpNum ]]; then
            echo " $_TmpNum ";
        fi
    fi
}

kthoanhao()
{
    _TmpNum=$1;
    if [[ _TmpNum -gt 0 ]]; then
        i=1;
        sum=0;
        while [[ i -lt _TmpNum ]]; do
            if [[ $((_TmpNum%i)) -eq 0 ]]; then
                sum=$((sum+i));
            fi
                i=$((i+1))
        done
        if [[ sum -eq _TmpNum ]]; then
            echo -n " $_TmpNum ";
        fi
    fi
}

echo -n "list of prime num: ";
for (( i = 1; i <= $#; i++ )); do
    if [[ $(ktngto $[$i]) ]]; then
        echo -n "$(ktngto $[$i])";
    fi
done
echo "";
echo -n "list of perfect num: ";
for (( i = 1; i <= $#; i++ )); do
    if [[ $(kthoanhao $[$i]) ]]; then
        echo -n "$(kthoanhao $[$i])";
    fi
done