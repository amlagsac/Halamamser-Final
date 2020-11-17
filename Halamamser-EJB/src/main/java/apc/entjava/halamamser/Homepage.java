package apc.entjava.halamamser;

//Initialization of Imports
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@LocalBean
public class Homepage implements HomepageLocal {

    //Declaration of Entity Manager
    @PersistenceContext
    private EntityManager entityManager;

    //Function for Getting Items with query for database for Homepage.xhtml with order by clause
    @Override
    public List<HomepageItem> getItems() {
        return this.entityManager.createQuery("SELECT P FROM HomepageItem P ORDER BY P.category ASC", HomepageItem.class).getResultList();
    }

    //Function for Adding Items in Homepage.xhtml
    @Override
    public void addItem_Cart(HomepageItem item) {
        this.entityManager.persist(item);
    }
}
