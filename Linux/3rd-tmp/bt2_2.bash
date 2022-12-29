# Mảng arrClass có chút đặc biệt, index của mảng ko phải là số mà là 1 xâu.
# Cách truy cập: lấy xâu đã gán cho dữ liệu để truy cập
# Tương tự map / Dictionrary
# mảng này có cấu trúc: arr[<Key>] = <Value>, trong đó key có thể là bất cứ thứ gì (từ biến, số nguyên, số thực);
# Thuât toán: nếu mảng chưa chứa lớp => tạo 1 phần tưr có key là tên lớp, value (có thể có bất cứ thứ gì vào).
# Nếu mảng có phần từ có key là tên lớp rồi => ghi đè vào mảng
# @params 
# soSv      Số sinh viên đc liệt kê trong file
# arrClass  Mảng chứa số lượng sinh viên trong từng class (Cột thứ 3)
# queQuan   Mảng chứa số lượng sinh viên ở cùng một tỉnh (Cột thứ 4)
# max       Điểm cao nhất
# maxP      Sinh viên có điểm cao nhất
awk 'BEGIN{
    soSv=0;
}

{
    soSv++;
    arrClass[$3]++;
    queQuan[$4]++;
    if($5>max) 
    {
        max=$5
        maxP=$h;
    };
}
END{
    print "Tong so sinh vien: ", soSv;

    print "Tong so lop: ",length(queQuan);

    print "THONG KE (theo que quan):"
    printf "%20s%20s\n", "Que quan", "So luong";
    for(name in quequan)
    {
        printf "%20s%20s\n", name, quequan[name]; 
    }

    print "Thong ke so SV theo lop:"
    for(name in arr)
        printf "%20s%20s\n", name, arrClass[name];
     
    print "Thong tin cua sinh vien co diem cao nhat:\n"
    print "           " , maxP;
}' sinhvien.txt