package Bai_1;
import java.util.Scanner; 
public class DieuHoa extends SanPham{
    private String CONGXUAT; 
    private int GIABAN; 

    public DieuHoa(String CONGXUAT, int GIABAN,String MASP, String TENSP, String TENHANGSP, String NGAYNHAP) {
        super(MASP, TENSP, TENHANGSP, NGAYNHAP);
        this.CONGXUAT = CONGXUAT;
        this.GIABAN = GIABAN;
    }

    public DieuHoa() {
    }

    public void NHAP(){
        super.NHAP();
        Scanner sc= new Scanner(System.in); 
        System.out.println("NHAP CONGXUAT: "); CONGXUAT=sc.nextLine(); 
        System.out.println("NHAP GIABAN: "); GIABAN=sc.nextInt(); 
    }
    public void XUAT(){
        super.XUAT();
        System.out.println("CONGXUAT: "+CONGXUAT); 
        System.out.println("GIABAN: "+GIABAN);
    }

    public int getGIABAN() {
        return this.GIABAN;
    }
}
