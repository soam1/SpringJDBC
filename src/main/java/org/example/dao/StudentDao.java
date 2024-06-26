package org.example.dao;

import org.example.entities.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);

    public Student getStudent(int id);

    public List<Student> getAllStudents();

    public int deleteStudent(int id);

    public int updateStudent(Student student);
}
