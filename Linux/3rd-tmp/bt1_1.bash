#!/bin/bash
# Cấu trúc lệnh awk (bash): awk + [xâu chứa câu lệnh khi đọc file] [tên file]
#Xâu chứa câu lệnh gồm 3 phần chính: BEGIN {} , {} , END{}
# Khi thực thi, trướckhi đọc file, awk sẽ thực thi câu lệnh trong khối BEGIN trước xong rồi mới đọc file.
# {} : Mỗi dòng (Có dữ liệu) trong file, awk sẽ thực thi khối lệnh này một dòng => Có n dòng trong file => awk thực thi lệnh trong cặp dấu {} n lần
# END{}: Khi đọc file xong, awk sẽ thực thi lệnh trong khối END
# Mọi câu lệnh thường thấy trong awkddeeuf gần giống vs java, (VD: i++, các vòng for, if, case)
#BEGIN Chạy khi awk bắt đầu đọc file
awk 'BEGIN{
    print "Diem trung binh"
}

{
    sum = $3+$4+$5;
    avg = sum/3;
    printf "%s %.1f\n", $2, avg;
}

END{
    print "Ket thuc"
}' test.txt

#Quy ước trong printf: %s: Xâu (String) %d: Số nguyên, %f (Số thực, %.1f) 
