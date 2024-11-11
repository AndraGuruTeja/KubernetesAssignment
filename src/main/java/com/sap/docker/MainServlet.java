package com.sap.docker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the 'name' parameter from the URL
        String name = req.getParameter("name");

        // Set the response content type to HTML
        resp.setContentType("text/html");

        // Start writing the HTML response
        resp.getWriter().write("<html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("<style>");
        // CSS for background color and other styling
        resp.getWriter().write("body { background-color: lightblue; color: black; font-family: Arial, sans-serif; }");
        resp.getWriter().write("</style>");
        resp.getWriter().write("</head>");
        resp.getWriter().write("<body>");
        resp.getWriter().write("<h1>Hello " + (name != null ? name : "Guest") + "</h1>");
        resp.getWriter().write("</body>");
        resp.getWriter().write("</html>");
        
        resp.getWriter().close();
    }
}
