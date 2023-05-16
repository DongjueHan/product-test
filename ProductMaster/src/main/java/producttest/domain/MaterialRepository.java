package producttest.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import producttest.domain.*;

@RepositoryRestResource(collectionResourceRel = "materials", path = "materials")
public interface MaterialRepository
    extends PagingAndSortingRepository<Material, Long> {
    List<Material> findByName(String name);
}
