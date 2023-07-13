package com.ayudantia.demo.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home(Model model, HttpSession session) {
    model.addAttribute("dojoName", "California");
    session.setAttribute("count", 24);
    return "index.jsp";
  }

  @GetMapping("/session")
  public String show_Session(Model model, HttpSession session) {
    Integer count = (Integer) session.getAttribute("count");
    count++;
    session.setAttribute("count", count);
    model.addAttribute("count", count);
    return "session.jsp";
  }
}
