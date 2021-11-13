package Bai_1;
import java.util.Scanner; 
public class SanPham{
    protected String MASP; 
    protected String TENSP; 
    protected String TENHANGSP; 
    protected String NGAYNHAP; 

    public SanPham(String MASP, String TENSP, String TENHANGSP, String NGAYNHAP) {
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.TENHANGSP = TENHANGSP;
        this.NGAYNHAP = NGAYNHAP;
    }
    public void NHAP(){
       Scanner sc= new Scanner(System.in); 
       System.out.println("NHAP MASP: "); MASP=sc.nextLine(); 
       System.out.println("NHAP TENSP: "); TENSP=sc.nextLine(); 
       System.out.println("NHAP TENHANGSP: "); TENHANGSP=sc.nextLine(); 
       System.out.println("NHAP NGAYNHAP: "); NGAYNHAP=sc.nextLine(); 
    }
    public void XUAT(){
        System.out.println("MASP: "+MASP); 
       System.out.println("TENSP: "+TENSP);
       System.out.println("TENHANGSP: "+ TENHANGSP);  
       System.out.println("NGAYNHAP: "+NGAYNHAP);
    }

    public SanPham() {
    }

  
    public String getTENHANGSP() {
        return this.TENHANGSP;
    }

   

}