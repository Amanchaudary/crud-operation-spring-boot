package com.crud.crud;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class CrudController {

    // localhost:8080/get garna parxa
    @GetMapping("/get")
    public String doget() {
        return "this is get mapping";
    }
    @PostMapping("/post")
    public String dopost() {
        return "this is post mapping";
    }
    @PutMapping("/put")
    public String doput() {
        return "this is put mapping";
    }
    @DeleteMapping("/delete")
    public String dodelete() {
        return "this is delete mapping";
    }

}
