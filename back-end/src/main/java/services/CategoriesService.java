package services;

import models.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CategoriesRepository;

@Service
public class CategoriesService extends BaseService <Categories, Long>{
    private final CategoriesRepository categoriesRepository;

    @Autowired
    public CategoriesService(CategoriesRepository categoriesRepository){
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    protected  CategoriesRepository getRepository() {
        return categoriesRepository;
    }

    @Override
    protected Categories updateEntity(Categories existingCategory, Categories categoryDetail) {
        existingCategory.setCategoryName(categoryDetail.getCategoryName());
        return existingCategory;
    }
}
