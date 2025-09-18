package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.College;
import com.example.demo.service.ICollegeService;

@RestController
@RequestMapping("/colleges")
public class CollegeController {

    @Autowired
    private ICollegeService collegeService;

    // CREATE
    @PostMapping
    public College createCollege(@RequestBody College college) {
        return collegeService.saveCollege(college);
    }

    // READ ALL
    @GetMapping
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable("id") Long id) {
        return collegeService.getCollegeById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public College updateCollege(@PathVariable("id") Long id,
                                 @RequestBody College college) {
        return collegeService.updateCollege(id, college);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteCollege(@PathVariable("id") Long id) {
        collegeService.deleteCollege(id);
    }
}
