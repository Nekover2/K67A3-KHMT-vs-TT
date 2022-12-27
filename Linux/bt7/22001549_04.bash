#functions

hd1()
{
    echo "Thư mục hiện hành: "
    echo `pwd`;
    echo "Các thư mục: "
    echo `ls -d */`
}

hd2()
{
    echo "Các tiến trình đang chạy: ";
    echo `ps`
}

hd3()
{
    for file in *.doc; do
        mv -- "$file" "${file%.doc}.txt"
    done
    echo "Hoàn thành chuyển đổi!"
}

hd4()
{
    echo "Các tệp tin và thư mục bắt đầu bằng abc: ";
    echo `ls abc*`;
}

hd5()
{
    echo "Các tệp tin và thư mục có chứa ít nhất 1 chữ số: ";
    echo `ls *[0-9]*`;
}

hd6()
{
    echo "Các tệp tin và thư mục có chứa ít nhất 1 chữ cái viết hoa: ";
    echo `ls *[A-Z]*`;
}

count()
{
    echo `ls -1 $1 | wc -l`
}

hd7()
{
    read -p "Nhập tên (hoặc đường dẫn) đến thư mục hiện tại: " _Dir;
    echo "Số lượng file trong thư mục hiên tại: ";
    count $_Dir;
}
#MENU
_Choice=1;
while [[ _Choice -ne 0 ]]; do
    echo "====================MENU=======================";
    echo "    1 : Hiển thị thư mục đang hiện hành và liệt kê các thư mục
    và tệp tin có trong thư mục đó?
    2: Hiển thị các tiến trình đang hoạt động
    3: Đổi tên tất cả các tệp tin có đuôi .doc sang .txt trong thư mục hiện hành
    4: Tìm kiếm và hiển thị các tệp tin/thư mục có tên bắt đầu bằng chuỗi abc trong thư mục hiện hành
    5: Tìm kiếm và hiển thị các tệp tin/thư mục có chứa ít nhất 1 chữ số trong thư mục hiện hành
    6: Tìm kiếm và hiển thị các dòng có chứa ít nhất một chữ viết hoa trong thư mục hiện hành
    7: Viết 1 shell trong đó chứa hàm count() có đối số truyền vào là tên của một thư mục, và trả về số lượng file trong thư mục đó?
    0: Thoát khỏi menu";
    
    read -p "Lựa chọn: "  _Choice;
    case $_Choice in
        1) hd1
        ;;
        2) hd2
        ;;
        3) hd3
        ;;
        4) hd4
        ;;
        5) hd5
        ;;
        6) hd6
        ;;
        7) hd7
        ;;
        0) exit
        ;;
        *) echo "Lựa chọn sai, xin nhập lại!"
    esac
    read -p "Press enter to continue..." a;
    echo `clear`;
done