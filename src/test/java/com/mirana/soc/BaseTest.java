package com.mirana.soc;


import com.mirana.soc.config.ServiceConfig;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Import(ServiceConfig.class)
public class BaseTest {

    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void testContext() {
        assertThat(applicationContext, IsNull.notNullValue());
    }

}
