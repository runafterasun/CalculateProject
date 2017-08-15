package prod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import prod.DAO.UserDAO;
import prod.entity.Users;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by admin on 15.08.2017.
 */
@Controller
@RequestMapping("/main")
public class HomeController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("/")
    public ModelAndView handleRequest() throws Exception{
        List<Users> listUser = userDAO.list();
        ModelAndView model = new ModelAndView("UserList");
        model.addObject("userList", listUser);
        return model;
    }
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public ModelAndView newUser(){
        ModelAndView model = new ModelAndView("UserForm");
        model.addObject("user", new Users());
        return model;
    }
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editUser(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        Users users = userDAO.get(userId);
        ModelAndView model = new ModelAndView("UserForm");
        model.addObject("user", users);
        return model;
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView deleteUser(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        userDAO.delete(userId);
        return new ModelAndView("redirect:/");
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute Users user){
        userDAO.seveOrUpdate(user);
        return new ModelAndView("redirect:/");
    }

}
