#!/bin/bash
#Lệnh index
# Cấu trúc : index([Xâu], [Xâu cần tìm kiếm trong xâu thứ nhất]);
# Trả về: chỉ số của xâu/ký tự ta cần tìm kiếm (bắt đầu từ 1), trả về 0 nếu ko tìm thấy
# VD: index(tmp, " ") => Tìm kiếm ký tự " " trong xâu tmp.
# Substr :
# Cấu trúc: substr([Xâu cần lấy], [chỉ số phần tử thứ nhất trong xâu], [chỉ số phần tử cuối]);
# Trả về: xâu con.
awk '{
    tmp=$2;
    print substr(tmp, 1, index(tmp,"_")-1);
}' test.txt