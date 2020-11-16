package apc.entjava.halamamser;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
public class Ship implements ShipLocal {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ShipItem> getItems_Ship() {
        return this.entityManager.createQuery("SELECT S FROM ShipItem S", ShipItem.class).getResultList();
    }

    @Override
    public void addItem_Ship(ShipItem item) {
        this.entityManager.persist(item);
    }

}
