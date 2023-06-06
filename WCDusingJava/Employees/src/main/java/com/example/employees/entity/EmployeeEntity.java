package com.example.employees.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employees")
public class EmployeeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fullname")
    private String fullname;
    private String birthday;
    private String address;
    private String position;
    private String department;
    public EmployeeEntity() {
    }

    public EmployeeEntity(Integer id, String fullname, String birthday, String address, String position, String department) {
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.address = address;
        this.position = position;
        this.department = department;
    }

    public EmployeeEntity(String fullname, String birthday, String address, String position, String department) {
        this.fullname = fullname;
        this.address = address;
        this.birthday = birthday;
        this.position = position;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
