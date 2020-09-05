package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBConnection;

public class StudentCRUD {

	public StudentCRUD() {
		// TODO Auto-generated constructor stub
	}
	public static int addStudent(String id,String name,String sex,int age,String birthday,String className){
		Connection conn=null;
		PreparedStatement pst=null;
		String sql="insert into student(id,name,sex,age,birthday,classname) values(?,?,?,?,?,?)";
		int ret=0;
		try {
			conn=DBConnection.getConnection();
			pst=conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, name);
			pst.setString(3, sex);
			pst.setInt(4, age);
			pst.setDate(5, java.sql.Date.valueOf(birthday));
			pst.setString(6, className);
			ret=pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("添加出错:"+e.getMessage());
		}
		return ret;
	}
	public static int deleteStudent(String id){
		Connection conn=null;
		PreparedStatement pst=null;
		String sql="delete from student where id=?";
		int ret=0;
		try {
			conn=DBConnection.getConnection();
			pst=conn.prepareStatement(sql);
			pst.setString(1, id);
			ret=pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("删除出错:"+e.getMessage());
		}
		return ret;
	}
	public static int updateStudent(String id,String name,String sex,int age,String birthday,String className){
		Connection conn=null;
		PreparedStatement pst=null;
		String sql="update student set name=?,sex=?,age=?,birthday=?,classname=? where id=?";
		int ret=0;
		try {
			conn=DBConnection.getConnection();
			pst=conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, sex);
			pst.setInt(3, age);
			pst.setDate(4, java.sql.Date.valueOf(birthday));
			pst.setString(5, className);
			pst.setString(6, id);
			ret=pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("修改出错:"+e.getMessage());
		}
		return ret;
	}
	public static Student getStudentById(String id){
		Student s=null;
		try {
			Connection conn=DBConnection.getConnection();
			String sql="select * from student where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				s=new Student();
				s.setId(id);
				s.setName(rs.getString("name"));
				s.setSex(rs.getString("sex"));
				s.setAge(rs.getInt("age"));
				s.setBirthday(rs.getDate("birthday").toString());
				s.setClassName(rs.getString("classname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("根据学号查询出错:"+e.getMessage());
		}
		return s;
	}
	public static List<Student> getStudent(){
		List<Student> list=new ArrayList<Student>();
		try {
			Connection conn=DBConnection.getConnection();
			String sql="select * from student order by id";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				Student s=new Student();
				s.setId(rs.getString("id"));
				s.setName(rs.getString("name"));
				s.setSex(rs.getString("sex"));
				s.setAge(rs.getInt("age"));
				s.setBirthday(rs.getDate("birthday").toString());
				s.setClassName(rs.getString("classname"));
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("查询所有学生出错:"+e.getMessage());
		}
		return list;
	}
}
