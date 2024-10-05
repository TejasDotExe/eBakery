package eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eCommerce.dataAccessObjects.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
