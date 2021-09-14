package org.launchcode.hellospring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringController {
    // responds to get requests at "/hello"
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        String html =
                "<html>" +
                        "<body>" +
                            "<h1>HTML test from controller<h1>" +
                        "</body>" +
                        "</html>";

        return html;
    }
}
