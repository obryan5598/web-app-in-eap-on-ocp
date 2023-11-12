package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.dekorate.annotation.Dekorate;

@WebServlet("/systemProperty")
@Dekorate
public class SystemPropertyServlet extends HttpServlet {

    static String PAGE_HEADER = "<html><head><title>helloworld</title></head><body>";

    static String PAGE_FOOTER = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String javaVersion = System.getProperty("java.version");
        String testSystemProperty = System.getProperty("testSystemProperty");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);
        writer.println("<h1 style=\"background-color:DodgerBlue;\">Java version: " + javaVersion + "</h1>");
        writer.println("<h1 style=\"background-color:Tomato;\">Test System Property: " + testSystemProperty + "</h1>");
        writer.println(PAGE_FOOTER);
        writer.close();
    }



}
