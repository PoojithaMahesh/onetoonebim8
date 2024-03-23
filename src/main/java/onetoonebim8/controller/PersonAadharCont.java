package onetoonebim8.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebim8.dao.AadharCardDao;
import onetoonebim8.dao.PersonDao;
import onetoonebim8.dto.AadharCard;
import onetoonebim8.dto.Person;

public class PersonAadharCont {
public static void main(String[] args) {
//	Person person=new Person();
//	person.setId(1);
//	person.setName("kalpesh");
//	person.setAddress("Pune");
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(101);
//	aadharCard.setName("Kalpeshh");
//	aadharCard.setAge(16);
//	
//	
//	person.setAadharCard(aadharCard);
//	aadharCard.setPerson(person);
//	
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction  entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	entityManager.persist(aadharCard);
//	entityManager.persist(person);
//	entityTransaction.commit();
	
	
	
//	PersonDao dao=new PersonDao();
//	dao.deletePerson(1);
	
	
	
	AadharCardDao aadharCardDao=new  AadharCardDao();
	aadharCardDao.deleteAadharCard(101);
	
	
	
	
	
	
	
	
	
	
	
}
}
