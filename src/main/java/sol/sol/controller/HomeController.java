package sol.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "/index";
    }


    @GetMapping("/simpleStorage")
    public String simpleStorage(){
        return "/simpleStorageDapp";
    }
}
