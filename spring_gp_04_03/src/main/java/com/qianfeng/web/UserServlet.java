package com.qianfeng.web;

import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import org.springframework.web.context.ContextLoader;
import sun.net.httpserver.HttpServerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by liuhuan on 2020/3/22 16:03
 */
public class UserServlet extends HttpServlet {
    private UserService userService = (UserService)ContextLoader.getCurrentWebApplicationContext().getBean("userServiceImpl");
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        try {
            User user = userService.queryUserById(id);
            req.setAttribute("user",user);
            req.getRequestDispatcher("/user.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
