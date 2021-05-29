package ru.lessonMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.lessonMVC.Sign;

@Controller
public class CalculationController {
    int result;
    String signS;

    @GetMapping("/calculator")
    public String calculation(@RequestParam(value = "number1", required = false) Integer numb1,
                              @RequestParam(value = "sign", required = false) String sign,
                              @RequestParam(value = "number2", required = false) Integer numb2,
                              Model model){
        switch (sign){
            case "multiplication":
               result =  numb1 * numb2;
               signS = Sign.MULTIPLICATION.sign;
               break;
            case "division":
                result = numb1 / numb2;
                signS = Sign.DIVISION.sign;
                break;
            case "addition":
                result = numb1 + numb2;
                signS = Sign.ADDITION.sign;
                break;
            case "subtraction":
                result = numb1 - numb2;
                signS = Sign.SUBTRACTION.sign;
                break;
            default:
                result = 0;
        }

        model.addAttribute("message", ("" + numb1 + " " + signS + " " + numb2 + " = " + result));

        return "calculation/calculator";
    }
}
