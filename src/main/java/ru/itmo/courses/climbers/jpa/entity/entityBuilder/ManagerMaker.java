package ru.itmo.courses.climbers.jpa.entity.entityBuilder;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.NonNull;


@NonNull
public class ManagerMaker {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("ormClimbers");
    EntityManager manager = factory.createEntityManager();

    public void addToTable(Object value){
        manager.getTransaction().begin();
        manager.persist(value);
        manager.getTransaction().commit();
        System.out.println(value + ": данные добавлены в таблицу");

    }

    public void dropFromTable(Object value){
        manager.getTransaction().begin();
        manager.remove(value);
        manager.getTransaction().commit();
        System.out.println(value + ": данные удалены из таблицы");
    }





}
