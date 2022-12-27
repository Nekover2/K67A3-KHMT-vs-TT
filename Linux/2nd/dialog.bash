sum()
{
    echo $(($1+$2));
}
dialog --title "Info: Enter nums" --backtitle "Nhap vao so can cong" --inputbox "Enter 2 nums below: " 7 50 2>/tmp/input.$$;
nums=$(cat /tmp/input.$$);
sum=$(sum $nums)
dialog --title "Result" --backtitle "Info" --infobox "Sum of 2 num is: $sum\nPress enter to continue..." 7 50; read;

rm -f /tmp/input.$$