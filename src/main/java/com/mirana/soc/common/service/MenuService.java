package com.mirana.soc.common.service;

import com.mirana.soc.common.dao.MenuDao;
import com.mirana.soc.common.domain.Menu;
import com.mirana.soc.persistence.GenericService;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MenuService extends GenericService<Menu, Long> {

}
