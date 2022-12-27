BEGIN{
    total=0;
    max=0;
}

{
    if(nhommau[$4]=="") nhommau[$4]=0;
    nhommau[$4]=nhommau[$4]+$3;
    total=total+$3;
    if(sv[$2]=="") sv[$2]=0;
    sv[$2]=sv[$2]+$3;
    if($3>max)
    {
        max=$3;
        maxP=$p;
    }
}

END{
    print "Tong so mau da hien: " total;
    print "Cac nhom mau kha dung:"
    for( mau in nhommau )
        printf "%s  ", mau;
    print "";
    print "Tong so mau theo loai:";
    printf "%20s%20s\n", "Nhom mau", "So luong";
    for( mau in nhommau )
        printf "%20s%20s\n", mau, nhommau[mau];
    cnt=1;
    print "Danh sach hien mau cua cac sinh vien:"
    printf "%4s%30s%12s\n", "STT", "Ten SV", "Luong mau";
    for( sinv in sv )
    {
        printf "%4s%30s%12s\n", cnt, sinv, sv[sinv];
        cnt++;
    }
    print "Sinh vien da hien mau nhieu nhat:";
    print maxP;
}