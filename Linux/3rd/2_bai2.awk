BEGIN{
    cnt=0;
    max=0;
}

{
    cnt++;
    if(quequan[$4]=="")
    {
        quequan[$4]=0;
    }
    if(arr[$3]=="")
    {
        arr[$3]=0;
    }
    arr[$3]++;
    quequan[$4]++;
    if($5>max) 
    {
        max=$5
        maxP=$h;
    };
}

END{
    print "Tong so sinh vien: ", cnt;
    print "Tong so lop: ",length(quequan);
    print "THONG KE (theo que quan):"
    printf "%20s%20s\n", "Que quan", "So luong";
    for(name in quequan)
    {
        printf "%20s%20s\n", name, quequan[name]; 
    }
    print "Thong ke so SV theo lop:"
    for(name in arr)
        printf "%20s%20s\n", name, arr[name]; 
    print "Thong tin cua sinh vien co diem cao nhat:\n"
    print "           " , maxP;
}