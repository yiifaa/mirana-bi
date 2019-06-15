package com.mirana.soc.common.cmd;

import com.mirana.soc.common.domain.Menu;
import com.mirana.soc.common.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("/common/menu")
public class MenuController {

    private MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @RequestMapping("/root")
    public Menu root() {
        Optional<Menu> root = this.menuService.findById(1L);
        return root.get();
    }
}
