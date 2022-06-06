package com.tm1.teachmaster1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public ResponseEntity<?> getListUser() {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> createListUser() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateListUser() {
        return null;
    }

    @DeleteMapping ("{id}")
    public ResponseEntity<?> deleteListUser() {
        return null;
    }
}
