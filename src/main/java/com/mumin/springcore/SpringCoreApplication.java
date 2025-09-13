package com.mumin.springcore;

import com.mumin.springcore.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

  public static void main(String[] args) {
    //SpringApplication.run(SpringCoreApplication.class, args);
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Employee emp1 = (Employee) context.getBean("employee1");
    emp1.displayInfo();
  }

}
