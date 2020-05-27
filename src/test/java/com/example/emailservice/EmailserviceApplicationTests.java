package com.example.emailservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.emailservice.service.EmailService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailserviceApplicationTests {

	@Autowired
	private EmailService emailService;

	@Test
	public void testEmail() {
		emailService.sendMail("pankaj@apnagroups.com", "Test subject", "Test mail");
	}

}
