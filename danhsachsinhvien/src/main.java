import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        danhsachsinhvien dssv = new danhsachsinhvien();
        int choice;
        do {
            System.out.println(
                  "1.	Thêm sinh viên vào danh sách.\n"
                + "2.	In danh sách sinh viên ra màn hình.\n"
                + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                + "5.	Làm rỗng danh sách sinh viên.\n"
                + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                + "0.   Thoát khỏi chương trình");
                System.out.printf("chọn: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice) {
                    case 1: {
                        System.out.println("nhập mã sinh viên: "); String masv = sc.nextLine();
                        System.out.println("nhập họ và tên: "); String ht = sc.nextLine();
                        System.out.println("nhập năm sinh: "); int namsinh = sc.nextInt();
                        System.out.println("nhập điểm trung bình: "); float dtb = sc.nextFloat();
                        sinhvien sv = new sinhvien(masv, ht, namsinh, dtb);
                        dssv.themsinhvien(sv);
                        break;
                    }
                    case 2: {
                        dssv.display(); break;
                    }
                    case 3: {
                        System.out.println("Danh sach rong: " + dssv.check()); break;
                    }
                    case 4: {
                        System.out.println("so luong sinh vien dang co la: " + dssv.soluong()); break;
                    }
                    case 5: {
                        dssv.lamrong();
                        System.out.println("da xoa het sinh vien!"); break;
                    }
                    case 6: {
                        System.out.printf("nhap ma sinh vien can tim: ");
                        String timmsv = sc.nextLine();
                        sinhvien sv = new sinhvien(timmsv);
                        System.out.println("sinh vien co ton tai khong: " + dssv.kiemtratontai(sv));

                    }
                    case 7: {
                        System.out.printf("nhap ma sinh vien can tim: ");
                        String timmsv = sc.nextLine();
                        sinhvien sv = new sinhvien(timmsv);
                        dssv.xoasv(sv);
                    }
                    case 8: {
                        System.out.println("nhap ho va ten: "); String ht = sc.nextLine();
                        System.out.println("ket qua tim kiem: ");
                        dssv.timsv(ht);
                    }
                    case 9: {

                    }
                }
        } while(choice!=0);
    }
}
