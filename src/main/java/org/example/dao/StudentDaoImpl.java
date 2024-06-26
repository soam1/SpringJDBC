package org.example.dao;

import org.example.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query = "insert into student(id, name, city) values(?,?,?)";
        int result = getJdbcTemplate().update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }

    @Override
    public Student getStudent(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public int deleteStudent(int id) {
        return 0;
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }
}