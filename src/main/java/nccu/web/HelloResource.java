package nccu.web;

import nccu.domain.Category;
import nccu.ejb3.CategoryService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/hello-world")
public class HelloResource {

    @Inject
    private CategoryService categoryService;

    @GET
    @Produces("text/plain")
    public String hello() {
        List<Category> categoryList = categoryService.all();
        System.out.println(categoryList);
        return categoryList.toString();
    }
}