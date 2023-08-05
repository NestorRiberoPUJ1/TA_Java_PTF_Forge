package com.ayudantias.login_register.controllers;

import com.ayudantias.login_register.models.User;
import com.ayudantias.login_register.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/home")
  public String home(Model model, HttpSession session) {
    User current = userService.findUserById(
      (Long) session.getAttribute("user_id")
    );

    model.addAttribute("user", current);
    return "index.jsp";
  }

  @GetMapping("/login")
  public String login() {
    return "login.jsp";
  }

  @GetMapping("/register")
  public String Register(@ModelAttribute("user") User user) {
    return "register.jsp";
  }

  @PostMapping("/register")
  public String createUser(
    @Valid @ModelAttribute("user") User user,
    BindingResult result,
    HttpSession session
  ) {
    if (result.hasErrors()) {
      return "register.jsp";
    }
    /*
     * Creacion y validacion de contraseña
     */

    User newUser = userService.registerUser(user);

    session.setAttribute("user_id", newUser.getId());

    return "redirect:/home";
  }

  @PostMapping("/login")
  public String loginUser(
    @RequestParam("email") String email,
    @RequestParam("password") String password,
    Model model,
    HttpSession session
  ) {
    if (!userService.authenticateUser(email, password)) {
      model.addAttribute("error", "Credenciales inválidas");
      return "login.jsp";
    }

    User authUser = userService.findByEmail(email);

    session.setAttribute("user_id", authUser.getId());

    //Si el usuario está autenticado, guarde su id de usuario en el objeto Session
    //sino agregue un mensaje de error y retorne a la página de inicio de sesión.

    return "redirect:/home";
  }

  @GetMapping("/logout")
  public String logout(HttpSession session) {
    session.removeAttribute("user_id");
    return "redirect:/login";
  }
}
