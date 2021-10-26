package Bai_3;
import java.lang.Math; 
public class RunMain {
    public static void main(String[] args) {
        Guns DiepBeDe=new Guns("ShotGun"); 
        Guns DoanXinhGai= new Guns("ShotGun"); 
        while(true){
            double x01=Math.random(); 
            double x02=Math.random(); 
            x01=x01*10+1; 
            x02=x02*10+1; 
            int x1=(int)x01;
            int x2=(int)x02;
           // System.out.println(x1);
            if(DiepBeDe.getAmmoNumber()<=x1 && DoanXinhGai.getAmmoNumber()<=x2){
                System.out.println("Ca hai cung het dan");
                break;
            }
            else if(DiepBeDe.getAmmoNumber()<=x1){
                System.out.println("DiepBeDe thua");
                break;
            }
            else if(DoanXinhGai.getAmmoNumber()<=x2){
                System.out.println("DoanXinhGai thua");
                break;
            }
            DiepBeDe.Shoot(x1);
            DoanXinhGai.Shoot(x2);
          
        }

    }
}
