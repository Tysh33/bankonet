package bankonet.Repository;

import bankonet.Entity.CompteEpargne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface CompteEpargneRepository extends CrudRepository<CompteEpargne, Integer> {

}