package dbe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Item;

public class DBExpert {
	final private String driver = "oracle.jdbc.OracleDriver";
	final private String url = "jdbc:oracle:thin:@//localhost"
			+ ":1521/xe";
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public ArrayList<Item>searchTeacher(){
		String select ="select teacher_code, \n"
				+ "teacher_name, \n"
				+ "class_name, \n"
				+ "('₩'||substr(class_price,1,3)||','||substr(class_price,4,3)), \n"
				+ "(substr(TEACHER_REGIST_DATE,1,4)||'년'|| substr(TEACHER_REGIST_DATE,5,2)||'월'||substr(TEACHER_REGIST_DATE,7,2)||'일') "
				+ "from tbl_teacher_202201";
		ArrayList<Item> searchTeacherList= new ArrayList<Item>();
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,"hr","hr");
			pstmt=con.prepareStatement(select);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Item item = new Item();
			item.setTeacher_code(rs.getString(1));
			item.setTeacher_name(rs.getString(2));
			item.setClass_name(rs.getString(3));
			item.setClass_priceS(rs.getString(4));
			item.setTeach_resist_date(rs.getString(5));
			searchTeacherList.add(item);
			}
		}catch(Exception e) {

		}finally {
				try {
					rs.close(); pstmt.close(); con.close();
				}catch(Exception e) {}
		}
		return searchTeacherList;
	}
}

