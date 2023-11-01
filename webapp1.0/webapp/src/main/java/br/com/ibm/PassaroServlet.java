package br.com.ibm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/passaro")

public class PassaroServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Passaro passaro = new Passaro("Jonas","Papagaio", 1, "Louro", "Verde");
        String som = passaro.fazerSom();

        request.setAttribute("passaro", passaro);
        request.getRequestDispatcher("/passaro.jsp").forward(request,response);

    }
}
