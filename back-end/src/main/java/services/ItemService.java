package services;

import models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ItemRepository;

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
