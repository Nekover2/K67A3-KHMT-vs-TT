isExist()
{
    if test -f "$1"; then
        echo "true";
    else 
        echo "false";
    fi
}

dialog --title "Info" --backtitle "Nhap vao file can kiem tra..." --inputbox "Enter file name below: " 7 50 2>/tmp/input.$$;
fileName=$(cat /tmp/input.$$);
res=$(isExist $fileName)
currDir=`pwd`;
if [ $res = "true" ]; then
    dialog --title "ATTENTION: DELETE FILE?" --yesno "$fileName exist! Do you want to delete $fileName?" 7 50;
    sel=$?
    case $sel in
        0) rm $fileName; dialog --title  "File deleted" --msgbox "File $fileName deleted" 7 50;;
        1) dialog --title  "Canceled deleting file" --msgbox "-----------" ;;
        255) dialog --title  "Canceled by user by pressing [ESC] key" --msgbox "---------" 7 50;;
    esac
else
    dialog --title "ATTENTION: CREATE FILE?" --yesno "File $fileName isn't exist, do you want to create $fileName?" 7 50;
    sel=$?
    case $sel in
        0) touch $fileName; dialog --title  "File created in $currDir/$fileName" --msgbox "File created in $currDir/$fileName" 7 50;;
        1) dialog --title  "Canceled creating file" --msgbox "-----------" 7 50;;
        255) dialog --title  "Canceled by user by pressing [ESC] key" --msgbox "-----------" 7 50;;
    esac
fi
rm -f /tmp/input.$$