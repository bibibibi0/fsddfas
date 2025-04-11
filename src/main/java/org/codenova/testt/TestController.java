package org.codenova.testt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("main")
public String intro() {
        /*
        해야 할 것:
        왼/오른쪽 구역나눠서
        디테일 페이지 작업
        마이페이지 작업
         */

        return "test/main";
    }
    @GetMapping("01")
    public String detailPage01() {
// 페이지 검사 눌러서, 백그라운드 컬러 조정해볼 것
        return "test/01";
    }
    @GetMapping("mypage")
    public String myPage01() {
   /* 유저 정보 받아온 후
            프로필 이미지
              닉네임
              기타 등등
            이런 느낌으로 작업
    */
        return "test/mypage";
    }
}
