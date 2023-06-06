package com.example.employees.dao;

import com.example.employees.entity.EmployeeEntity;
import com.example.employees.util.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class EmployeeDao {

    EntityManager em;
    EntityTransaction tran;

    public EmployeeDao (){
        em = PersistenceUtil.getEntityManagerFactory().createEntityManager();
        tran = em.getTransaction();
    }

    public void insertEmployee(EmployeeEntity employee){
        try {
            tran.begin();
            em.persist(employee);
            tran.commit();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            tran.rollback();
        }
    }

    public List<EmployeeEntity> getAllEmployee(){
        try {
            Query query = em.createQuery("Select a from EmployeeEntity as a");
            return query.getResultList();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return  null;
    }

}
