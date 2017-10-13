package org.github.renial.notebook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class NoteController {
    
    @RequestMapping("/getOne")
    public Object getOne() {
        return "{\"code\":0, \"msg\":\"success\"}";
    }
}
