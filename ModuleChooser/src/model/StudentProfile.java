package model;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;


public class StudentProfile {

	private String studentNumber;
	private Name studentName;
	private String studentEmail;
	private LocalDate SubmissionDate;
	private Course studentCourse;
	private Set<Module> selectedModules;
	private Set<Module> reservedModules;
	
	public StudentProfile() {
		studentNumber = "";
		studentName = new Name();
		studentEmail = "";
		SubmissionDate = null;
		studentCourse = null;
		selectedModules = new TreeSet<Module>();
		reservedModules = new TreeSet<Module>();
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public Name getStudentName() {
		return studentName;
	}
	
	public void setStudentName(Name studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}
	
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	public LocalDate getSubmissionDate() {
		return SubmissionDate;
	}
	
	public void setSubmissionDate(LocalDate studentDate) {
		this.SubmissionDate = studentDate;
	}
	
	public Course getStudentCourse() {
		return studentCourse;
	}
	
	public void setStudentCourse(Course studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	public boolean addSelectedModule(Module m) {
		return selectedModules.add(m);
	}
	
	public Set<Module> getAllSelectedModules() {
		return selectedModules;
	}
	
	public void clearSelectedModules() {
		selectedModules.clear();
	}
	
	public boolean addReservedModule(Module m) {
		return reservedModules.add(m);
	}
	
	public Set<Module> getAllReservedModules() {
		return reservedModules;
	}
	
	public void clearReservedModules() {
		reservedModules.clear();
	}
	
	@Override
	public String toString() {
		return "StudentProfile:[Pnumber=" + studentNumber + ", studentName="
				+ studentName + ", studentEmail=" + studentEmail + ", studentSubmission="
				+ SubmissionDate + ", studentCourse=" + studentCourse.actualToString() 
				+ ", selectedModules=" + selectedModules
				+ ", reservedModules=" + reservedModules + "]";
	}
	
}
