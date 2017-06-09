package com.yunxi.drm.test.dal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yunxi.drm.dal.datainterface.ApplicationDAO;
import com.yunxi.drm.dal.dataobject.ApplicationDO;
import com.yunxi.drm.web.starter.ApplicationStarter;

/**
 * 应用DAO单元测试
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: ApplicationDAOTest.java, v 0.1 2017年6月8日 下午4:07:39 leukony Exp $
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=ApplicationStarter.class)
public class ApplicationDAOTest {
    
    @Autowired
    private ApplicationDAO applicationDAO;
    
    @Test
    public void testInsert() {
        ApplicationDO application = new ApplicationDO();
        application.setAppName("test_app_name");
        application.setAppDomain("test_app_domain");
        int c = applicationDAO.insert(application);
        assertEquals(c, 1);
        
        ApplicationDO application4DB = applicationDAO.selectByNameAndDomain(
            application.getAppName(), application.getAppDomain());
        assertNotNull(application4DB);
        assertEquals(application.getAppName(), application4DB.getAppName());
        assertEquals(application.getAppDomain(), application4DB.getAppDomain());
    }
    
    @After
    public void testAfter() {
        // 删除测试数据
        ApplicationDO application = new ApplicationDO();
        application.setAppName("test_app_name");
        application.setAppDomain("test_app_domain");
        int c = applicationDAO.delete(application);
        assertEquals(c, 1);
    }
}