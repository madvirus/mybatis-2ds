package dao;

import model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDao {

    Item findById(Integer itemId);

    List<Item> findAll();
}
