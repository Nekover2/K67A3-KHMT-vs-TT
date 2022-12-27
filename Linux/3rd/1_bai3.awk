BEGIN {
    print "INFO";
    print "Ho               Ten:";
}
{
    n=split($2, arr, "_")
    printf "%12s%12s\n", arr[1], arr[n];
}