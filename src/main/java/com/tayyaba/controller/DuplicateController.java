package com.tayyaba.controller;

import com.tayyaba.service.DuplicateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@RestController
@RequestMapping("/api")
public class DuplicateController {
    @Autowired
    DuplicateService Service;

    @GetMapping("/count-duplicate/{input}")
    public int duplicate(@PathVariable(value = "input") String input)
    {
        int count;
        count = Service.countDuplicate(input);
        return count;
    }
}

