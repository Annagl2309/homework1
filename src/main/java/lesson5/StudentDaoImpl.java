package lesson5;



import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao{
    private SessionFactoryUtils sessionFactoryUtils;

    public StudentDaoImpl(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    public StudentDaoImpl () {

    }

    @Override
    public Student findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession();) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.getTransaction().commit();
            return student;
        }
    }

    @Override
    public List<Student> findAll() {
        try (Session session = sessionFactoryUtils.getSession();) {
            session.beginTransaction();
            List<Student> students = session.createQuery("select c from clients.Student s").getResultList();
            session.getTransaction().commit();
            return students;
        }
    }

    @Override
    public void save(Student student) {
        try (Session session = sessionFactoryUtils.getSession();) {
            session.beginTransaction();
            session.saveOrUpdate(student);
            session.getTransaction().commit();

        }
    }

    @Override
    public void saveAfterCommit(Student student) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            session.saveOrUpdate(student);
            session.getTransaction().commit();
        }
    }

}
