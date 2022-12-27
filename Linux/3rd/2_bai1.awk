BEGIN{
    cnt=0;
}

{
    cnt = cnt+1;
    arr[cnt]= $a;
}

END{
    printf "Tong so dong: %d\n" , cnt;
    for( i=1;i<=cnt;i=i+2)
        print arr[i];
}