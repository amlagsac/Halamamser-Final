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
    public List<ShipItem> getItem_Ship() {
        return this.entityManager.createQuery("SELECT A FROM ShipItem A", ShipItem.class).getResultList();
    }

    @Override
    public void addItem(ShipItem item) {
        this.entityManager.persist(item);
    }

}
