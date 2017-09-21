package sait.cprg252;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 728918
 */
public class AgeCalculatorServlet extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/agecalc.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String message = request.getParameter("currentage");
        if (message != null && !message.equals("") && Pattern.matches("[a-zA-Z]+", message) == false){
        int output = Integer.parseInt(message);
         output++;
         request.setAttribute("output", "Your age next birthday will be "+output);
     
        } 
        else{
            request.setAttribute("output", "Please enter something valid into the field before hitting the submit button");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalc.jsp").forward(request, response);
    }

   
}
