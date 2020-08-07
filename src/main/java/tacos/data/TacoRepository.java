package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

//public interface TacoRepository {

   // Taco save(Taco design);
}
