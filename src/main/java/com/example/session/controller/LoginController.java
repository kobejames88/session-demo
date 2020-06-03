package com.example.session.controller;

import com.example.session.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 10:35 2018/3/12
 * @Modified By:
 */
@Controller
@RestController
public class LoginController {


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String name,String pwd,HttpServletRequest request,HttpServletResponse response)throws IOException {
        HttpSession session = request.getSession();

        if(name!=null&&pwd!=null) {
            if ((name.equals("root") && pwd.equals("root"))||(name.equals("123") && pwd.equals("123"))) {
//                User user = new User();
//                user.setName(name);
//                user.setPassword(pwd);
//                session.setAttribute("user", user);
//                session.setAttribute("userName", user.getName());
//                session.setAttribute("passWord", user.getPassword());
                session.setAttribute("userName", name);
                 session.setAttribute("passWord", pwd);
//                System.out.println(session.getAttribute("userName"));
//                System.out.println(session.getAttribute("passWord"));
                request.getSession().setMaxInactiveInterval(900);
                response.sendRedirect("other.html");
            }else {
                response.sendRedirect("index.html");
                //response.sendRedirect("error.html");

            }

        }



            return  "";

    }



    @RequestMapping(value="/getSession",method = RequestMethod.GET)
    public String getSession(HttpServletRequest request) {

        String userName=(String) request.getSession().getAttribute("userName");

        System.out.println(userName);
//        System.out.println(request.getSession().getAttribute("passWord"));
        return "aa";



    }

}
