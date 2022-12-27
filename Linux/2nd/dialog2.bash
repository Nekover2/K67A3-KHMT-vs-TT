findMaxChar()
{
    tmp=$1;
    max=0;
    while [[ $tmp -gt 0 ]]; do
        char=$(( $tmp % 10 ));
        tmp=$(( $tmp / 10 ));
        if [[ $char -gt $max ]]; then 
            #echo $char
            max=$char; 
        fi
    done
    echo $max;
}
dialog --title "Info: Enter nums" --backtitle "Nhap vao so can cong" --inputbox "Enter num below: " 7 50 2>/tmp/input.$$;
num=$(cat /tmp/input.$$);
maxg=$(findMaxChar $num)
dialog --title "Result" --backtitle "Info" --infobox "Max char is: $maxg\nPress enter to continue..." 7 50; read;

rm -f /tmp/input.$$