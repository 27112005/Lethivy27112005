package Java_sinhvien;

import java.io.File;

public class Main {
  public static void main(String[] args) {
	  
 StudentController controller = new StudentController();
 controller.addStudent("phin", "23NS074", "23NS2", "ktmt-dt");
 controller.addStudent("vy", "23NS104", "23NS2", "ktmt-dt");
 controller.addStudent("binh", "23NS054", "23NS2", "ktmt-dt");
 controller.displayStudents();
  
  controller.saveToFile("students.dat");
  controller.deleteStudent("phin");
  controller.loadFromFile("students.dat");
  controller.displayStudents();
  File directory = new File("path/to/directory");
 controller.searchDirectory(directory);
 controller.handEvnent();
}
}


	