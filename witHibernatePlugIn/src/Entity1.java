import java.util.*;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Entity1 {

	public static void main(String[] args) {
		
		Session session =  new
		Configuration().configure().buildSessionFactory().openSession();
		String SELECT = "FROM JTask1.1 O WHERE Customerr = :id";
		Query q = session.createQuery(SELECT, Customerr.class);
		q.setParameter("id","12345");
		List<Customerr> resultList = (List<Customerr>) q.list();

		for(Customerr s: resultList){
			System.out.println(s.getId());
		}
			  

	}

}
