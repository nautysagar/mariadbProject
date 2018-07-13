package org.example.controllers;

import org.example.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {


  @Autowired UserDao userDao;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("users", userDao.getAll());
    return "/index";
  }

}
