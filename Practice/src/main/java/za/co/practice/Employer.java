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
    /*

    add a method that generates unique id for the user
    by combining name and surname and having the age at the end
    e.g.
        name = John
        surname  = Wick
        Age = 32
        Gender = Male
        id = johwick32

    -Advance form
        make another that generates a id
        using first 3 letters of the name
        the first 3 letters of the suname
        age and capital letter of the first letter of their Gender
        e.g.
            name = John
            surname  = Wick
            Age = 32
            Gender = Male
            id = johwic32M
     */



}
