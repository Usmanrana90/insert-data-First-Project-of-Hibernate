package cloudxweb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class ClientApp {
public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
		try
		{
			Configuration cfg=new Configuration();
			cfg.configure("cloudxweb/hibernate.cfg.xml");
			sf=cfg.buildSessionFactory();
			session=sf.openSession();
			Transaction tx=session.beginTransaction();
			Employee emp=new Employee();
			 emp.setEno(121);
			 emp.setEname("aish");
			 emp.setEaddr("link road");
			 emp.setEsal(20000);
			 session.save(emp);
			 tx.commit();
			 System.out.println("Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
			sf.close();
		}
	}

}
