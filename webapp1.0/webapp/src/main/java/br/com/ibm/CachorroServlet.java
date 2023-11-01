package br.com.ibm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cachorro")

public class CachorroServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cachorro cachorro = new Cachorro("Brutus","Canino", 2, "Bullgod", "Cinza");
        String som = cachorro.fazerSom();

        request.setAttribute("cachorro", cachorro);
        request.getRequestDispatcher("/cachorro.jsp").forward(request,response);

    }
}