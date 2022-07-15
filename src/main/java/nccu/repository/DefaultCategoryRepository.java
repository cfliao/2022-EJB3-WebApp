package nccu.repository;

import nccu.domain.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class DefaultCategoryRepository implements CategoryRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Category> findAll() {
        Query q = em.createQuery("SELECT c FROM Category c");
        return q.getResultList();
    }

    @Override
    public Category findById(String categoryId) {
        return em.find(Category.class, categoryId);
    }
}
