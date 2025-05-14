package za.co.practice;
/*
    Write test for this class
 */
public class Employer {
    private String name;
    private int age;
    private String gender;

    public Employer(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = "unspecified";
    }
    public Employer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


}
