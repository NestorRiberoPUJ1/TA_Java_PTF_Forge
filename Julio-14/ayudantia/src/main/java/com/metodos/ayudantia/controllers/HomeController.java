package com.metodos.ayudantia.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("profesor", "Nestor Ribero");

    int[] nums = { 8, 7, 6, 5, 4, 3, 2, 1, 0 };

    model.addAttribute("numeros", nums);

    String[] nombres = {
      "Max",
      "Checo",
      "Fernando",
      "Lewis",
      "Charles",
      "Carlos",
    };

    model.addAttribute("nombres", nombres);

    return "index.jsp";
  }

  @GetMapping("/clase")
  public String clase(Model model) {
    return "index.jsp";
  }
}
