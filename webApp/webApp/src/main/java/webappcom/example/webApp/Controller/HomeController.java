package webappcom.example.webApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/about")
     String greeting(){
        return "about";
    }

    @RequestMapping("")
    public String greet(){
        return "hello daya";
    }
}
