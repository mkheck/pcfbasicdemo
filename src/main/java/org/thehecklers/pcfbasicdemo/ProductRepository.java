package org.thehecklers.pcfbasicdemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by markheckler on 5/24/17.
 */
@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long> {
}
