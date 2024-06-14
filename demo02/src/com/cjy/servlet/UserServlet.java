package com.cjy.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String info="登录失败";
        if("test0110".equals(username)&&"1234qaz@WE".equals(password)){
            info="登录成功";
        }
//        resp.setContentType("text/html;charset=UTF-8");
//        PrintWriter printWriter=resp.getWriter();
//        printWriter.write(info);
        req.setAttribute("info",info);
        req.getRequestDispatcher("WEB-INF/content/demo.jsp").forward(req, resp);
    }
}
