package model;

/**
 * Created by oleks on 25.01.2017.
 */
public class User {

    private String login;
    private String password;

    private String firstName;
    private String lastName;
    private int age;

    User(){}

    public void setLogin(String login){this.login = login;}

    public void setPassword(String password){
        if(this.password.isEmpty())
            this.password = password;
    }

    public void setFirstName(String firstName){this.firstName = firstName;}

    public void setLastName(String lastName){this.lastName = lastName;}

    public void setAge(int age){this.age = age;}

    public String getLogin(){return login;}

    public String getPassword(){return password;}

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public int getAge(){return age;}
}
