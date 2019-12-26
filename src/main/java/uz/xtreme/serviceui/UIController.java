package uz.xtreme.serviceui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: Rustambekov Avazbek
 * Date: 26/12/2019
 * Time: 15:41
 */

@Controller
public class UIController {

    @GetMapping(value = "/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }

}
