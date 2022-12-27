#!/bin/bash
_Num=0;
if [[ $# -eq 0 ]]; then
    read -p "Nhap n: " _Num;
else _Num=$1;
fi

giaithua1()
{
    kq=1;
    _Cnum=$1;
    if [[ $(( $_Cnum%2 )) -eq 0 ]]; then
        for (( i = 2; i <= _Cnum; i+=2 )); do
            kq=$(( $kq*$i ));
        done
    else
        for (( i = 1; i <= _Cnum; i+=2 )); do
            kq=$(( $kq*$i ));
        done
    fi
    echo $kq;
}

_Res=0;

for (( i = 1; i <= _Num ; i++ )); do
    _tmp=$(giaithua1 $i);
    _Res=`expr $_Res + $_tmp`;
done

echo $_Res;
