package repository.jdbcImpl;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import model.Book;
import model.User;
import repository.BookRepository;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by oleks on 25.01.2017.
 */
public class JDBCBookRepository implements BookRepository {
    private final String URL = "jdbc:mysql://127.0.0.1:3306/bookrepository";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    public JDBCBookRepository(){
        Connection connection;

        try{
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);


            if(!connection.isClosed()){
                System.out.println("is good");
            }
            connection.close();


        }catch (SQLException e){
            System.out.println("SQLException " + e.getMessage());
            System.out.println("SQLStata " + e.getSQLState());
        }
    }


    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Book getByGenre() {
        return null;
    }

    @Override
    public Book getByAuthor() {
        return null;
    }

}
