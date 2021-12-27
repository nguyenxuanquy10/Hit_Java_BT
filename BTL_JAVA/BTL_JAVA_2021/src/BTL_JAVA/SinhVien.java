package BTL_JAVA;

import java.security.Provider;
import java.util.Scanner;

// private String Id;
// private String TinhTrangTaiChinh;
// private String LichHoc;
// private String LichThi;
// private double GPA;
// private String TinhTrangSucKheo;
// private String SoMuiVaccin;
// private String F;
public class SinhVien extends Nguoi implements Regex_taikhoan{
    private String Id;
    private String Matkhau;
    private String TinhTrangTaiChinh;
    private String LichHoc;
    private String LichThi;
    private double GPA;
    private String TinhTrangSucKheo;
    private String SoMuiVaccin;
    private String F;

    public SinhVien() {

    }

    // public SinhVien(String HoTen, String Tuoi, String DiaChi, String GioiTinh,
    // String SDT, String SoCMT, String Id, String TinhTrangTaiChinh,
    // String LichHoc, String LichThi, double GPA,
    // String TinhTrangSucKheo, String SoMuiVaccin, String F)
    public SinhVien( String Id, String Matkhau,String HoTen,String Tuoi, String DiaChi, String GioiTinh,
                     String SDT, String SoCMT, String TinhTrangTaiChinh,
                     String LichHoc, String LichThi, double GPA,
                     String TinhTrangSucKheo, String SoMuiVaccin, String F){
        super(HoTen, Tuoi, DiaChi, GioiTinh, SDT, SoCMT);
        this.Id = Id;
        this.Matkhau=Matkhau;
        this.TinhTrangTaiChinh = TinhTrangTaiChinh;
        this.LichHoc = LichHoc;
        this.LichThi = LichThi;
        this.GPA = GPA;
        this.TinhTrangSucKheo = TinhTrangSucKheo;
        this.SoMuiVaccin = SoMuiVaccin;
        this.F = F;
    }

    public SinhVien(SinhVien a) {
        super(a);
        this.Id = a.Id;
        this.Matkhau=Matkhau;
        this.TinhTrangTaiChinh = a.TinhTrangTaiChinh;
        this.LichHoc = a.LichHoc;
        this.LichThi = a.LichThi;
        this.GPA = a.GPA;
        this.TinhTrangSucKheo = a.TinhTrangSucKheo;
        this.SoMuiVaccin = a.SoMuiVaccin;
        this.F = a.F;
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getMatkhau() {
        return this.Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }
    public String getTinhTrangTaiChinh() {
        return this.TinhTrangTaiChinh;
    }

    public void setTinhTrangTaiChinh(String TinhTrangTaiChinh) {
        this.TinhTrangTaiChinh = TinhTrangTaiChinh;
    }

    public String getLichHoc() {
        return this.LichHoc;
    }

    public void setLichHoc(String LichHoc) {
        this.LichHoc = LichHoc;
    }

    public String getLichThi() {
        return this.LichThi;
    }

    public void setLichThi(String LichThi) {
        this.LichThi = LichThi;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getTinhTrangSucKheo() {
        return this.TinhTrangSucKheo;
    }

    public void setTinhTrangSucKheo(String TinhTrangSucKheo) {
        this.TinhTrangSucKheo = TinhTrangSucKheo;
    }

    public String getSoMuiVaccin() {
        return this.SoMuiVaccin;
    }

    public void setSoMuiVaccin(String SoMuiVaccin) {
        this.SoMuiVaccin = SoMuiVaccin;
    }

    public String getF() {
        return this.F;
    }

    public void setF(String F) {
        this.F = F;
    }

    @Override
    public String toString() {

        return  " Id='" + getId() + "'" +" Matkhau='" + getMatkhau() + "'" + ", TinhTrangTaiChinh='" + getTinhTrangTaiChinh()
                + "'" + ", LichHoc='" + getLichHoc() + "'" + ", LichThi='" + getLichThi()
                + "'" + ", GPA='" + getGPA() + "\n'" + ", TinhTrangSucKheo='" + getTinhTrangSucKheo() + "'"
                + ", SoMuiVaccin='"
                + getSoMuiVaccin() + "'" + ", F='" + getF() + "'" +  super.toString() ;
    }

    public String toStringFile() {
        return Id+"-"+Matkhau+ "-" + LichThi + "-" + LichHoc + "-"
        + TinhTrangTaiChinh + "-" + GPA + "-"
        + SoMuiVaccin + "-" + TinhTrangSucKheo + "-" + F+"-"+super.toStringFile();
        // return super.toStringFile() + "-" + Id + "-" + LichThi + "-" + LichHoc + "-"
        //         + TinhTrangTaiChinh + "-" + GPA + "-"
        //         + SoMuiVaccin + "-" + TinhTrangSucKheo + "-" + F;
    }

    public void NhapSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id: ");
        Id = sc.nextLine();
        System.out.println("Nhap Matkhau: ");
        Matkhau = sc.nextLine();
        System.out.println("Nhap TinhTrangTaiChinh: ");
        TinhTrangTaiChinh = sc.nextLine();
        System.out.println("Nhap LichHoc: ");
        LichHoc = sc.nextLine();
        System.out.println("Nhap LichThi: ");
        LichThi = sc.nextLine();
        System.out.println("Nhap GPA: ");
        GPA = sc.nextDouble();
        sc.nextLine();
        super.NhapNguoi();
    }

    public void KhaiBaoYTe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------KHai Bao Y Te---------");
        System.out.println("Tinh Trang Suc Kheo (Om,Ho,CamLanh,DauDau,....,Tot) ?");
        // TinhTrangSucKheo = sc.nextLine();
        setTinhTrangSucKheo(sc.nextLine());
        System.out.println("Ban Da Tiem May Mui Vaccin ? ");
        // SoMuiVaccin = sc.nextLine();
        setSoMuiVaccin(sc.nextLine());
        System.out.println("Ban La F May(F1,F2,F3,...) ?");
        setF(sc.nextLine());
    }

