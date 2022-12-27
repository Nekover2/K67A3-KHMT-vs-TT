getMin()
{
    _Min=$1;
    for val in $* ; do
        if [[ val -lt _Min ]] ; then
            _Min=$val;
        fi
    done
    echo $_Min
}

getMax()
{
    _Max=$1;
    for val in $* ; do
        if [ $val -gt $_Max ] ; then
            _Max=$val;
        fi
    done
    echo $_Max
}