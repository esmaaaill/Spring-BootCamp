package com.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userProfileCtrl {

    @GetMapping("/profileForm")
    public String showForm(Model m) {
        m.addAttribute("user", new User());
        return "profile-form";
    }

    @PostMapping("/submitProfile")
    public String handleForm(@ModelAttribute("user") User u, Model m) {
        m.addAttribute("user", u);
        return "profile-success";
    }
}
