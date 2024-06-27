package org.example.dao;

import org.example.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        String query = "select * from student where id=?";
        Student student = getJdbcTemplate().queryForObject(query, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setId(resultSet.getString(1));
                student.setName(resultSet.getString(2));
                student.setCity(resultSet.getString(3));
                return student;
            }
        }, id);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        List<Student> students = getJdbcTemplate().query(query, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setId(resultSet.getString(1));
                student.setName(resultSet.getString(2));
                student.setCity(resultSet.getString(3));
                return student;
            }
        });
        return students;
    }

    @Override
    public int deleteStudent(int id) {
        String query = "delete from student where id=?";
        int result = getJdbcTemplate().update(query, id);
        return result;
    }

    @Override
    public int updateStudent(Student student) {
        String query = "update student set name=?, city=? where id=?";
        int result = getJdbcTemplate().update(query, student.getName(), student.getCity(), student.getId());
        return result;
    }
}
