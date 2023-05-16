package producttest.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import producttest.domain.*;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository
    extends PagingAndSortingRepository<Product, Long> {
    List<Product> findByProductNoOrProductNameOrProductStandard(
        String productNo,
        String productName,
        String productStandard
    );
}
