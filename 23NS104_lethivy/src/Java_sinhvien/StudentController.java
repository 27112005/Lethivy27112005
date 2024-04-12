package Java_sinhvien;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StudentController {
	  private List<Student> students;
	  private StudentView view;
	  public StudentController(){
		  this.students= new ArrayList<>();
		  this.view= new StudentView();
	  }
		  
		  public void addStudent(String name, String StudentID, String lop, String khoa) {
			  
		  
		students.add(new Student(name , StudentID , lop, khoa))	;
	  }
	 public void deleteStudent (String name ) {
		 students= students.stream()
				 .filter(student -> !student.getName().equals(name))
				 .collect(Collectors.toList());
		 
	 }
	 public void displayStudents() {
		 view.printStudentDetails(students);
		 
	 }
	 public void saveToFile (String fileName) {
		 try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))){
			 outputStream.writeObject(students);
			 
			System.out.println("data Saved to file"); 
			
		 }catch(IOException e){
			 e.printStackTrace();
			 
		 }
	 }
	public void loadFromFile(String fileName) {
		try(ObjectInputStream inputStream= new ObjectInputStream(new FileInputStream(fileName))){
			students= (List<Student>) inputStream.readObject();
			System.out.println("data loaded from file");
			
		}catch(IOException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public void searchDirectory( File directory) {
		try {
		searchDirectoryRecursively(directory, file ->System.out.println("file:"+file.getAbsolutePath()));
		
	} catch (Exception e ) {
		e.printStackTrace();
	}
}
	private void searchDirectoryRecursively(File directory , Consumer<File> fileConsumer) {
		File[]files=directory.listFiles();
		if(files!=null) {
			for (File file : files) {
				if(file.isDirectory()) {
					searchDirectoryRecursively(file,fileConsumer);
				}else {
					fileConsumer.accept(file);
				}
			}
		}
		
	}
	public void handEvnent() {
		
	}
}
	
	   