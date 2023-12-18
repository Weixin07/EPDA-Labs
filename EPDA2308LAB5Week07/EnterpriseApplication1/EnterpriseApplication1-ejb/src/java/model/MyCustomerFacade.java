/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author guan.kiat
 */
@Stateless
public class MyCustomerFacade extends AbstractFacade<MyCustomer> {

    @PersistenceContext(unitName = "EnterpriseApplication1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MyCustomerFacade() {
        super(MyCustomer.class);
    }
    
    public MyCustomer searchByName(String x){
        Query q = em.createNamedQuery("MyCustomer.name");
        q.setParameter("z", x);
        List<MyCustomer> result = q.getResultList();
        if(result.size()>0){
            return result.get(0);
        }
        return null;
    }
}
