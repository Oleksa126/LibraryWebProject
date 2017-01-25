package core;

import model.Book;
import model.User;

import java.util.*;

/**
 * Created by oleks on 25.01.2017.
 */
public class Library {
    List<Book> bookList;
    List<User> userList;

    public Library(){
        bookList = new LinkedList<>();
        userList = new LinkedList<>();
    }

    public void addBook(Book book){bookList.add(book);}

    public void addUser(User user){userList.add(user);}

    public Book searchByAuthor(String str){
        for(int i = 0; i<bookList.size(); i++){
            if (str.equals(bookList.get(i).getTitle())){
                return bookList.get(i);
            }
        }
        return null;
    }

}
