package com.myProject.SpringMVC.test;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.myProject.SpringMVC.model.Person;

public class TestFirst {

	@Test
	public void test01() {
		Configuration cfg = new Configuration().configure();
		//cfg.buildSessionFactory();//��hibernate3�ж���ʹ�ø��ַ���������������4�б�������
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
							.applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory = cfg.buildSessionFactory(serviceRegistry);
		Session session = null;
		try {
			session = factory.openSession();
			//��������
			session.beginTransaction();
			Person person = new Person();
			person.setAge(20);
			person.setEmail("1111111@qq.com");
			person.setName("android");
			session.save(person);
			//�ύ����
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if(session!=null) session.getTransaction().rollback();
		} finally {
			if(session!=null) session.close();
		}
	}

}
