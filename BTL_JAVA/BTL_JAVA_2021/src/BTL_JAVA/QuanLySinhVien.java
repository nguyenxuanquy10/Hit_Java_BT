package BTL_JAVA;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class QuanLySinhVien {
    static Scanner sc = new Scanner(System.in);

    private List<SinhVien> DanhSachSV;

    private ThaoTacFile DuLieuFile;

    private JDBC_thaotac jdbc_thaotac = new JDBC_thaotac();

    public QuanLySinhVien() {
        DanhSachSV = new ArrayList<>();
        DuLieuFile = new ThaoTacFile();
    }

    // thao tac voi file
    public void DocFile1() throws Exception {
        DuLieuFile.DocFile(DanhSachSV);
    }

    public void VietFile1() throws Exception {
        DuLieuFile.GhiFile(DanhSachSV);
    }

    // thao tac voi jdbc
    public void DocJbdc1() throws Exception {
        jdbc_thaotac.getData(DanhSachSV);
    }

    public void VietJdbc1() throws Exception {
        jdbc_thaotac.insertData(DanhSachSV);
    }

    public void UpdateJbdc() throws Exception {
        jdbc_thaotac.updateData(DanhSachSV);
    }

    // xuat du lieu
    public void XuatDuLieu() {
        DanhSachSV.forEach(System.out::println);
    }

    // tim kiem bang id
    public void TimKiemBangId(String ID) throws IOException {
        String newid = ID.trim();
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(newid)).findFirst().orElse(null);
        if (result != null) {
            System.out.println("TIM KIEM THANH CONG");
            System.out.println(result);
            System.in.read();
        } else {
            System.out.println("SAI ID");
        }
    }

    // xoa bang id
    public void XoaBangId(String ID) throws IOException {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            System.out.println("XOA THANH CONG");
            DanhSachSV.remove(result);
            System.in.read();

        } else {
            System.out.println("SAI ID");
        }
    }

    // lay thong tin tai khoan de dang nhap
    public List<SinhVien> LayTatCaSinhVien(List<SinhVien> result) {
        for (SinhVien o : DanhSachSV) {
            result.add(o);
        }
        return result;
    }

    //kiem tra id nhap da ton tai chua
    public boolean kiemtra_id(List<SinhVien> result, String id_) {
        for (SinhVien o : result) {
            if (id_.equals(o.getId())) return true;
        }
        return false;
    }

    // kiem tra so cmt nhap da ton tai chua
    public boolean kiemtra_cmt(List<SinhVien> result, String cmt_) {
        for (SinhVien o : result) {
            if (cmt_.equals(o.getSoCMT())) return true;
        }
        return false;
    }

    // them 1 sinh vien
    public void ThemSV() {
        SinhVien sinhvien = new SinhVien();
        // nhap id
        String newid;
        // sc.nextLine();
        do {

            System.out.println("NHAP ID ( MA SV CUA DHCNHN - VD:2020606494 ): ");
            newid = sc.nextLine();
            if (kiemtra_id(DanhSachSV, newid)) {
                System.out.println("DA TON TAI!NHAP LAI");
                newid = "";
            }
        } while (!sinhvien.regex_id(newid) && !kiemtra_id(DanhSachSV, newid));
        System.out.println("HOP LE");
        // nhap mat khau
        String newmatkhau;
        do {
            System.out.println("NHAP MAT KHAU ( IT NHAT 8 KY TU,CHUA 1 CHU HOA,1 CHU THUONG,1 KY TU DAC BIET - VD: Abcd111@");
            newmatkhau = sc.nextLine();
        } while (!sinhvien.regex_matkhau(newmatkhau));
        System.out.println("HOP LE");
        // nhap ho ten
        String hoten;
        do {
            System.out.println("NHAP HO TEN ( VD: NGUYEN VAN A ) ");
            hoten = sc.nextLine();
        } while (!sinhvien.regex_hoten(hoten));
        System.out.println("HOP LE");
        // nhap tuoi
        String newtuoi;
        do {
            System.out.println("NHAP TUOI ( VD: 18 )");
            newtuoi = sc.nextLine();
        } while (!sinhvien.regex_tuoi(newtuoi));
        System.out.println("HOP LE");
        // nhap dia chi
        String newdiachi;
        do {
            System.out.println("NHAP DIA CHI (VD: HA NOI)");
            newdiachi = sc.nextLine();
        } while (!sinhvien.regex_diachi(newdiachi));
        System.out.println("HOP LE");
        // nhap gioi tinh
        String newgioitinh;
        do {
            System.out.println("NHAP GIOI TINH ( NAM|NU|THUBA )");
            newgioitinh = sc.nextLine();
        } while (!sinhvien.regex_gioitinh(newgioitinh));
        System.out.println("HOP LE");
        // nhap sdt
        String newsdt;
        do {
            System.out.println("NHAP SDT ( so 0 DUNG DAU,10 CHU SO )");
            newsdt = sc.nextLine();
        } while (!sinhvien.regex_sdt(newsdt));
        System.out.println("HOP LE");
        // nhap cmt
        String newcmt;
        do {
            System.out.println("NHAP CMT ( 12 SO )");
            newcmt = sc.nextLine();
            if (kiemtra_cmt(DanhSachSV, newcmt)) {
                System.out.println("DA TON TAI! NHAP LAI");
                newcmt = "";
            }
        } while (!sinhvien.regex_cmt(newcmt) && !kiemtra_cmt(DanhSachSV, newcmt));
        System.out.println("HOP LE");

        // nhap tinh trang tai chinh
        String newtaichinh;
        do {
            System.out.println("NHAP TINH TRANG TAI CHINH ( VD: THIEU: 1000 )");
            newtaichinh = sc.nextLine();
        } while (!sinhvien.regex_taichinh(newtaichinh));
        System.out.println("HOP LE");
        // nhap lich hoc
        String newlichhoc;
        do {
            System.out.println("NHAP LICH HOC ( VD: T2:TOAN/T3: LY");
            newlichhoc = sc.nextLine();
        } while (!sinhvien.regex_lichhoc(newlichhoc));
        System.out.println("HOP LE");
        // nhap lich thi
        String newlichthi;
        do {
            System.out.println("NHAP LICH THI (VD: T2: THITOAN/T3: THILY) ");
            newlichthi = sc.nextLine();
        } while (!sinhvien.regex_lichthi(newlichthi));
        System.out.println("HOP LE");

        // nhap gpa
        double newgpa;
        do {
            System.out.println("NHAP GPA (VD: 9.0)");
            newgpa = sc.nextDouble();
        } while (!sinhvien.regex_GPA(newgpa));
        System.out.println("HOP LE");
        sc.nextLine();
        // nhap tinh trang suc kheo
        String newsk;
        do {
            System.out.println("TINH TRANG SUC KHEO (XAU|TOT|NHIEMCOVID");
            newsk = sc.nextLine();
        } while (!sinhvien.regex_tinhtrangsuckhoe(newsk));
        System.out.println("HOP LE");
        // nhap so mui vaccin
        String newsomui;
        do {
            System.out.println("SO MUI VACCIN DA TIEM (VD: 2) ");
            newsomui = sc.nextLine();
        } while (!sinhvien.regex_somuivaccin(newsomui));
        System.out.println("HOP LE");
        // nhap tinh trang f
        String newf;
        do {
            System.out.println("BAN LA F MAY ( VD: F0|F1|F2|F3|F4|NONE) ");
            newf = sc.nextLine();
        } while (!sinhvien.regex_F(newf));
        System.out.println("HOP LE");

        DanhSachSV.add(new SinhVien(newid, newcmt, newmatkhau, hoten, newgioitinh, newdiachi, newtuoi, newsdt,
                newgpa, newtaichinh, newlichhoc, newlichthi, newsk, newsomui, newf));
    }

    // them nhieu sinh vien
    public void ThemDanhSachSV() {
        System.out.println("----------NHAP SO SINH VIEN MUON THEM----------");
        int soluong = sc.nextInt();
        List<SinhVien> result = new ArrayList<>();
        for (int i = 1; i <= soluong; i++) {
            ThemSV();
        }
        sc.nextLine();
    }

    // tim kiem bang so cmt
    public void TimKiemBangSoCMT(String SoCMT) throws IOException {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getSoCMT().equals(SoCMT)).findFirst().orElse(null);
        if (result != null) {
            System.out.println("TIM KIEM THANH CONG");
            System.out.println(result);
            System.in.read();
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // xoa bang so cmt
    public void XoaBangSoCMT(String SoCMT) throws IOException {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getSoCMT().equals(SoCMT)).findFirst().orElse(null);
        if (result != null) {
            DanhSachSV.remove(result);
            System.out.println("XOA THANH CONG");
            System.in.read();
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }

    }

    // tim kiem so luong sinh vien bi tinh trang F
    public void TimKiemSVF(String F) {
        List<SinhVien> result = new ArrayList<>();
        result = DanhSachSV.stream().filter(o -> o.getF().equals(F)).collect(Collectors.toList());
        if (result.size() == 0) {
            System.out.println("Khong Hop Le,Nhap Lai");
        } else {
            System.out.printf("SO LUONG: %d/%d", result.size(), DanhSachSV.size());
            System.out.println();
            result.forEach(System.out::println);
        }
    }

    // kiem tra sinh vien du dieu kien den truong
    public void DuDieuKien() throws IOException {
        // so mui vaccin la 2;
        // khong la F0,F1
        // tinh trang suc kheo
        List<SinhVien> result = new ArrayList<>();
        for (SinhVien o : DanhSachSV) {
            if ((!o.getF().equals("F0") && !o.getF().equals("F1")) && Integer.parseInt(o.getSoMuiVaccin()) >= 2) {
                result.add(o);
            }
        }
        if (result.size() == 0) {
            System.out.println("KHONG CO SINH VIEN DU DIEU KIEN DEN TRUONG");
            return;
        }
        System.out.println("THONG TIN SINH VIEN DU DIEU KIEN DEN TRUONG");
        System.out.printf("SO LUONG: %d/%d", result.size(), DanhSachSV.size());
        System.out.println();
        result.forEach(System.out::println);
        System.in.read();
    }

    // kiem tra so luong sinh vien chua dong hoc
    // xu ly String tien dong hoc
    public float xulychuoi(String sotien) {
        sotien = sotien.replaceAll("[^0-9-]", "");
        return Float.parseFloat(sotien);
    }

    // lay so luong sinh vien chua dong hoc
    public void ThieuHocPhi() throws IOException {
        List<SinhVien> result = new ArrayList<>();
        for (SinhVien o : DanhSachSV) {
            if (xulychuoi(o.getTinhTrangTaiChinh()) > 0) {
                result.add(o);
            }
        }
        if (result.size() <= 0) {
            System.out.println("KHONG CO SINH VIEN THIEU TIEN");
            System.in.read();
        } else {
            System.out.printf("SO LUONG: %d/%d", result.size(), DanhSachSV.size());
            System.out.println();
            System.out.println("DANH SACH SINH VIEN THIEU TIEN");
            result.forEach(System.out::println);
            System.in.read();
        }
    }

    // kiem tra sinh vien dong du hoc phi
    public void DuHocPhi() throws IOException {
        List<SinhVien> result = new ArrayList<>();
        for (SinhVien o : DanhSachSV) {
            if (xulychuoi(o.getTinhTrangTaiChinh()) == 0) {
                result.add(o);
            }
        }
        if (result.size() <= 0) {
            System.out.println("KHONG CO SINH VIEN DONG DU TIEN");
            System.in.read();
        } else {
            System.out.printf("SO LUONG: %d/%d", result.size(), DanhSachSV.size());
            System.out.println();
            System.out.println("DANH SACH SINH VIEN DONG DU TIEN");
            result.forEach(System.out::println);
            System.in.read();
        }
    }

    // kiem tra so luong sinh vien theo tinh trang suc kheo
    public void SearchTinhTrangSucKheo(String TinhTrangSucKheo) throws IOException {
        List<SinhVien> result = new ArrayList<>();
        result = DanhSachSV.stream().filter(o -> o.getF().equals(TinhTrangSucKheo)).collect(Collectors.toList());
        if (result.size() == 0) {
            System.out.println("Khong Ton Tai: " + TinhTrangSucKheo);
            System.in.read();
        } else {
            System.out.printf("SO LUONG: %d/%d", result.size(), DanhSachSV.size());
            System.out.println();
            result.forEach(System.out::println);
            System.in.read();
        }
    }

    // kiem tra lich thi cua sinh vien theo id
    public void KiemTraLichThi(String ID) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            System.out.println(result.getLichThi());
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // kiem tra thong tin tai chinh cua sinh vien bang id
    public void KiemTraTinhTrangTaiChinh(String ID) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            System.out.println(result.getTinhTrangTaiChinh());
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // kiem tra lich hoc cua sinh vien bang id
    public void KiemTraLichHoc(String ID) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            System.out.println(result.getLichHoc());
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // kiem tra so luong sinh vien dat hoc bong
    public void DatHocBong() throws IOException {
        List<SinhVien> result = new ArrayList<>();
        result = DanhSachSV.stream().filter(o -> o.getGPA() > 8.0).collect(Collectors.toList());
        if (result.size() < 0) {
            System.out.println("Khong Co Sinh Vien Nao Duoc Hoc Bong");
            System.in.read();
        } else {
            System.out.printf("SO LUONG: %d/%d", result.size(), DanhSachSV.size());
            System.out.println();
            System.out.println("----------Danh Sach Sinh Vien Dat Hoc Bong--------- ");
            result.forEach(System.out::println);
            System.in.read();
        }
    }

    // kiem tra so luong sinh vien hoc lai
    public void HocLai() throws IOException {
        List<SinhVien> result = new ArrayList<>();
        result = DanhSachSV.stream().filter(o -> o.getGPA() < 4.0).collect(Collectors.toList());
        if (result.size() < 0) {
            System.out.println("Khong Co Sinh Vien Nao Hoc Lai");
            System.in.read();
        } else {
            System.out.printf("SO LUONG: %d/%d", result.size(), DanhSachSV.size());
            System.out.println();
            System.out.println("----------Danh Sach Sinh Vien Hoc Lai--------- ");
            result.forEach(System.out::println);
            System.in.read();
        }
    }

    // thay doi thong tin cu the sinh sinh bang id
    public void ThayDoiThongTinCuThe(String ID) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            Scanner sc = new Scanner(System.in);
            int x1 = 1;
            while (x1 != 0) {
                QuanLySinhVien.MenuThayDoiThongTinCuThe();
                System.out.println("Nhap Lua Chon");
                int x = sc.nextInt();
                switch (x) {
                    case 1: {
                        System.out.println("Sua Id: ");
                        result.setId(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 2: {
                        System.out.println("Sua Lich Hoc: ");
                        result.setLichHoc(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 3: {
                        System.out.println("Sua Lich Kiem Tra: ");
                        System.out.println("THAY DOI THANH CONG");
                        result.setLichThi(sc.nextLine());
                        break;
                    }
                    case 4: {
                        System.out.println("Sua GPA: ");
                        result.setGPA(sc.nextDouble());
                        System.out.println("THAY DOI THANH CONG");
                        sc.nextLine();
                        break;
                    }
                    case 5: {
                        System.out.println("Sua Tinh Trang Suc Kheo: ");
                        result.setTinhTrangSucKheo(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 6: {
                        System.out.println("Sua So Mui Vaccin: ");
                        result.setSoMuiVaccin(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 7: {
                        System.out.println("Sua Tinh Trang Nhiem F: ");
                        result.setF(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 8: {
                        System.out.println("Sua Ho Ten: ");
                        result.setHoTen(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 9: {
                        System.out.println("Sua Tuoi: ");
                        result.setTuoi(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 10: {
                        System.out.println("Sua Dia CHi: ");
                        result.setDiaChi(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 11: {
                        System.out.println("Sua Gioi Tinh: ");
                        result.setGioiTinh(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 12: {
                        System.out.println("Sua So Dien Thoai: ");
                        result.setSDT(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 13: {
                        System.out.println("Sua So CMT: ");
                        result.setSoCMT(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 14: {
                        System.out.println("Sua Tinh Trang Tai Chinh: ");
                        result.setTinhTrangTaiChinh(sc.nextLine());
                        System.out.println("THAY DOI THANH CONG");
                        break;
                    }
                    case 15: {
                        x1 = 0;
                        break;
                    }
                    default: {
                        System.out.println("Khong Hop Le,Nhap Lai");
                    }
                }
            }
            sc.nextLine();
            try {
                XoaBangId1(result.getId());
            } catch (IOException e) {
                e.getMessage();
            }

        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // xoa sinh vien bang id
    public void XoaBangId1(String ID) throws IOException {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            DanhSachSV.remove(result);
            System.in.read();
        }
    }

    // them 1 sinh vien
    public void ThemSV1(SinhVien result) {
        DanhSachSV.add(result);
    }

    // menu thay doi thong tin cu the
    public static void MenuThayDoiThongTinCuThe() {

        System.out.println("Sua Lich Hoc: ");
        System.out.println("Sua Lich Kiem Tra: ");
        System.out.println("Sua GPA: ");
        System.out.println("Sua Tinh Trang Suc Kheo: ");
        System.out.println("Sua So Mui Vaccin: ");
        System.out.println("Sua Tinh Trang Nhiem F: ");
        System.out.println("Sua Ho Ten: ");
        System.out.println("Sua Tuoi: ");
        System.out.println("Sua Gioi Tinh: ");
        System.out.println("Sua So Dien Thoai: ");
        System.out.println("Sua So CMT: ");
        System.out.println("Sua Tinh Trang Tai Chinh: ");
        System.out.println("Sua Id: ");
    }

    // sap xep theo GPA
    public void SapXepGPA() throws IOException {
        DanhSachSV.stream().forEach(o -> System.out.println(o.getGPA()));
        Collections.sort(DanhSachSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGPA() > o2.getGPA()) return 1;
                return -1;
            }
        });
        System.out.println("SAP XEP THANH CONG");
        System.in.read();
    }

    // sap xep theo ten
    public void SapXepTheoTen() throws IOException {
        Collections.sort(DanhSachSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                String[] result1 = a.getHoTen().split(" ");
                String[] result2 = b.getHoTen().split(" ");
                return result1[result1.length - 1].compareTo(result2[result2.length - 1]);
            }
        });
        System.out.println("SAP XEP THANH CONG");
        System.in.read();
    }

    // sap xep theo id
    public void SapXepTheoId() throws IOException {
        Collections.sort(DanhSachSV, (sinhvien1, sinhvien2) -> sinhvien1.getId().compareTo(sinhvien2.getId()));
        System.out.println("SAP XEP THANH CONG");
        System.in.read();
    }

    // hien thu tat ca thong tin
    public void ThongTinhAll() {
        System.out.println("----------TAT CA THONG TIN SINH VIEN LA----------");
        DanhSachSV.stream().forEach(System.out::println);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
