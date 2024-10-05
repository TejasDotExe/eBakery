package eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eCommerce.dataAccessObjects.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe,Integer> {

}
