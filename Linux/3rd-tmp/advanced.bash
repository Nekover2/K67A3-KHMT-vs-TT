#Biến trong awk sẽ là biến toàn cục, không cần khai báo kiểu dữ liệu, nó sẽ tự nhận kiểu dữ liệu phù hợp.
# @params
# 
awk 'BEGIN{
    total=0;
    max=0;
}

{
    if($3>max)
    {
        max=$3;
        total=1;
        arrMax[total] = $a;
    }
    else if($3 == max)
    {
        total++;
        arrMax[total] = $a;
    }
}

END{
    for(key in arrMax)
        print arrMax[key];
}' danh_sach_hien_mau.txt