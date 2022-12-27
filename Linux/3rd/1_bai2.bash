awk 'BEGIN{
    print "Ho cua cac hoc sinh trong lop: "
}

{
    print substr($2, 0, index($2, "_")-1);
}
ENND ' $1;