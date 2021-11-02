package Bai_3;

public class Guns {
    private int ammoNumber;
    private String weaponName; 
    public void Load(int x){
          this.ammoNumber=this.ammoNumber+x; 
    }
    public void Shoot(int x){
        if(this.ammoNumber>=x){
            this.ammoNumber=this.ammoNumber-x; 
        }
        else this.ammoNumber=0; 
         
    }

    public Guns() {
    }


    public Guns(int ammoNumber, String weaponName) {
        this.ammoNumber = ammoNumber;
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

