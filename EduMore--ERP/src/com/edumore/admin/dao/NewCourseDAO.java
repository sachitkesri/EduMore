package com.edumore.admin.dao;

import java.sql.SQLException;

import com.edumore.admin.bean.CourseBean;
import com.edumore.databseconnection.EdumoreDBConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class NewCourseDAO {

	private static Connection con;

	public boolean insertNewCourse(CourseBean courseBean) throws SQLException,
			ClassNotFoundException {
		con = (Connection) EdumoreDBConnection.getDBConnection();
		String sql = "insert into course_details(course_name, admin_id) values(?,(SELECT admin_id FROM admin_login_details WHERE admin_username=\""
				+ courseBean.getAdminUsername() + "\"))";
		PreparedStatement statement = (PreparedStatement) con
				.prepareStatement(sql);
		statement.setString(1, courseBean.getCourseTitle());
		// statement.setInt(2, courseBean.getAdminId());
		int updated = statement.executeUpdate();
		if (updated == 1) {
			return true;
		} else
			return false;

	}

}
