package com.mirana.soc.common.dao;

import com.mirana.soc.common.domain.Menu;
import com.mirana.soc.persistence.GenericDao;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuDao extends GenericDao<Menu, Long> {

}
