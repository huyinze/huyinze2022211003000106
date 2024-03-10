package com.HuYinZe.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorldServlet extends HttpServlet {
    public HelloWorldServlet() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<body><html>");
        out.println("name : Hu YinZe"+"<br>");
        out.println("Student Id: 2022211003000106"+"<br>");
        out.println("</body></html>");

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date day = new Date();
        out.println("<html><body>");
        out.println("Date and Time: " + df.format(day));
        out.println("</body></html>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
    }
}