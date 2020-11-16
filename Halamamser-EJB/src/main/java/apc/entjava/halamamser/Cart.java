package apc.entjava.halamamser;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
public class Cart implements CartLocal {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CartItem> getItem_Cart() {
        return this.entityManager.createQuery("SELECT C FROM CartItem C", CartItem.class).getResultList();
    }

    @Override
    public void addItem(CartItem item) {
        this.entityManager.persist(item);
    }
}
