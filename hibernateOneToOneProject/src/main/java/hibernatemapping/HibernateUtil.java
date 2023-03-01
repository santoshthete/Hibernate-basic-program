package hibernatemapping;

//public class HibernateUtil {

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

////import com.hibernate.model.Metadata;
//import com.hibernate.model.MetadataSources;
//import com.hibernate.model.SessionFactory;
//import com.hibernate.model.StandardServiceRegistry;
//import com.hibernate.model.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
		private static StandardServiceRegistry standard;
		private static SessionFactory sessionFactory;
		public static SessionFactory getSessionFactory() {
			return sessionFactory;
			
		}
		static {
			try {
				if(sessionFactory==null) {
					standard=new StandardServiceRegistryBuilder().configure().build();
					MetadataSources metadata=new MetadataSources(standard);
					Metadata data=metadata.getMetadataBuilder().build();
					sessionFactory=data.getSessionFactoryBuilder().build();
					
				}
		}catch (Exception e) {
			e.printStackTrace();
			if(standard!=null) {
				StandardServiceRegistryBuilder.destroy(standard);
				
			}
			
		}
		}}




