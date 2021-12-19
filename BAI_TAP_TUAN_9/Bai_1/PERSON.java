package Bai_1;
import java.util.Scanner; 
public class PERSON implements Comparable<PERSON>{
    private String name; 
    private String id; 
    private String address; 

    public PERSON() {
    }

    public PERSON(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PERSON name(String name) {
        setName(name);
        return this;
    }

    public PERSON id(String id) {
        setId(id);
        return this;
    }

    public PERSON address(String address) {
        setAddress(address);
        return this;
    }
    public void nhap(Scanner sc){
        System.out.print("Enter id of person: "); this.id = sc.nextLine();
        System.out.print("Enter name of person: "); this.name = sc.nextLine();
        System.out.print("Enter address of person: "); this.address = sc.nextLine();
    }
  @Override
  public int compareTo(PERSON o) {
      return id.compareTo(o.getId());
  }
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", id='" + getId() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }

}
