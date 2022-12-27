isPalin()
{
s=0
rev=""
temp=$num
  
while [ $num -gt 0 ]
do
    s=$(( $num % 10 )) 
     
    num=$(( $num / 10 ))
     
    rev=$( echo ${rev}${s} )
done
  
if [ $temp -eq $rev ];
then
    echo "Number is palindrome"
else
    echo "Number is NOT palindrome"
fi
}
dialog --title "Info: Enter num" --backtitle "Nhap vao so can kiem tra..." --inputbox "Enter num below: " 7 50 2>/tmp/input.$$;
num=$(cat /tmp/input.$$);
res=$(isPalin $num)
dialog --title "Result" --backtitle "Info" --infobox "$res\nPress enter to continue..." 7 50; read;

rm -f /tmp/input.$$