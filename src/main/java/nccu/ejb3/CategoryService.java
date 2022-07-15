package nccu.ejb3;

import nccu.domain.Category;

import javax.ejb.Local;
import java.util.List;

@Local
public interface CategoryService {
    public List<Category> all();
}
