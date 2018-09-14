package cs544.hap2.repository;


import cs544.hap2.models.Course;
import cs544.hap2.models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.ArrayList;
import java.util.Collection;

public class StudentDAO
{
    //Session session = null;

    private SessionFactory sf;
    private Session session ;




    public long save(Student student)

    {
        this.session.getTransaction().begin();
        session.saveOrUpdate(student);
        this.session.getTransaction().commit();

        return student.getStudentid();

    }
	public StudentDAO()
	{




//		Student student = new Student(11334, "Frank", "Brown");
//		Course course1 = new Course(1101, "Java", "A");
//		Course course2 = new Course(1102, "Math", "B-");
//		student.addCourse(course1);
//		student.addCourse(course2);
//		studentlist.add(student);

	}

	public Student load(long studentid) {

        return ( Student )this.session.get(Student.class,studentid);

	}

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sf=sessionFactory;
        this.session=this.sf.openSession();
    }
}
