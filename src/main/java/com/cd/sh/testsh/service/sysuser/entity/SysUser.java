package com.cd.sh.testsh.service.sysuser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user")
public class SysUser {
    @Id
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "user_name")
    private String Name;

    @Column(name = "user_email")
    private String Email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
