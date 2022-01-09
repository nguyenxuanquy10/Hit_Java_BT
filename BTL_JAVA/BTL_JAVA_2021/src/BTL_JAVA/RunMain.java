package BTL_JAVA;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) throws Exception {
        runMain();
    }

    //RunMain
    public static void runMain() {
        Scanner scanner = new Scanner(System.in);
        boolean flat = true;
        while (flat) {
            MENU();
            String luachon = scanner.nextLine();
            switch (luachon) {
                case "1": {
                    try {
                        ThaoTacFile();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                case "2": {
                    try {
                        ThaoTacJdbc();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                case "3": {
                    System.out.println("KHONG HOI LE , NHAP LAI");
                }
            }
        }
    }

    // thao tac voi file
    public static void ThaoTacFile() throws Exception {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien manage = new QuanLySinhVien();
        manage.DocFile1();
        boolean flat = true;
        while (flat) {
            TitleLogin();
            int x = sc.nextInt();
            switch (x) {
                // cho quan ly
                case 1: {
                    LogInForAdmin(sc);

                    boolean choosequanly = true;
                    while (choosequanly) {
                        MenuQuanLy();
                        int yourchoose = sc.nextInt();
                        // sc.nextLine();
                        switch (yourchoose) {
                            case 1: {
                                sc.nextLine();
                                System.out.println("Nhap id: ");
                                String newId = sc.nextLine();
                                manage.TimKiemBangId(newId);
                                break;
                            }
                            case 2: {
                                sc.nextLine();
                                System.out.println("Nhap id: ");
                                String newId = sc.nextLine();
                                manage.XoaBangId(newId);
                                manage.VietFile1();
                                break;
                            }
                            case 5: {
                                sc.nextLine();
                                manage.ThemSV();
                                manage.VietFile1();
                                break;
                            }
                            case 6: {
                                sc.nextLine();
                                manage.ThemDanhSachSV();
                                manage.VietFile1();
                                break;
                            }
                            case 3: {
                                sc.nextLine();
                                System.out.println("NHAP SO CMT: ");
                                String cmt = sc.nextLine();
                                manage.TimKiemBangSoCMT(cmt);
                                break;
                            }
                            case 4: {
                                sc.nextLine();
                                System.out.println("NHAP SO CMT: ");
                                String cmt = sc.nextLine();
                                manage.XoaBangSoCMT(cmt);
                                manage.VietFile1();
                                break;
                            }
                            case 7: {
                                sc.nextLine();
                                System.out.println("NHAP TINH TRANG BENH(F0|F1|F2|F3|F4|NONE");
                                String statusf = sc.nextLine();
                                manage.SearchTinhTrangSucKheo(statusf);
                                break;
                            }
                            case 8: {
                                System.out.println("KHONG LA F1,F2 VA TIEM 2 MUI TRO LEN");
                                manage.DuDieuKien();
                                break;
                            }
                            case 9: {
                                manage.ThieuHocPhi();
                                break;
                            }
                            case 10: {
                                manage.DuHocPhi();
                                break;
                            }
                            case 11: {
                                manage.DatHocBong();
                                break;
                            }
                            case 12: {
                                manage.HocLai();
                                break;
                            }
                            case 13: {
                                manage.SapXepGPA();
                                manage.VietFile1();
                                break;
                            }
                            case 14: {
                                manage.SapXepTheoTen();
                                manage.VietFile1();
                                break;
                            }
                            case 15: {
                                manage.SapXepTheoId();
                                manage.VietFile1();
                                break;
                            }
                            case 16: {
                                manage.ThongTinhAll();
                                break;
                            }
                            case 17: {
                                choosequanly = false;
                                break;
                            }
                            default: {
                                System.out.println("NHAP SAI,NHAP LAI");
                                break;
                            }
                        }
                    }
                    break;
                }

                // cho sinh vien2

                case 2: {
                    SinhVien result = new SinhVien();
                    List<SinhVien> account = new ArrayList<>();
                    manage.LayTatCaSinhVien(account);
                    LoginInForsinhvien(sc, account, result);
                    boolean checkstudent = true;
                    while (checkstudent) {

                        MenuForsinhvien();
                        int x1 = sc.nextInt();
                        switch (x1) {
                            case 1: {
                                result.ThayDoiThongTinCuThe(sc);
                                manage.XoaBangId1(result.getId());
                                manage.ThemSV1(result);
                                manage.VietFile1();
                                break;
                            }
                            case 2: {
                                result.CheckLichHoc();
                                break;
                            }
                            case 3: {
                                result.CheckLichThi();
                                break;

                            }
                            case 4: {
                                result.DongHoc(sc);
                                manage.XoaBangId1(result.getId());
                                manage.ThemSV1(result);
                                manage.VietFile1();
                                break;
                            }
                            case 5: {
                                result.KiemtraGpa();
                                break;
                            }
                            case 6: {
                                result.KhaiBaoYTe();
                                manage.XoaBangId1(result.getId());
                                manage.ThemSV1(result);
                                manage.VietFile1();
                                break;
                            }
                            case 7: {
                                result.XemThongTin();
                                break;
                            }
                            case 8: {
                                checkstudent = false;
                                break;
                            }
                            default: {
                                System.out.println("INVALID,INPUT AGAIN");
                            }
                        }
                    }
                }
                case 3: {
                    System.out.println("THOAT!");
                    flat = false;
                    break;
                }
                default: {
                    System.out.println("INVALID,INPUT AGAIN");
                }
            }
        }
    }

    // thao tac voi jdbc
    public static void ThaoTacJdbc() throws Exception {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien manage = new QuanLySinhVien();
        JDBC_thaotac newjdbc = new JDBC_thaotac();
        List<SinhVien> resultjdbc = new ArrayList<>();
        manage.LayTatCaSinhVien(resultjdbc);
        newjdbc.insertData(resultjdbc);
        newjdbc.getData(resultjdbc);
        resultjdbc.forEach(System.out::println);
        boolean flat = true;
        while (flat) {
            TitleLogin();
            int x = sc.nextInt();
            // sc.nextLine();
            switch (x) {
                // cho quan ly
                case 1: {
                    LogInForAdmin(sc);

                    boolean choosequanly = true;
                    while (choosequanly) {
                        MenuQuanLy();
                        int yourchoose = sc.nextInt();
                        // sc.nextLine();
                        switch (yourchoose) {
                            case 1: {
                                sc.nextLine();
                                System.out.println("Nhap id: ");
                                String newId = sc.nextLine();
                                manage.TimKiemBangId(newId);
                                break;
                            }
                            case 2: {
                                sc.nextLine();
                                System.out.println("Nhap id: ");
                                String newId = sc.nextLine();
                                manage.XoaBangId(newId);
                                manage.UpdateJbdc();
                                break;
                            }
                            case 5: {
                                sc.nextLine();
                                manage.ThemSV();
                                manage.UpdateJbdc();
                                break;
                            }
                            case 6: {
                                sc.nextLine();
                                manage.ThemDanhSachSV();
                                manage.UpdateJbdc();
                                break;
                            }
                            case 3: {
                                sc.nextLine();
                                System.out.println("NHAP SO CMT: ");
                                String cmt = sc.nextLine();
                                manage.TimKiemBangSoCMT(cmt);
                                break;
                            }
                            case 4: {
                                sc.nextLine();
                                System.out.println("NHAP SO CMT: ");
                                String cmt = sc.nextLine();
                                manage.XoaBangSoCMT(cmt);
                                manage.UpdateJbdc();
                                break;
                            }
                            case 7: {
                                sc.nextLine();
                                System.out.println("NHAP TINH TRANG BENH(F0|F1|F2|F3|F4|NONE");
                                String statusf = sc.nextLine();
                                manage.SearchTinhTrangSucKheo(statusf);
                                break;
                            }
                            case 8: {
                                System.out.println("KHONG LA F1,F2 VA TIEM 2 MUI TRO LEN");
                                manage.DuDieuKien();
                                break;
                            }
                            case 9: {
                                manage.ThieuHocPhi();
                                break;
                            }
                            case 10: {
                                manage.DuHocPhi();
                                break;
                            }
                            case 11: {
                                manage.DatHocBong();
                                break;
                            }
                            case 12: {
                                manage.HocLai();
                                break;
                            }
                            case 13: {
                                manage.SapXepGPA();
                                manage.UpdateJbdc();
                                break;
                            }
                            case 14: {
                                manage.SapXepTheoTen();
                                manage.UpdateJbdc();
                                break;
                            }
                            case 15: {
                                manage.SapXepTheoId();
                                manage.UpdateJbdc();
                                break;
                            }
                            case 16: {
                                manage.ThongTinhAll();
                                break;
                            }
                            case 17: {
                                choosequanly = false;
                                break;
                            }
                            default: {
                                System.out.println("NHAP SAI,NHAP LAI");
                                break;
                            }
                        }
                    }
                    break;
                }
                // cho sinh vien2

                case 2: {
                    // manage.ThongTinhAll();
                    SinhVien result = new SinhVien();
                    List<SinhVien> account = new ArrayList<>();
                    manage.LayTatCaSinhVien(account);
                    LoginInForsinhvien(sc, account, result);
                    boolean checkstudent = true;
                    while (checkstudent) {

                        MenuForsinhvien();
                        int x1 = sc.nextInt();
                        switch (x1) {
                            case 1: {
                                result.ThayDoiThongTinCuThe(sc);
                                manage.XoaBangId1(result.getId());
                                manage.ThemSV1(result);
                                manage.UpdateJbdc();
                                break;
                            }
                            case 2: {
                                result.CheckLichHoc();
                                break;
                            }
                            case 3: {
                                result.CheckLichThi();
                                break;

                            }
                            case 4: {
                                result.DongHoc(sc);
                                manage.XoaBangId1(result.getId());
                                manage.ThemSV1(result);
                                manage.UpdateJbdc();
                                break;
                            }
                            case 5: {
                                result.KiemtraGpa();
                                break;
                            }
                            case 6: {
                                result.KhaiBaoYTe();
                                manage.XoaBangId1(result.getId());
                                manage.ThemSV1(result);
                                manage.UpdateJbdc();
                                break;
                            }
                            case 7: {
                                result.XemThongTin();
                                break;
                            }
                            case 8: {
                                checkstudent = false;
                                break;
                            }
                            default: {
                                System.out.println("INVALID,INPUT AGAIN");
                            }
                        }
                    }
                }
                case 3: {
                    System.out.println("THOAT!");
                    flat = false;
                    break;
                }
                default: {
                    System.out.println("INVALID,INPUT AGAIN");
                }
            }
        }

    }

    // dang nhap voi admin
    public static void LogInForAdmin(Scanner sc) {
        sc.nextLine();
        while (true) {
            System.out.println("----------Nhap You Account----------");
            String ID = "admin";
            String PASSWORD = "admin";
            System.out.println("Nhap You ID: ");
            String newid = sc.nextLine();
            System.out.println("Nhap Your Password: ");
            String newpass = sc.nextLine();
            newid = newid.trim();
            newpass = newpass.trim();
            if (ID.equals(newid) && PASSWORD.equals(newpass)) {
                System.out.println("VALID ACCOUNT");
                break;
            }
            System.out.println("INVALILD ACCOUNT, INPUT AGAIN");
        }
    }

    // dang nhap voi sinh vien
    public static void LoginInForsinhvien(Scanner sc, List<SinhVien> account, SinhVien result) {
        while (true) {
            sc.nextLine();
            System.out.println("----------Nhap You Account----------");
            System.out.println("Nhap You ID: ");
            String newid = sc.nextLine();
            System.out.println("Nhap Your Password: ");
            String newpass = sc.nextLine();
            String newid1 = newid.trim();
            String newpass1 = newpass.trim();
            SinhVien result1 = account.stream().filter(o -> o.getId().equals(newid1) && o.getMatkhau().equals(newpass1)).findFirst().orElse(null);
            if (result1 != null) {
                result.SetTatCaThongTingNguoi(result1);
                System.out.println("VALID ACCOUNT");
                break;
            }
            System.out.println("INVALILD ACCOUNT, INPUT AGAIN");
        }
    }

    // menu cho dang nhap voi sinh vien va admin
    public static void TitleLogin() {
        System.out.println("----------Access by Admin Account or sinhvien Account----------");
        System.out.println("----------1. For Admin Account----------");
        System.out.println("----------2. For sinhvien Account----------");
        System.out.println("----------3. THOAT!----------");
    }

    // menu thao tac cho sinh vien
    public static void MenuForsinhvien() {
        System.out.println("1.Thay Doi Thong Tin");
        System.out.println("2.Kiem Tra Lich Hoc");
        System.out.println("3.Kiem Tra Lich Thi");
        System.out.println("4.Dong Hoc");
        System.out.println("5.Kiem Tra GPA");
        System.out.println("6.Khai Bao Y Te");
        System.out.println("7.Xem Thong Tin");
        System.out.println("8.Thoat Chuong Trinh");
    }

    // menu thao tac cho admin
    public static void MenuQuanLy() {
        System.out.println("1.Tim kiem sinh vien theo id");
        System.out.println("2.Xoa sinh vien theo id");
        System.out.println("3.Tim kiem sinh vien theo cmt");
        System.out.println("4.Xoa sinh vien vien cmt");
        System.out.println("5.Them mot sinh vien ");
        System.out.println("6.Them nhieu sinh vien");
        System.out.println("7.Xem thong tin sinh vien nhiem COVID");
        System.out.println("8.Kiem tra so luong sinh vien du dien kien den truong");
        System.out.println("9.Kiem tra thong tin sinh vien chua dong hoc");
        System.out.println("10.Kiem tra thong tin sinh vien dong day du");
        System.out.println("11.Kiem tra thong tin sinh vien dat hoc bong");
        System.out.println("12.Kiem tra thong tin sinh vien thi lai");
        System.out.println("13.Sap xep thong tin sinh vien theo GPA");
        System.out.println("14.Sap xep thong tin sinh vien theo ten");
        System.out.println("15.Sap xep thong tin theo ID");
        System.out.println("16.Xem tat ca thon tin");
        System.out.println("17.Thoat");
    }

    // menu lua chon thao tac voi jdbc hoac file
    public static void MENU() {
        System.out.println("Nhap lua chon: ");
        System.out.println("1.Thao tac voi File");
        System.out.println("2.Thao tac voi SQL");
        System.out.println("3.Thoat");
    }

}
