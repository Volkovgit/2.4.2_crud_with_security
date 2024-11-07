package web.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getUser(ModelMap model) {
        List<User> userList = userService.listUsers();
        model.addAttribute("users", userList);
        return "users";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(ModelMap model, @PathVariable(required = true) int id) {
        userService.deleteUser(userService.getUserById(id));
        List<User> userList = userService.listUsers();
        model.addAttribute("users", userList);
        return "redirect:/";
    }

    @GetMapping("/user/update/{id}")
    public String editUser(ModelMap model, @PathVariable(required = true) int id) {
        User user = userService.getUserById(id);
        if (user == null) return "redirect:/";
        model.addAttribute("user", user);
        return "userEdit";
    }

    @PostMapping("/user/update/{id}")
    public String saveUser(@PathVariable(required = true) int id, @Valid @ModelAttribute("user") User userFromRequest) {
        userService.updateUser(id,userFromRequest);
        return "redirect:/";
    }

    @GetMapping("/user/create")
    public String showEditUserPage() {
        return "userAdd";
    }

    @PostMapping("/user/create")
    public String createUser(@Valid @ModelAttribute("user") User userFromRequest) {
        userService.saveUser(userFromRequest);
        return "redirect:/";
    }
}
