package Bai00;

public class Newspaper extends CommonBook {
    private String DayOfPublic;

    public Newspaper(String IdCode, String NamePublication, String NumberPublic, String DayOfPublic) {

        this.IdCode = IdCode;
        this.NamePublication = NamePublication;
        this.NumberPublic = NumberPublic;
        this.DayOfPublic = DayOfPublic;

    }

    public String getDayOfPublic() {
        return this.DayOfPublic;
    }

    public void setDayOfPublic(String DayOfPublic) {
        this.DayOfPublic = DayOfPublic;
    }
   @Override
   public String toString(){
       return "{" +
        " IdCode='" + getIdCode() + "'" +
        ", NamePublication='" + getNamePublication() + "'" +
        ", NumberPublic='" + getNumberPublic() + "'" +"DayOfPublic"+" "+getDayOfPublic()+
        "}";
   }
}
