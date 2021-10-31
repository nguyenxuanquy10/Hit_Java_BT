package Bai_3;
import java.lang.Math; 
import java.util.Random;
public class RunMain {
    public static void main(String[] args) {
        Guns DiepBeDe=new Guns(100,"ShotGun"); 
        Guns DoanXinhGai= new Guns(100,"ShotGun"); 
        Random random= new Random();
        while(true){
            DiepBeDe.Load(random.nextInt(10)+1);
            DiepBeDe.Shoot(random.nextInt(10)+1);

              DoanXinhGai.Load(random.nextInt(10)+1);
            DoanXinhGai.Shoot(random.nextInt(10)+1);
          //  System.out.println(DiepBeDe.getAmmoNumber() +"  "+ DoanXinhGai.getAmmoNumber());
           // System.out.println(x1);
            if(DiepBeDe.getAmmoNumber()<=0 && DoanXinhGai.getAmmoNumber()<=0){
                System.out.println("Ca hai cung het dan");
                break;
            }
            else if(DiepBeDe.getAmmoNumber()<=0){
                System.out.println("DiepBeDe thua");
                break;
            }
            else if(DoanXinhGai.getAmmoNumber()<=0){
                System.out.println("DoanXinhGai thua");
                break;
            }

        }

    }
}
