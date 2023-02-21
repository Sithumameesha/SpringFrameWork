package lk.ijse.Spring.spring.Repo;

import lk.ijse.Spring.spring.Entity.Customer;
import lk.ijse.Spring.spring.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,String> {
}
