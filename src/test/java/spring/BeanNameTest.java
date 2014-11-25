package spring;

import dao.ItemDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@ContextConfiguration("classpath:store.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BeanNameTest {
    @Autowired
    private ApplicationContext ctx;

    @Test
    public void genNames() {
        ItemDao itemDaoMaster = ctx.getBean("itemDaoMaster", ItemDao.class);
        ItemDao itemDaoSlave = ctx.getBean("itemDaoSlave", ItemDao.class);
        assertTrue(itemDaoMaster != itemDaoSlave);
    }
}
