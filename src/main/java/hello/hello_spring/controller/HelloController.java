package hello.hello_spring.controller;

// Controller파일은 @Controller 어노테이션을 항상 적어줘야 한다.

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "이재희님!");
        return "hello";
    }
}
