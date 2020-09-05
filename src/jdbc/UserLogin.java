package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnection;

public class UserLogin {
	public static boolean validlogin(String name, String password)throws SQLException{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		boolean successflag=false;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from user where name='"+name+"' and password='"+password+"'";
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()==true)
				successflag=true;
			else
				System.out.println("µÇÂ¼Ê§°Ü");
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return successflag;
	}
}
