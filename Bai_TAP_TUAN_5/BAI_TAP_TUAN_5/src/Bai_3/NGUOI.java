package Bai_3;
import java.util.Scanner; 
public class NGUOI {
    protected String HOTEN; 
    protected String NGAYSINH; 
    protected String QUEQUAN; 
    public void NHAP(){
        Scanner sc= new Scanner(System.in);
        System.out.println("NHAP HOTEN: "); 
        HOTEN=sc.nextLine();
        System.out.println("NHAP NGAYSINH: "); 
        NGAYSINH=sc.nextLine();
        System.out.println("NHAP QUEQUAN: "); 
        QUEQUAN=sc.nextLine();
    }
    public void XUAT(){
        System.out.println("HOTEN: "+HOTEN); 
    
        System.out.println("NGAYSINH: "+NGAYSINH); 
       
        System.out.println("QUEQUAN: "+QUEQUAN); 
    }
}
