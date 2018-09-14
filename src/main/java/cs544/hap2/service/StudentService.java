package cs544.hap2.service;

import cs544.hap2.models.Student;
import cs544.hap2.repository.StudentDAO;

public class StudentService
{
	private StudentDAO studentdao;

	public StudentService()
	{

		studentdao = new StudentDAO();

	}

	public Student getStudent(long studentid)
	{

		return studentdao.load(studentid);
	}

	public void setStudentdao(StudentDAO studentdao) {
		this.studentdao= studentdao;
	}
}
