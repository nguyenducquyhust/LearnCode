package Ex3;

public class Person {
    protected String name;
    protected String gender;
    protected String location;
    protected String dob;


    public Person(String name, String gender, String location, String dob) {
        this.name = this.name;
        this.gender = this.gender;
        this.location = this.location;
        this.dob = this.dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


}
