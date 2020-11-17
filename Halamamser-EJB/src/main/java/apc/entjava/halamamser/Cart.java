package apc.entjava.halamamser;

//Initialization of Imports
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
public class Cart implements CartLocal {

    //Declaration of Entity Manager
    @PersistenceContext
    private EntityManager entityManager;

    //Function for Getting Items with query for database for Cart.xhtml
    @Override
    public List<CartItem> getItem_Cart() {
        return this.entityManager.createQuery("SELECT C FROM CartItem C", CartItem.class).getResultList();
    }

    //Function for Adding Items in Cart.xhtml
    @Override
    public void addItem(CartItem item) {
        this.entityManager.persist(item);
    }
}
