package servlet;

import client.Client;
import client.ClientDAO;
import client.ClientDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/loginRegister")
public class LoginRegister extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginRegister () {
    }

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClientDAO cd = new ClientDAOImpl();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
        Client client = cd.getClient(email, password);
        if (submitType.equals("Login") && client != null && client.getEmail() != null) {
            request.setAttribute("message", client.getName());
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } else if (submitType.equals("Register")) {
            client.setEmail(request.getParameter("email"));
            client.setPassword(request.getParameter("password"));
            client.setName(request.getParameter("name"));
            request.setAttribute("successMessage", "Registration completed successfully! Please login to continue.");
            request.getRequestDispatcher("/web/login.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "Client is not found. Please register.");
            request.getRequestDispatcher("/web/login.jsp").forward(request, response);
        }
    }
}