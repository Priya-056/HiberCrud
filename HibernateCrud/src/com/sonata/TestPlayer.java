package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Player p1=new Player(456,"Priya","Blue",22);
		Player p2=new Player(457,"Surya","red",12);
		Player p3=new Player(458,"yamini","yellow",42);
		Player p4=new Player(459,"sim","black",25);
		SessionFactory session=new Configuration().configure().buildSessionFactory();
		Session s1=session.openSession();
		s1.beginTransaction();
		s1.save(p1);
		s1.save(p2);
		s1.save(p3);
		s1.save(p4);
		
		//ReadOperation
		Player p= (Player) s1.get(Player.class,457);
		System.out.println(p);
		
		//UpdateOperation
		Player p5=(Player)s1.get(Player.class,458);
		p5.setPlayerAge(22);
		System.out.println(p5);
		
		//DeleteOperation
		Player p6=(Player) s1.get(Player.class, 457);
		s1.delete(p6);
		System.out.println(p6);
		
		s1.getTransaction().commit();
		s1.close();
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
