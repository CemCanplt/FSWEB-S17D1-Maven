package com.workintech.fswebs17d1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FswebS17d1Application {

	@Value("${course.name}")
	private String courseName;

	@Value("${project.developer.fullname}")
	private String developerFullName;

	public static void main(String[] args) {
		var context = SpringApplication.run(FswebS17d1Application.class, args);

		// Spring'in yönetimindeki bean'lere erişmek için context kullanıyoruz
		FswebS17d1Application app = context.getBean(FswebS17d1Application.class);
		app.printValues();
	}

	public void printValues() {
		// Değerleri basitçe konsola yazdırıyoruz
		System.out.println("Course Name: " + courseName);
		System.out.println("Developer Full Name: " + developerFullName);
	}
}
