package Java_sinhvien;

import java.io.Serializable;

public class Student implements Serializable {
	
	    private String name;
	   
	    private String StudentID;
	   
private String lop;
private String khoa;
public Student(String name , String StudentID, String lop, String khoa ) {
	this.name= name ;
	this.StudentID=StudentID;
	this.lop=lop;
	this.khoa=khoa;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStudentID() {
	return StudentID;
}
public void setStudentID(String studentID) {
	StudentID = studentID;
}
public String getLop() {
	return lop;
}
public void setLop(String lop) {
	this.lop = lop;
}
public String getKhoa() {
	return khoa;
}
public void setKhoa(String khoa) {
	this.khoa = khoa;
}
@Override
public String toString() {
	return "Student [name=" + name + ", StudentID=" + StudentID + ", lop=" + lop + ", khoa=" + khoa + "]";
}

}
