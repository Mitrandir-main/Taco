package tacos.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.kotlin.CoroutineCrudRepository;
import tacos.Ingredient;
import tacos.Taco;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

//public interface IngredientRepository {

//    Iterable<Ingredient> findAll();
//
//    Ingredient findOne(String id);
//
//    Ingredient save(Ingredient ingredient);
}
