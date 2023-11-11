package io.tutorial.crudApp.App.Repository;

import io.tutorial.crudApp.App.model.employee;
import org.springframework.data.repository.CrudRepository;

public interface AppRepository extends CrudRepository<employee,Long> {
}
