import core.Library;
import model.Author;
import model.Book;
import model.Genre;
import model.User;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import service.UserService;
import servlet.SearchBook;

/**
 * Created by oleks on 25.01.2017.
 */
public class Dispatcher {

//    public static void main(String []args) throws Exception {
//        Library library = new Library();
//
//        library.addBook(new Book("Harry Potter", new Author("Dgoan ","Rouling", 48), new Genre("fantasy")));
//        library.addBook(new Book("one", new Author("Oleksa ","Baza", 52), new Genre("history")));
//
//
//        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
//        context.addServlet(new ServletHolder(new SearchBook(library)), "/search");
//
//        ResourceHandler resource_handler = new ResourceHandler();
//        resource_handler.setResourceBase("public_html");
//
//        HandlerList handlers = new HandlerList();
//        handlers.setHandlers(new Handler[]{resource_handler, context});
//
//        Server server = new Server(8080);
//        server.setHandler(handlers);
//
//        server.start();
//        server.join();
//    }

    public static void main(String []args) {
        UserService userService= new UserService();

        userService.printConnectInfo();

        long userId = userService.addUser("oleksa", "baza", 20);
        System.out.println("User id - " + userId);

        User user = userService.getUser(userId);
        System.out.println("User - " + user);


    }

}
