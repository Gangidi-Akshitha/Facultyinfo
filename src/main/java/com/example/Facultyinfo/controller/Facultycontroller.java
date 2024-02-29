package com.example.Facultyinfo.controller;

import com.example.Facultyinfo.model.Faculty;
import com.example.Facultyinfo.service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sriindu")
public class Facultycontroller {
    @Autowired
    private Facultyservice service;

    @PostMapping("/addemployee")
    public Faculty addemployee(@RequestBody Faculty faculty) {
        return service.createfaculty(faculty);
    }
    @PostMapping("/addemployees")
    public List<Faculty> addemployees(@RequestBody List<Faculty> faculty) {
        return service.createfacultys(faculty);
    }
    @GetMapping("/getemployee")
    public List<Faculty> getemployee() {
        return service.getfaculty();
    }
    @GetMapping("/getemployee/{id}")
    public Faculty getemployee(@PathVariable int id) {
        return service.getfacultyById(id);
    }
    @DeleteMapping("/deleteemployee/{id}")
    public String deleteemployee(@PathVariable int id) {
        return service.deletefaculty(id);
    }
    @PutMapping("/updateemployee/{id}")
    public Faculty updateemployee(@PathVariable int id, @RequestBody Faculty faculty) {
        return service.updatefaculty(id, faculty);
    }
}
