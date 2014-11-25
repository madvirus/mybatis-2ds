package dao;

import model.PurchaseOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderDao {

	void save(PurchaseOrder order);

}
