#!/bin/bash

sum()
{
    kq=0;
    for i in $*
    do
        kq=`expr $kq + $i`;
    done
    echo $kq;
}
sumEven()
{
    kq=0;
    for i in $*
    do
    if [ `expr $i % 2` -eq 0 ]; then
        kq=`expr $kq + $i`;
    fi
    done
    echo $kq;
}
sumNew()
{
    kq=0;
    for (( i = 1; i <= $#; i+=2 )); do
        kq=`expr $[$i] + $kq`;
    done
    for (( i = 2; i <= $#; i+=2 )); do
        kq=`expr $kq - $[$i]`;
    done
    echo $kq;
}
tong=$(sum $*)
echo "sum: $tong"
tong=$(sumEven $*)
echo "sumEven: $tong"
tong=$(sumNew $*)
echo "sumNew: $tong"
