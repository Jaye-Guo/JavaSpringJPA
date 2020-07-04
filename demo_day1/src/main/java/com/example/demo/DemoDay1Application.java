package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Facility;
//import com.example.demo.model.Facility;
import com.example.demo.model.Member;
import com.example.demo.repo.FacilityRepository;
import com.example.demo.repo.MemberRepository;

@SpringBootApplication
public class DemoDay1Application {

	@Autowired
	FacilityRepository fcrepo;

	@Autowired
	MemberRepository memrepo;
	public static void main(String[] args) {
		SpringApplication.run(DemoDay1Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			
			
			  Facility fc1 = new Facility("single room", "single bed");
			  System.out.println(fc1); Facility fc2 = new Facility("double room",
			  "double bed"); System.out.println(fc2); Facility fc3 = new
			  Facility("Couple room", "queen size bed"); System.out.println(fc3); Facility
			  fc4 = new Facility("Family room", "suit"); System.out.println(fc4);
			  
			  fcrepo.save(fc1); fcrepo.save(fc2); fcrepo.save(fc3); fcrepo.save(fc4);
			 
			 
			Member m1 = new Member("E123", "Jaye", "Jieyi", "Guo");
			System.out.println(m1);
			Member m2 = new Member("E823", "Joey", "Jieying", "Guo");
			System.out.println(m2);
			Member m3 = new Member("E127", "Bryant", "Zhenhuang", "Guo");
			System.out.println(m3);
			Member m4 = new Member("E406", "Zeko", "Zehao", "Huang");
			System.out.println(m4);
			Member m5 = new Member("E1229", "Meimei", "Siyi", "Chen");
			System.out.println(m5);
			Member m6 = new Member("E321", "Jie", "Weiji", "Wu");
			System.out.println(m6);

			memrepo.save(m1);
			memrepo.save(m2);
			memrepo.save(m3);
			memrepo.save(m4);
			memrepo.save(m5);
			memrepo.save(m6);

		};
	}
}
