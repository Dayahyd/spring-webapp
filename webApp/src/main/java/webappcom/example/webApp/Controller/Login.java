package webappcom.example.webApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {

    @ResponseBody
    @RequestMapping("/login")
    public String greet(){
        return "login page";
    }
}
