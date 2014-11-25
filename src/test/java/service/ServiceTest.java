package service;

import model.Item;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;

@ContextConfiguration("classpath:store.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceTest {
    @Autowired
    private PlaceOrderService orderService;

    @Autowired
    private ItemListService listService;

    @Test
    public void serviceTest() throws Exception {
        PurchaseOrderRequest orderReq = new PurchaseOrderRequest();
        orderReq.setItemId(1);
        orderReq.setAddress("신림");
        PurchaseOrderResult orderResult = orderService.order(orderReq);
        assertThat(orderResult.getOrder().getId(), notNullValue());

        List<Item> items = listService.getAll();
        assertThat(items.size(), greaterThan(0));
    }
}
