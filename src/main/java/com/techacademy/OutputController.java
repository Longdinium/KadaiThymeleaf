package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("previous") String val, Model model) {
        // input.htmlのフォームから送信されてきた値（「val」という名前）を「previous」という名前でModelに登録
        model.addAttribute("previous", val);
        // output.htmlに画面遷移
        return "output";
    }
}
