package model;

public class Item {
	/** 강사정보 테이블명:tbl_teacher_202201 **/
	String teacher_code; //강사코드 기본키
	String teacher_name; //강사명
	String class_name; //강의명
	Integer class_price; //수강료
	String class_priceS; //수강료
	public String getClass_priceS() {
		return class_priceS;
	}
	public void setClass_priceS(String class_priceS) {
		this.class_priceS = class_priceS;
	}
	String teach_resist_date; //강사자격취득일

	/** 회원정보 테이블명:tbl_member_202201 **/
	String c_no; //회원번호 기본키
	String c_name; //회원명
	String phone; //전화번호
	String address; //주소
	String grade; //등급
	
	/** 수강정보 테이블명:tbl_class_202201 **/
	String regist_month; //수강월
	String c_no_class; //회원번호(class는 강사정보 테이블과 겹쳐서 구분하기 위함)
	String class_area; //강의장소
	Integer tuition; //수강료
	String teacher_code_class; //강사코드(class는 강사정보 테이블과 겹쳐서 구분하기 위
	public String getTeacher_code() {
		return teacher_code;
	}
	public void setTeacher_code(String teacher_code) {
		this.teacher_code = teacher_code;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Integer getClass_price() {
		return class_price;
	}
	public void setClass_price(Integer class_price) {
		this.class_price = class_price;
	}
	public String getTeach_resist_date() {
		return teach_resist_date;
	}
	public void setTeach_resist_date(String teach_resist_date) {
		this.teach_resist_date = teach_resist_date;
	}
	public String getC_no() {
		return c_no;
	}
	public void setC_no(String c_no) {
		this.c_no = c_no;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getRegist_month() {
		return regist_month;
	}
	public void setRegist_month(String regist_month) {
		this.regist_month = regist_month;
	}
	public String getC_no_class() {
		return c_no_class;
	}
	public void setC_no_class(String c_no_class) {
		this.c_no_class = c_no_class;
	}
	public String getClass_area() {
		return class_area;
	}
	public void setClass_area(String class_area) {
		this.class_area = class_area;
	}
	public Integer getTuition() {
		return tuition;
	}
	public void setTuition(Integer tuition) {
		this.tuition = tuition;
	}
	public String getTeacher_code_class() {
		return teacher_code_class;
	}
	public void setTeacher_code_class(String teacher_code_class) {
		this.teacher_code_class = teacher_code_class;
	}

}
