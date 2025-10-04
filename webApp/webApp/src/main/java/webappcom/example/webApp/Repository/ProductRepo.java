package webappcom.example.webApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webappcom.example.webApp.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
