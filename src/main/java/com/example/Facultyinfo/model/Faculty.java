package com.example.Facultyinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {
    @Id
    @Generated
    public int fid;
    public String name;
    public String department;
    public String designation;
    public String email;
    public String phone;
    public String address;
    public String password;
    public String subject;

}
