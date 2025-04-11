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
// 페이지 검사 눌러서, 백그라운드 컬러 조정해볼 것
        return "test/01";
    }
}
