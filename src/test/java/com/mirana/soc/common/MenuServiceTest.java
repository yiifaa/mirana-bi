package com.mirana.soc.common;

import com.mirana.soc.BaseTest;
import com.mirana.soc.common.domain.Menu;
import com.mirana.soc.common.service.MenuService;
import org.hamcrest.core.Is;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.assertThat;

public class MenuServiceTest extends BaseTest {

    @Resource
    private MenuService menuService;

    @Test
    public void testSave() {
        Menu root = new Menu();
        root.setName("系统管理");
        Menu savedMenu = menuService.save(root);
        System.out.println(savedMenu.getId());
        assertThat(savedMenu == root, Is.is(true));
    }

}
