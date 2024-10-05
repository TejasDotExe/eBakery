package eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eCommerce.dataAccessObjects.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
