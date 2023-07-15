package com.example.hocspringboot.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="role")

public class RoleEntity extends BaseEntity{
    @Column
    private String code;
    @Column
    private String name;
@ManyToMany(mappedBy = "roles")
private List<UserEnity> users=new ArrayList<>();

    public List<UserEnity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEnity> users) {
        this.users = users;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
