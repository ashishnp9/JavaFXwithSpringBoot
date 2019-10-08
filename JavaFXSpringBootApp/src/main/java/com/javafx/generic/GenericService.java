package com.javafx.generic;

import java.util.List;

/**
 * Ashish.Patel
 */

public interface GenericService<T extends Object> {

	T save(T entity);
    
    T update(T entity);
  
    void delete(T entity);
  
    void delete(Long id);
    
    void deleteInBatch(List<T> entities);
  
    T find(Long id);
  
    List<T> findAll();
}
