package nccu.repository;

import nccu.domain.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CategoryMain {

    public static void main(String args[]) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        Category category = em.find(Category.class, "DOGS");
        System.out.println(category);

        Query q = em.createQuery("SELECT c FROM Category c");
        List<Category> list = q.getResultList();
        for (Category c : list) {
            System.out.println(c.toString());
        }
    }


}
