package Java_sinhvien;
import java.util.List;
public class StudentView {
	public void printStudentDetails(List<Student> students) {
		for(Student student : students) {
			System.out.println("Name : " + student.getName());
			
			System.out.println("studentid : "+student.getStudentID());
			System.out.println("class : " + student.getLop());
			System.out.println("khoa : " + student.getKhoa());
			
		}
	}
}



