package model;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by oleks on 25.01.2017.
 */

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = -8706689714326132798L;

    private String login;
    private String password;

    @Column(name = "firsName", unique = true, updatable = false)
    private String firstName;

    @Column(name = "lastName", unique = true, updatable = false)
    private String lastName;

    @Column(name = "age", unique = true, updatable = false)
    private int age;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public User(String firstName, String lastName, int age){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public void setLogin(String login){this.login = login;}

    public void setPassword(String password){
        if(this.password.isEmpty())
            this.password = password;
    }

    public void setFirstName(String firstName){this.firstName = firstName;}

    public void setLastName(String lastName){this.lastName = lastName;}

    public void setAge(int age){this.age = age;}

    public void setId(long id){this.id = id;}


    public String getLogin(){return login;}

    public String getPassword(){return password;}

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public int getAge(){return age;}

    public long getId(){return id;}
}
