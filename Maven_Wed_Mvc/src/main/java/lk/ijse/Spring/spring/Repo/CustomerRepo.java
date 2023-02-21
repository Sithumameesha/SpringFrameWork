package lk.ijse.Spring.spring.Repo;

import lk.ijse.Spring.spring.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {

}
