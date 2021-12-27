package BTL_JAVA;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class QuanLySinhVien {
    private List<SinhVien> DanhSachSV;
    private Write_Read_File DuLieuFile;

    public QuanLySinhVien() {
        DanhSachSV = new ArrayList<>();
        DuLieuFile = new Write_Read_File();
    }

    // FILE
    public void DocFile1() throws Exception {
        DuLieuFile.DocFile(DanhSachSV);
    }

    public void VietFile1() throws Exception {
        DuLieuFile.GhiFile(DanhSachSV);
    }

    public void KhaiBaoSucKheo1(SinhVien sinhvien) {
        sinhvien.KhaiBaoYTe();
    }

    public void ThemSinhVien(SinhVien sinhvien) {
        DanhSachSV.add(sinhvien);
    }

    public void CapNhapFIle1() throws Exception {
        DuLieuFile.GhiFile(DanhSachSV);
    }

    // OUTPUT COMMON
    public void XuatDuLieu() {
        DanhSachSV.forEach(System.out::println);
    }

    // SEARFCH BY ID
    public void TimKiemBangId(String ID) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            result.OutPutsinhvien();
        
        } else {
            System.out.println("SAI ID");
            
        }
    }

    // REMOVE BY ID
    public void XoaBangId(String ID) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            System.out.println("XOA THANH CONG");
            DanhSachSV.remove(result);
            
        } else {
            System.out.println("SAI ID");
        }
    }

    // get id- to login account sinhvien
    public List<SinhVien> LayTatCaSinhVien(List<SinhVien> result) {
        for (SinhVien o : DanhSachSV) {
            result.add(o);
        }
        return result;
    }

    // ADD ONE sinhvien
    public void ThemSV(SinhVien sinhvien) {
        DanhSachSV.add(sinhvien);
    }

    // ADD sinhvien LIST sinhvien
    public void ThemDanhSachSV(List<SinhVien> result) {
        DanhSachSV.addAll(result);
    }

    // SEARCH BY SoCMT
    public SinhVien TimKiemBangSoCMT(String SoCMT) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getSoCMT().equals(SoCMT)).findFirst().orElse(null);
        if (result != null) {
            return result;
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
            return result;
        }
    }

    // REMOVE BY SoCMT
    public void XoaBangSoCMT(String SoCMT) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getSoCMT().equals(SoCMT)).findFirst().orElse(null);
        if (result != null) {
            DanhSachSV.remove(result);
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // SEARCH INFORMATION ABOUT STATUS F(INFECTED WITH VIRUS OR NONE)
    public void TimKiemSVF(String F) {
        List<SinhVien> result = new ArrayList<>();
        result = DanhSachSV.stream().filter(o -> o.getF().equals(F)).collect(Collectors.toList());
        if (result.size() == 0) {
            System.out.println("Khong Hop Le,Nhap Lai");
        } else {
            System.out.println("----------Co " + result.size() + " Bi: " + F + "----------");
            result.forEach(System.out::println);
        }
    }

    // SEARCH INFORMATION ABOUT STATUS HEALTH
    public void SearchTinhTrangSucKheo(String TinhTrangSucKheo) {
        List<SinhVien> result = new ArrayList<>();
        result = DanhSachSV.stream().filter(o -> o.getF().equals(TinhTrangSucKheo)).collect(Collectors.toList());
        if (result.size() == 0) {
            System.out.println("Khong Hop Le,Nhap Lai");
        } else {
            System.out.println("----------Co " + result.size() + " Bi: " + TinhTrangSucKheo + "----------");
            result.forEach(System.out::println);
        }
    }

    // SEARCh INFORMATION ABOUT SCHEDULE EXAM
    public void KiemTraLichThi(String ID) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            System.out.println(result.getLichThi());
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // SEARCH INFORMATION ABOUT STATUS FINANCIAL
    public void KiemTraTinhTrangTaiChinh(String ID) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            System.out.println(result.getTinhTrangTaiChinh());
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // SEARCH INFORMATION SCHEDULE SUBJECT
    public void KiemTraLichHoc(String ID) {
        SinhVien result = DanhSachSV.stream().filter(o -> o.getId().equals(ID)).findFirst().orElse(null);
        if (result != null) {
            System.out.println(result.getLichHoc());
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // SEARCH sinhvien GOT SCHOLARSHIP
    public void DatHocBong() {
        List<SinhVien> result = new ArrayList<>();
        result = DanhSachSV.stream().filter(o -> o.getGPA() > 8.0).collect(Collectors.toList());
        if (result.size() < 0) {
            System.out.println("Khong Co Sinh Vien Nao Duoc Hoc Bong");
        } else {
            System.out.println("Co: " + result.size() + "Dat Hoc Bong");
            System.out.println("----------Danh Sach Sinh Vien Dat Hoc Bong--------- ");
            result.forEach(o -> System.out.println("Ho Ten: " + o.getHoTen() + "--ID: " + o.getId()));
        }
    }

    // SEARCH sinhvien GOT LOW GPA
    public void HocLai() {
        List<SinhVien> result = new ArrayList<>();
        result = DanhSachSV.stream().filter(o -> o.getGPA() < 5.0).collect(Collectors.toList());
        if (result.size() < 0) {
            System.out.println("Khong Co Sinh Vien Nao Hoc Lai");
        } else {
            System.out.println("Co : " + result.size() + "Hoc Lai");
            System.out.println("----------Danh Sach Sinh Vien Hoc Lai--------- ");
            result.forEach(o -> System.out.println("Ho Ten: " + o.getHoTen() + "--ID: " + o.getId()));
        }
    }

    // CHANGE INFORMATION sinhvien
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
                        break;
                    }
                    case 2: {
                        System.out.println("Sua Lich Hoc: ");
                        result.setLichHoc(sc.nextLine());
                        break;
                    }
                    case 3: {
                        System.out.println("Sua Lich Kiem Tra: ");
                        result.setLichThi(sc.nextLine());
                        break;
                    }
                    case 4: {
                        System.out.println("Sua GPA: ");
                        result.setGPA(sc.nextDouble());
                        sc.nextLine();
                        break;
                    }
                    case 5: {
                        System.out.println("Sua Tinh Trang Suc Kheo: ");
                        result.setTinhTrangSucKheo(sc.nextLine());
                        break;
                    }
                    case 6: {
                        System.out.println("Sua So Mui Vaccin: ");
                        result.setSoMuiVaccin(sc.nextLine());
                        break;
                    }
                    case 7: {
                        System.out.println("Sua Tinh Trang Nhiem F: ");
                        result.setF(sc.nextLine());
                        break;
                    }
                    case 8: {
                        System.out.println("Sua Ho Ten: ");
                        result.setHoTen(sc.nextLine());
                        break;
                    }
                    case 9: {
                        System.out.println("Sua Tuoi: ");
                        result.setTuoi(sc.nextLine());
                        break;
                    }
                    case 10: {
                        System.out.println("Sua Dia CHi: ");
                        result.setDiaChi(sc.nextLine());
                        break;
                    }
                    case 11: {
                        System.out.println("Sua Gioi Tinh: ");
                        result.setGioiTinh(sc.nextLine());
                        break;
                    }
                    case 12: {
                        System.out.println("Sua So Dien Thoai: ");
                        result.setSDT(sc.nextLine());
                        break;
                    }
                    case 13: {
                        System.out.println("Sua So CMT: ");
                        result.setSoCMT(sc.nextLine());
                        break;
                    }
                    case 14: {
                        System.out.println("Sua Tinh Trang Tai Chinh: ");
                        result.setTinhTrangTaiChinh(sc.nextLine());
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
            XoaBangId(result.getId());
            ThemSV(result);
        } else {
            System.out.println("Khong Hop Le,Nhap Lai");
        }
    }

    // MENU CHANGE INFORMATION
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

    // SORT BY GPA
    public void SapXepGPA() {
        // Collectors.sort(result,(sinhvien sinhvien1,sinhvien sinhvien2)->
        // sinhvien1.getGPA().compareTO(sinhvien2.getGPA()));
        for (int i = 0; i < DanhSachSV.size(); i++) {
            for (int j = i + 1; j < DanhSachSV.size(); j++) {
                if (DanhSachSV.get(i).getGPA() > DanhSachSV.get(i).getGPA()) {
                    Collections.swap(DanhSachSV, i, j);
                }
            }
        }
    }

    // SORT BY NAME
    public void compare() {
        Collections.sort(DanhSachSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                String[] result1 = a.getHoTen().split(" ");
                String[] result2 = b.getHoTen().split(" ");
                return result1[result1.length - 1].compareTo(result2[result2.length - 1]);
            }
        });
    }

    // SORT BY ID
    public void SortById() {
        Collections.sort(DanhSachSV, (sinhvien1, sinhvien2) -> sinhvien1.getId().compareTo(sinhvien2.getId()));
    }
}
