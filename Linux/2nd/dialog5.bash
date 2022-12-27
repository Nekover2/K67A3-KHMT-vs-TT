listPrime1()
{
    currIndex=0;
    arr[0]=-1;
    for val in $*; do
        if [[ $val -gt 1 ]]; then
            flag=true;
            for (( j = 2; j <= val/2; j++ )); do
                if [ $(( $val % $j )) -eq 0 ]; then
                    flag=false;
                fi
            done
            if $flag ; then
                arr[$currIndex]=$val;
             currIndex=$(( $currIndex + 1))
            fi
        fi
    done
    if [[ arr[0] -eq -1 ]]; then
        echo "No prime num found!";
    else
        echo -n "List of prime num: "
        for res in ${arr[@]}; do
            echo -n "$res ";
        done
    fi
    echo ""
}

dialog --backtitle "Linux Shell Script Tutorial" --title "Main Menu" --menu "Move using [UP] [DOWN],[Enter] to select" 30 200 4 Date/time "Shows Date and Time, current user, current dir, all process" FindDir "All the dir startsWith D and EndsWith p in curr Dir" FindFile "List all the files have number in name" listPrime "Enter an arrm list all the primes" 2>/tmp/menuitem.$$
menuitem=`cat /tmp/menuitem.$$`
opt=$?
case $menuitem in
    Date/time) 
        currDir=`pwd`;
        proc=`ps -a`;
        userName=`whoami`;
        date=`date`
        dialog --title  "INFORMATION" --msgbox "Current dir: $currDir\nUser: $userName\nDate/time:$date\nAll process:\n $proc" 30 200;
    ;;
    FindDir)
        folder=`ls -d D*p | grep -E *+ ` ;
        dialog --title  "INFORMATION" --msgbox "list:\n$folder" 30 200;
    ;;
    FindFile) 
        file=`ls -d *[0-9]* | grep -E *+ `;
        dialog --title  "INFORMATION" --msgbox "list:\n$file" 30 200;
        ;;
    listPrime)
        dialog --title "Info: Enter nums" --inputbox "Enter nums below: " 7 50 2>/tmp/input.$$;
        nums=$(cat /tmp/input.$$);
        rm -f /tmp/input.$$;
        primes=$(listPrime1 $nums);
        dialog --title  "INFORMATION" --msgbox "Primes: $primes" 20 100;
    ;;
    *)
        dialog --title  "INFORMATION" --msgbox "Yeah, you choose nothing..." 20 100;
    ;;
esac
rm -f /tmp/menuitem.$$