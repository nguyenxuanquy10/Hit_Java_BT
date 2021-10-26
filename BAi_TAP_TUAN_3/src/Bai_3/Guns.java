package Bai_3;

public class Guns {
    private int ammoNumber=100;
    private String weaponName; 
    public void Load(int x){
          this.ammoNumber=this.ammoNumber+x; 
    }
    public void Shoot(int x){
        if(this.ammoNumber>=x){
            this.ammoNumber=this.ammoNumber-x; 
        }
        else{
            System.out.println("het dan");
        }
    }

    public Guns() {
    }

    public Guns( String weaponName) {
      
        this.weaponName = weaponName;
    }


    public int getAmmoNumber() {
        return this.ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return this.weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    
}
