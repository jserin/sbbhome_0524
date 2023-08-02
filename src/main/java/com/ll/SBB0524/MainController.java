package com.ll.SBB0524;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sbb")
    @ResponseBody
    public String index(){
        return "hihi";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
