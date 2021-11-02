package Bai00;

public class Book extends CommonBook{
    private String NameAuthor; 
    private int NumberPage; 
    public Book() {

    }
    public Book(String IdCode, String NamePublication, String NumberPublic,String NameAuthor,int NumberPage)  {
        this.IdCode = IdCode;
        this.NamePublication = NamePublication;
        this.NumberPublic = NumberPublic;
        this.NumberPage=NumberPage; 
        this.NameAuthor=NameAuthor; 
    }

    public String getNameAuthor() {
        return this.NameAuthor;
    }

    public void setNameAuthor(String NameAuthor) {
        this.NameAuthor = NameAuthor;
    }

    public int getNumberPage() {
        return this.NumberPage;
    }

    public void setNumberPage(int NumberPage) {
        this.NumberPage = NumberPage;
    }
   @Override
   public String toString(){
    return "{" +
    " IdCode='" + getIdCode() + "'" +
    ", NamePublication='" + getNamePublication() + "'" +
    ", NumberPublic='" + getNumberPublic() + "'" +"NameAuthor"+" "+getNameAuthor()+""+"NumberPage"+getNumberPage()+
    "}";
   }
}
