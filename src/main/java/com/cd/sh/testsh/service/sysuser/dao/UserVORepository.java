package com.cd.sh.testsh.service.sysuser.dao;

import com.cd.sh.testsh.service.sysuser.entity.SysUser;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("userVORepository")
public interface UserVORepository extends JpaRepository<SysUser, Integer> {
}
