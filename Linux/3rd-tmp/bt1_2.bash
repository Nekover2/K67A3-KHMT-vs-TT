#Biến trong awk sẽ là biến toàn cục, không cần khai báo kiểu dữ liệu, nó sẽ tự nhận kiểu dữ liệu phù hợp.
awk 'BEGIN{
    demDong=0;
}

{
    demDong++;
    arrData[demDong] = $a;    
}
END{
    print demDong;   
    for(val in arrData)
        if(val % 2 == 1)
            print arrData[val];
}' sinhvien.txt