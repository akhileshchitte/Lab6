package me.akhilesh.lab6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        int a =Integer.parseInt(req.getParameter("num1"));
        int b =Integer.parseInt(req.getParameter("num2"));
        int c = a + b;


        PrintWriter out = res.getWriter();
        out.println("The Sum is: "+ c);
    }
}