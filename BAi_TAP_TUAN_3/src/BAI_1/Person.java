package BAI_1;

public class Person {
    private String Name;
    private int Age;
    private String Gender;
    private String Hobby;

    Person(){}
    Person(String Name, String Gender, int Age, String Hobby) {
        this.Age = Age;
        this.Gender = Gender;
        this.Hobby = Hobby;
        this.Name = Name;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getHobby() {
        return this.Hobby;
    }

    public void setHobby(String Hobby) {
        this.Hobby = Hobby;
    }
   @Override
    public String toString() {
        return "{" +
            " Name='" + getName() + "'" +
            ", Age='" + getAge() + "'" +
            ", Gender='" + getGender() + "'" +
            ", Hobby='" + getHobby() + "'" +
            "}";
    }
}
