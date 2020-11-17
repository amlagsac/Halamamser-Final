package apc.entjava.halamamser;

//Initialization of Imports
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
public class Ship implements ShipLocal {

    //Declaration of Entity Manager
    @PersistenceContext
    private EntityManager entityManager;

    //Function for Getting Items with query for database for Ship.xhtml
    @Override
    public List<ShipItem> getItem_Ship() {
        return this.entityManager.createQuery("SELECT A FROM ShipItem A", ShipItem.class).getResultList();
    }

    //Function for Adding User in Ship.xhtml
    @Override
    public void addItem(ShipItem item) {
        this.entityManager.persist(item);
    }

}
