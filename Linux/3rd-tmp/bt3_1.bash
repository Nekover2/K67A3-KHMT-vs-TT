#!/bin/bash
# Lệnh split
# split([xâu nguồn], [mảng kq], "Ký tự phân cách");
# Trả về: số phần tử trong mảng kq
awk 'BEGIN{ print "Sau day la thong tin cac sinh vien trong lop K60A2 (Ho va ten)" }
{
    leng=split($2, arr, "_");
    arrlen = length(arr)
    print arr[1], " ", arr[arrlen]; 
}' test.txt