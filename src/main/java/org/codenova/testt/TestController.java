package org.codenova.testt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("intro")
public String intro() {

        return "test/intro";
    }
    @GetMapping("01")
    public String test01() {

        return "test/01";
    }
}
