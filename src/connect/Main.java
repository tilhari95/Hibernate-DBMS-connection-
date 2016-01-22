package connect;//try make seperate classes for each function  package employee;
import java.util.List;
import org.hibernate.AnnotationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.*;
public class Main
{
    public static void main (String args[])
    {
    	Session s= NewHibernateUtil.getSessionFactory().openSession();
        Groups e=new Groups();
        //Employee e= (Employee)s.get(Employee.class,1001);
        e.setId(55);
        e.setName("Suyashyy");
        e.setClass_("TytT");
        s.save(e);
        
        
        //s.update(e2);
        //s.update(e2);
        s.beginTransaction().commit();
        // System.out.println("GOOD DONE");
        //Employee e4= (Employee)s.get(Employee.class,1001);
        //e4.setLname("Tilhari");
        //s.delete(e4);
        //s.beginTransaction().commit();
        /*List<Groups>es=s.createQuery("from Groups.*").list();
        for(Employee e9:es)
        {
            System.out.println(e9.getName()+" "+e9.getClass_());
        }*/
    }
}