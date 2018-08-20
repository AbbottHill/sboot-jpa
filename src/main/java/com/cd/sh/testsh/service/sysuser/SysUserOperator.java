package com.cd.sh.testsh.service.sysuser;

import com.cd.sh.testsh.service.sysuser.dao.UserVORepository;
import com.cd.sh.testsh.service.sysuser.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SysUserOperator {

    @Autowired
    UserVORepository userVORepository;

    public void listUser() {
        List<SysUser> all = userVORepository.findAll();
        System.out.println(all);
    }

}
