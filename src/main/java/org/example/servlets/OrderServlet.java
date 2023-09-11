package org.example.servlets;

import org.example.data.OrderData;
import org.example.dto.OrderDTO;
import org.example.service.FileSaver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.example.data.OrderData.orders;

@WebServlet("/orders")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderDTO orderDTO = OrderDTO.builder()
                .name(request.getParameter("username"))
                .product(request.getParameter("product"))
                .orderNumber(OrderData.orderNumber+1)
                .quantity(Integer.parseInt(request.getParameter("quantity")))
                .build();
        orders.add(orderDTO);
        OrderData.orderNumber++;
        FileSaver.saveUser(orderDTO);

        request.setAttribute("ordernumber", orderDTO.getOrderNumber());
        request.setAttribute("username", orderDTO.getName());
        request.setAttribute("product", orderDTO.getProduct());
        request.setAttribute("quantity", orderDTO.getQuantity());

        request.getRequestDispatcher("orderfinish.jsp").forward(request, response);
    }
}
