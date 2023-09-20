public class Thue {
    public static void main(String[] args) {
        ngay ngay1 = new ngay(20,3,2005);
        ngay ngay2 = new ngay(19,7,2005);
        
        tacgia tacgia1 = new tacgia("Đăng Khoa", ngay1);
        tacgia tacgia2 = new tacgia("Ngọc Thuận", ngay2);
        
        Sach Sach1 = new Sach("Hello World", 50000, 2023, tacgia1);
        Sach Sach2 = new Sach("Hello My World", 100000, 2022, tacgia2);
        
        Sach1.insach();
        Sach2.insach();     
    }
}