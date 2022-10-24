package pedromarineli.repositories;

import org.springframework.data.repository.CrudRepository;
import pedromarineli.models.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Integer> {

} 