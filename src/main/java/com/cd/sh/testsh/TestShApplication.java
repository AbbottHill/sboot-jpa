package com.cd.sh.testsh;

import com.cd.sh.testsh.service.sysuser.SysUserOperator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestShApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestShApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SysUserOperator sysUserOperator = new SysUserOperator();
		sysUserOperator.listUser();
	}
}
