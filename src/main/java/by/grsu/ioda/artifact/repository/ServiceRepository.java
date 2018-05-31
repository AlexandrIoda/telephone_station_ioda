package by.grsu.ioda.artifact.repository;

import by.grsu.ioda.artifact.model.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Service, Long> {
    Service findById(int id);
}