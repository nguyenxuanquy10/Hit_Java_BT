package Bai00;

public class CommonBook {
   protected String IdCode; 
   protected String NamePublication; 
   protected String NumberPublic; 
    public CommonBook() {
        
    }

    public CommonBook(String IdCode, String NamePublication, String NumberPublic) {
        this.IdCode = IdCode;
        this.NamePublication = NamePublication;
        this.NumberPublic = NumberPublic;
    }

    public String getIdCode() {
        return this.IdCode;
    }

    public void setIdCode(String IdCode) {
        this.IdCode = IdCode;
    }

    public String getNamePublication() {
        return this.NamePublication;
    }

    public void setNamePublication(String NamePublication) {
        this.NamePublication = NamePublication;
    }

    public String getNumberPublic() {
        return this.NumberPublic;
    }

    public void setNumberPublic(String NumberPublic) {
        this.NumberPublic = NumberPublic;
    }

 
    @Override
    public String toString() {
        return "{" +
            " IdCode='" + getIdCode() + "'" +
            ", NamePublication='" + getNamePublication() + "'" +
            ", NumberPublic='" + getNumberPublic() + "'" +
            "}";
    }
  

}