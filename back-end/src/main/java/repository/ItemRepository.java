package repository;

import enums.itemType;
import models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemType(itemType type);

    List<Item> findByDepartmentId_Id(int departmentId);

    List<Item> findByCategoryId_Id(int categoryId);
}
