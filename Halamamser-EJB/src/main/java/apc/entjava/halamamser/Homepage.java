package apc.entjava.halamamser;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
public class Homepage implements HomepageLocal {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<HomepageItem> getItems() {
        return this.entityManager.createQuery("SELECT P FROM HomepageItem P ORDER BY P.category ASC", HomepageItem.class).getResultList();
    }

    @Override
    public void addItem_Cart(HomepageItem item) {
        this.entityManager.persist(item);
    }
}
