package org.example;

import org.example.dao.StudentDao;
import org.example.dao.StudentDaoImpl;
import org.example.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//        insert query
//        int result = studentDao.insert(new Student("33", "Raj", "Pune"));
//        System.out.println("students inserted:   " + result);


//        int result2 = studentDao.updateStudent(new Student("33", "Raj", "Mumbai"));
//        System.out.println("students updated:   " + result2);

//        int result3 = studentDao.deleteStudent(33);
//        System.out.println("students deleted:   " + result3);

//        Student student = studentDao.getStudent(1);
//        System.out.println(student);

        List<Student> studentList = studentDao.getAllStudents();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
