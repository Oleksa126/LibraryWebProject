package model;

/**
 * Created by oleks on 25.01.2017.
 */
public class Author {
    private String firstName;
    private String lastName;
    private int age;

    Author(){}

    public Author(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public int getAge(){return age;}
}
