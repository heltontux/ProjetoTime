package code.com.desafio.appHelton.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import code.com.desafio.appHelton.model.domain.Time;

@Repository
public interface TimeRepository extends CrudRepository<Time, Integer>{

}
