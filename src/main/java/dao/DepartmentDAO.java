package dao;

import entity.Department;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
    public List<Department> getDepts(){
        Transaction transaction = null;
        List<Department> departments = new ArrayList<>();
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            departments = session.createQuery("from Department", Department.class).list();

            transaction.commit();
            session.close();
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }
        return departments;
    }
}
