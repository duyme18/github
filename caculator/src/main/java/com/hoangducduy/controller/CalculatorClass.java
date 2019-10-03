package com.hoangducduy.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("index")
public class CalculatorClass {
    @GetMapping
    public ModelAndView showCalculator() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping
    public String calculator(@RequestParam("num") String[] num, @RequestParam("choose") String choose, Model model) {

        double n;
        switch (choose) {
            case "Addition(+)":
                n = Double.parseDouble(num[0]) + Double.parseDouble(num[1]);
                break;
            case "Subtraction(-)":
                n = Double.parseDouble(num[0]) - Double.parseDouble(num[1]);
                break;
            case "Multiplication(*)":
                n = Double.parseDouble(num[0]) * Double.parseDouble(num[1]);
                break;
            default:
                n = Double.parseDouble(num[0]) / Double.parseDouble(num[1]);
        }
        model.addAttribute("n",n);
        return "index";
    }
}
