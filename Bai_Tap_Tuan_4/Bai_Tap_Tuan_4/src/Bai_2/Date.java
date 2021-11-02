package Bai_2;
import java.util.Scanner; 
public class Date {
    private int D; 
    private int M; 
    private int Y; 
    public void NHAP(){
       Scanner sc=new Scanner(System.in); 
       System.out.println("NHAP NGAY: ") ; D=sc.nextInt(); 
       System.out.println("NHAP THANG: ") ; M=sc.nextInt();
       System.out.println("NHAP NAM:  ") ;  Y=sc.nextInt();
    }
    public void XUAT(){
        System.out.println("NGAY:"+D+"/"+M+"/"+Y);
    }
}
