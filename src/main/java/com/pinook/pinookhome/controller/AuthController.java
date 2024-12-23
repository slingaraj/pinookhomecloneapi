package com.pinook.pinookhome.controller;

import com.pinook.pinookhome.dto.AuthRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> userLogin(@RequestBody AuthRequestDto dto) {
        return new ResponseEntity<>("user logged in successfully", HttpStatus.OK);
    }
}
