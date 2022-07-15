package nccu.ejb3;

import nccu.domain.Category;
import nccu.repository.CategoryRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class DefaultCategoryService implements CategoryService {
    @Inject
    CategoryRepository categoryRepository;

    public List<Category> all(){
        return categoryRepository.findAll();
    }

}
