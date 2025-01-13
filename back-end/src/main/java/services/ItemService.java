package services;

import enums.itemType;
import models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ItemRepository;

import java.util.List;

@Service
public class ItemService extends BaseService<Item, Long> {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    protected ItemRepository getRepository() {
        return itemRepository;
    }

    public List<Item> findByType(itemType type) {
        return itemRepository.findByItemType(type);
    }

    // Find items by department ID
    public List<Item> findByDepartment(int departmentId) {
        return itemRepository.findByDepartmentId_Id(departmentId);
    }

    // Find items by category ID
    public List<Item> findByCategory(int categoryId) {
        return itemRepository.findByCategoryId_Id(categoryId);
    }

    @Override
    protected Item updateEntity(Item existingItem, Item itemDetails) {
        existingItem.setName(itemDetails.getName());
        existingItem.setSerialNumber(itemDetails.getSerialNumber());
        existingItem.setStatus(itemDetails.getStatus());
        existingItem.setCategoryId(itemDetails.getCategoryId());
        existingItem.setDepartmentId(itemDetails.getDepartmentId());
        return existingItem;
    }

}
