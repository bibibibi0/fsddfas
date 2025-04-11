package org.codenova.testt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("main")
public String intro() {

        return "test/main";
    }
    @GetMapping("01")
    public String myPage01() {

        return "test/01";
    }
}
