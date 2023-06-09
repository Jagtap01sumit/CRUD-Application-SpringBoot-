package org.example.Repo;

import model.Student;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


@Repository
public class StudentRepo implements StudentRepoImpl {
    @Override
    public void insertStudent(Student student) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mumbai", "root", "");
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('" + student.getRollNo() + "','" + student.getName() + "','" + student.getEmail() + "')");
            selectStudent(student.getRollNo());
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    @Override
    public Student selectStudent(int rollNo) {
        Student student = new Student();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mumbai", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where rollNo= " + rollNo);
            while (rs.next()) {
                student.setRollNo(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setEmail(rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mumbai", "root", "");
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('" + student.getRollNo() + "','" + student.getName() + "','" + student.getEmail() + "')");
        } catch (Exception e) {
            System.out.println(e);

        }
        return selectStudent(student.getRollNo());
    }

    @Override
    public boolean deleteStudent(int rollNo) {
        boolean result = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mumbai", "root", "");
            Statement st = con.createStatement();
            int count = st.executeUpdate("delete from student where rollNo=" + rollNo);
            if (count > 0) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        return result;
    }
}
