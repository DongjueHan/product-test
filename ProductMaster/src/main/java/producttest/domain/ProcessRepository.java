package producttest.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import producttest.domain.*;

@RepositoryRestResource(collectionResourceRel = "processes", path = "processes")
public interface ProcessRepository
    extends PagingAndSortingRepository<Process, Long> {
    List<Process> findByName(String name);
}