    public void OutPutsinhvien() {

    }

    /// -MODIFER sinhvien
    // change all information
    public void ThayDoiThongTinCuThe(Scanner sc) {
        int x1 = 1;

        while (x1 != 0) {
            MenuThayDoiThongTinCuThe();
            System.out.println("Nhap Lua Chon");
            int x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                // sc.nextLine();
                case 1: {
                    System.out.println("1.Nhap Tinh Trang Suc Kheo: ");

                    setTinhTrangSucKheo(sc.nextLine());
                    break;
                }
                case 2: {
                    System.out.println("2.Nhap So Mui Vacci Da Tiem: ");
                    setSoMuiVaccin(sc.nextLine());
                    break;
                }
                case 3: {
                    System.out.println("3.Nhap F: ");
                    setF(sc.nextLine());
                    break;
                }
                case 4: {
                    System.out.println("4.Nhap Ho Ten: ");
                    setHoTen(sc.nextLine());
                    break;
                }
                case 5: {
                    System.out.println("5.Nhap Tuoi: ");
                    setTuoi(sc.nextLine());
                    break;
                }
                case 6: {
                    System.out.println("6.Nhap Dia Chi: ");
                    setDiaChi(sc.nextLine());
                    break;
                }
                case 7: {
                    System.out.println("7.Nhap Gioi Tinh: ");
                    setGioiTinh(sc.nextLine());
                    break;
                }
                case 8: {
                    System.out.println("8.Nhap SDT: ");
                    setSDT(sc.nextLine());
                    break;
                }
                case 9: {
                    System.out.println("9.Nhap So CMT: ");
                    setSoCMT(sc.nextLine());
                    break;
                }
                case 10: {
                    System.out.println("10.Nhap Tinh Trang Tai Chinh: ");
                    setTinhTrangTaiChinh(sc.nextLine());
                    break;
                }
                case 11: {
                    x1 = 0;
                    break;
                }
                default: {
                    System.out.println("INVALID , INPUT AGAIN");
                }
            }
        }

    }

    // menu thay doi thong tin ca nhan
    public void MenuThayDoiThongTinCuThe() {
        System.out.println("1.Thay Doi Tinh Trang Suc Kheo: ");
        System.out.println("2.Thay Doi So Mui Vacci Da Tiem: ");
        System.out.println("3.Thay Doi F: ");
        System.out.println("4.Thay Doi Ho Ten: ");
        System.out.println("5.Thay Doi Tuoi: ");
        System.out.println("6.Thay Doi Dia Chi: ");
        System.out.println("7.Thay Doi Gioi Tinh: ");
        System.out.println("8.Thay Doi SDT: ");
        System.out.println("9.Thay Doi So CMT: ");
        System.out.println("10.Thay Doi Tinh Trang Tai Chinh: ");
        System.out.println("11.Thoat Chuong Trinh: ");
    }
    // khai bao y te

    public void SetTatCaThongTingNguoi(SinhVien a) {
        super.SetTatCaThongTingNguoi(a);
        this.Id = a.Id;
        this.Matkhau=a.Matkhau; 
        this.TinhTrangTaiChinh = a.TinhTrangTaiChinh;
        this.LichHoc = a.LichHoc;
        this.LichThi = a.LichThi;
        this.GPA = a.GPA;
        this.TinhTrangSucKheo = a.TinhTrangSucKheo;
        this.SoMuiVaccin = a.SoMuiVaccin;
        this.F = a.F;

    }

    // xem lich hoc
    public void CheckLichHoc() {
        System.out.println("----------Your Schedule SubJect----------");
        System.out.println(getLichHoc());
    }

    // xem lich thi
    public void CheckLichThi() {
        System.out.println("----------Your Schedule Exam----------");
        System.out.println(getLichThi());
    }

    // doong hoc phi
    public void DongHoc(Scanner sc) {
        String s = getTinhTrangTaiChinh();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.') {
                result += Character.toString(s.charAt(i));
            }
        }
        if (result.isEmpty()) {
            System.out.println("Dong Du Hoc Phi");
            return;
        }
        result = result.trim();

        double DebtFee = Double.parseDouble(result);

        if (DebtFee == 0) {
            System.out.println("Dong Du Hoc Phi");
            return;
        }
        System.out.println("Your Fee Debt :" + DebtFee);
        System.out.println("Nhap your money");
        double x = sc.nextDouble();
        DebtFee = DebtFee - x;
        if (DebtFee > 0) {
            System.out.println("So Tien Con Thieu: " + Math.abs(DebtFee));
            setTinhTrangTaiChinh("Thieu: " + DebtFee);
        } else if (DebtFee < 0) {
            System.out.println("So Tien Con Thua: " + Math.abs(DebtFee));
            setTinhTrangTaiChinh("Thua: " + -DebtFee);
        } else {
            setTinhTrangTaiChinh("Dong Du Hoc Phi");

        }
    }

    // change heath status
    public void ThayDoiTinhTrangSucKheo(String TinhTrangSucKheo, String SoMuiVaccin, String F) {
        this.TinhTrangSucKheo = TinhTrangSucKheo;
        this.SoMuiVaccin = SoMuiVaccin;
        this.F = F;
    }

    //xem thong tin sinh vien
    public void XemThongTin() {
        System.out.println("----------Thong Tin Cua Sinh Vien La----------");
        super.XemThongTin();
        System.out.printf("ID:%-16s MATKHAU:%-10s GPA:%-3f LICHHOC:%-20s LICHTHI:%-16s TINHTRANGTAICHINH:%-20s\n", Id,Matkhau, GPA, LichHoc,
                LichThi, TinhTrangTaiChinh);
        System.out.printf("TINHTRANGSUCKHEO:%-10s SOMUIVACINATE:%-5s SOMUIDATIEM:%-10s\n", TinhTrangSucKheo,
                SoMuiVaccin, F);
    }

    public void CheckGPA() {
        System.out.println("Diem GPA Cua Ban: " + GPA);
    }
    
    // regex_account
    @Override
    public void regex_cmt() {
        
    }
    @Override
    public void regex_id() {
        
    }
    @Override
    public void regex_matkhau() {
        
    }
    @Override
    public void regex_sdt() {
        
    }
}
