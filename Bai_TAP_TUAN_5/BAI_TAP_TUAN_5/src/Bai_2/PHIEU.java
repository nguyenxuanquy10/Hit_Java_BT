package Bai_2;
import java.util.Scanner; 
import java.util.ArrayList; 
public class PHIEU {
    private String MAPHIEU; 
    private String TENPHIEU; 
    DATETIME a; 
    ArrayList<SANPHAM> x; 
    int n; 
    public void INPUTPHIEU(){
      Scanner sc= new Scanner(System.in);
      a=new DATETIME();
      System.out.println("NHAP MAPHIEU: ");
      MAPHIEU=sc.nextLine(); 
      System.out.println("NHAP TENPHIEU: ");
      TENPHIEU=sc.nextLine();
      System.out.println("NHAP DATETIME"); 
      a.INPUTDATE();
      System.out.println("NHAP N"); 
      n=sc.nextInt(); 
      x=new ArrayList<>();
      System.out.println("NHAP THONG TIN SAN PHAM"); 
      for(int i=0;i<n;i++){
          SANPHAM x1=new SANPHAM();
          System.out.println("SAN PHAM THU "+ (i+1));
          x1.INPUTSP();
          
          x.add(x1);
      }

    }
    public void OUTPUTPHIEU(){
        System.out.println("THONG TIN DATETIME");
        a.OUTPUTDATE();
        System.out.println("XUAT THONG TIN SAN PHAM"); 
        for(int i=0;i<n;i++){
            System.out.println("SAN PHAM THU "+ (i+1));
            x.get(i).OUTPUTSP();
        }
  
    }

    public PHIEU() {
    }

}
