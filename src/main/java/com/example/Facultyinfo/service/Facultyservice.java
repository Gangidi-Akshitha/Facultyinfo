package com.example.Facultyinfo.service;

import com.example.Facultyinfo.model.Faculty;
import com.example.Facultyinfo.repository.Facultyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facultyservice {
    @Autowired
    private Facultyrepo repo;
    public Faculty createfaculty(Faculty faculty) {
        return repo.save(faculty);

    }

    public List<Faculty> getfaculty() {
        return repo.findAll();
    }

    public List<Faculty> createfacultys(List<Faculty> faculty) {
        return repo.saveAll(faculty);
    }

    public Faculty getfacultyById(int id) {
        return repo.findById(id).orElse(null);
    }

    public String deletefaculty(int id) {
        repo.deleteById(id);
        return "Employee removed !! " + id;
    }

    public Faculty updatefaculty(int id, Faculty faculty) {
        Faculty existingfaculty = repo.findById(id).orElse(null);
        //existingfaculty.setFid(faculty.getFid());
        //existingfaculty.setName(faculty.getName());
        existingfaculty.setEmail(faculty.getEmail());
        existingfaculty.setPhone(faculty.getPhone());
        existingfaculty.setAddress(faculty.getAddress());
        existingfaculty.setPassword(faculty.getPassword());
        existingfaculty.setSubject(faculty.getSubject());
        return repo.save(existingfaculty);
    }
}
