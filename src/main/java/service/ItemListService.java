package service;

import dao.ItemDao;
import model.Item;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ItemListService {
    private ItemDao itemDao;

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @Transactional("slaveTx")
    public List<Item> getAll() {
        List<Item> items = itemDao.findAll();
        return items;
    }
}
