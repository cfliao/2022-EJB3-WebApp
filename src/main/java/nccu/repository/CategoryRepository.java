package nccu.repository;

import nccu.domain.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll();

    Category findById(String categoryId);

}
