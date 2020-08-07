package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;
import tacos.User;

//public interface IngredientRepository extends CrudRepository<Ingredient, String> {

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);


}
