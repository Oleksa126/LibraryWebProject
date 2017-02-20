package model;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by oleks on 25.01.2017.
 */

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = -8706689714326132798L;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;           // дод в констуктор

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public User(){}

    public User(long id){
        this.id = id;
    }

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

    public boolean setEmail(String email){
        Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]\\w+)*\\.\\w{2,4}");
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()){
            this.email = email;
        }

        return matcher.matches();

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

    public String toString(){
        return "first name - " + firstName + " last name - " + lastName + " age " + age;
    }
}
