package com.bootcamp;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userProfileCtrl {

    @Autowired
    private JdbcTemplate jdbc;

    @GetMapping("/profileForm")
    public String showForm(Model m) {
        m.addAttribute("user", new User());
        return "profile-form";
    }

    @PostMapping("/submitProfile")
    public String handleForm(@Valid @ModelAttribute("user") User u, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "profile-form";
        }
        jdbc.update("INSERT INTO users (usrname, email, passwrod) VALUES (?, ?, ?)", u.getUsrname(), u.getEmail(), u.getPasswrod());
        m.addAttribute("user", u);
        return "profile-success";
    }
}
