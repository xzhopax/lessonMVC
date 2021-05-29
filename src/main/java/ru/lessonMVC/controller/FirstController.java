package ru.lessonMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/people")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println("Hello " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname" ,required = false) String surname){
        System.out.println("Goodbye " + name + " " + surname);
        return "first/goodbye";
    }



//    @GetMapping("/goodbye")
//    public String goodbyePage(){
//        return "first/goodbye";
//    }
}
