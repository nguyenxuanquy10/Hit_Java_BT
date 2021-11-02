package Bai00;

public class Maga extends CommonBook {

    private String NumberDayPublic;
    private String MonthPublic;

    public Maga(String IdCode, String NamePublication, String NumberPublic, String NumberDayPublic,
            String MonthPublic) {
        this.IdCode = IdCode;
        this.NamePublication = NamePublication;
        this.NumberPublic = NumberPublic;
        this.MonthPublic = MonthPublic;
        this.NumberDayPublic = NumberDayPublic;
    }

    public String getNumberDayPublic() {
        return this.NumberDayPublic;
    }

    public void setNumberDayPublic(String NumberDayPublic) {
        this.NumberDayPublic = NumberDayPublic;
    }

    public String getMonthPublic() {
        return this.MonthPublic;
    }

    public void setMonthPublic(String MonthPublic) {
        this.MonthPublic = MonthPublic;
    }
    @Override
    public String toString(){
        return "{" +
        " IdCode='" + getIdCode() + "'" +
        ", NamePublication='" + getNamePublication() + "'" +
        ", NumberPublic='" + getNumberPublic() + "'" +"NumberDayPublic"+" "+getNumberDayPublic()+""+"MonthPublic"+getMonthPublic()+
        "}";
    }

}
