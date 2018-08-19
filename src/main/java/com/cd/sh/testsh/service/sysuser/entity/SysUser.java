package com.cd.sh.testsh.service.sysuser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sys_user")
public class SysUser {
    @Id
    private Integer id;
    private String Name;
    private String Email;

    @Column(name = "user_id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "user_name")
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Column(name = "user_email")
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
