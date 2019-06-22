package top.ninwoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import top.ninwoo.service.UserService;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/submitLogin", method = RequestMethod.POST)
    public ModelAndView submitLogin(@RequestParam("name") String name, @RequestParam("password") String password,
                                    HttpSession session) {
        if(userService.getUser(name, password) == null) {

            return new ModelAndView("login/loginfail");
        }

        session.setAttribute("user", name);
        return new ModelAndView(new RedirectView("index"));
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login/login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session, HttpServletResponse response) {
        session.removeAttribute("user");
        return "index";
    }
}
