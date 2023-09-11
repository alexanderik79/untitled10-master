package org.example.servlets;

import org.example.dto.UserDTO;
import org.example.service.FileSaver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.example.data.UserData.users;

@WebServlet("/registration")
public class RegistrServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDTO userDTO = UserDTO.builder()
                .name(request.getParameter("username"))
                .email(request.getParameter("email"))
                .pass(request.getParameter("password"))
                .build();
        users.add(userDTO);
        FileSaver.saveUser(userDTO);
    request.setAttribute("username", userDTO.getName());
    request.setAttribute("email", userDTO.getEmail());
    request.getRequestDispatcher("rsuccess.jsp").forward(request, response);
    }
}
