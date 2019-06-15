package com.mirana.soc.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericDao<T, ID> extends CrudRepository<T, ID> {

}
