package servlet;

import com.google.gson.Gson;
import core.Library;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by oleks on 25.01.2017.
 */
public class SearchBook extends HttpServlet {
    private final Library library;

    public SearchBook(Library library){this.library = library;}

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        Gson gson = new Gson();
        String str = request.getParameter("name");
        String json = gson.toJson(library.searchByAuthor(str));
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(json);
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
