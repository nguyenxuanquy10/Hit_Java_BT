package TUAN_10;

public class Account {
    private long id; 
    private String fulName; 
    private String userName;
    private String passWord; 
    private String email; 
    private String phone ; 
    private String createAt; 

    public Account(long id, String fulName, String userName, String passWord, String email, String phone, String createAt) {
        this.id = id;
        this.fulName = fulName;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.phone = phone;
        this.createAt = createAt;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFulName() {
        return this.fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    public String toStringFile(){
        return id+"-"+fulName+"-"+userName+"-"+passWord+"-"+email+"-"+phone+"-"+createAt;
    }
    public Account(){
        
    }
   @Override
   public boolean equals(Object obj) {
     Account newa=(Account)obj; 

      if(this.id==newa.getId() || userName.compareTo(newa.getUserName())==0){
          return true;
      }
      return false; 
   }
}
