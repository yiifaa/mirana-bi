package com.mirana.soc.common.service.impl;

import com.mirana.soc.common.dao.MenuDao;
import com.mirana.soc.common.domain.Menu;
import com.mirana.soc.common.service.MenuService;
import com.mirana.soc.persistence.GenericDao;
import com.mirana.soc.persistence.impl.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends GenericServiceImpl<Menu, Long> implements MenuService {

    private MenuDao menuDao;

    @Autowired
    public MenuServiceImpl(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    @Override
    protected GenericDao<Menu, Long> dao() {
        return this.menuDao;
    }

}
