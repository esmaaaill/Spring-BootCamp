package com.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ageAppController {

    @GetMapping("/showForm")
    public String show() {
        return "age-view";
    }

    @GetMapping("/processAge")
    public String calc(
            @RequestParam("year") String y,
            @RequestParam("month") String mo,
            @RequestParam("day") String d,
            Model m) {

        int inputYear = Integer.parseInt(y);
        int inputMonth = Integer.parseInt(mo);
        int inputDay = Integer.parseInt(d);

        int currentYear = 2026;
        int currentMonth = 8;
        int currentDay = 9;

        int ageYears = currentYear - inputYear;
        int ageMonths = currentMonth - inputMonth;
        int ageDays = currentDay - inputDay;

        if (ageDays < 0) {
            ageMonths = ageMonths - 1;
            ageDays = ageDays + 30;
        }

        if (ageMonths < 0) {
            ageYears = ageYears - 1;
            ageMonths = ageMonths + 12;
        }

        String res = ageYears + " years, " + ageMonths + " months, and " + ageDays + " days";
        m.addAttribute("res", res);

        return "age-view";
    }
}
