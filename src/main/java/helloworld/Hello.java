package helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("/")
    public String home(){
        System.out.println("index called");
        System.out.println("index is done ");
        System.out.println("index is running ");
        return "index";
    }
}
