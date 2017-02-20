package model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by oleks on 25.01.2017.
 */
@Entity
@Table(name = "authors")
public class Author implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "age")
    private int age;

    public Author(){}

    public Author(long id){this.id = id;}

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
