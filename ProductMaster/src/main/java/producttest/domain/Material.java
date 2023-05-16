package producttest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import producttest.ProductMasterApplication;
import producttest.domain.MaterialAdd;

@Entity
@Table(name = "Material_table")
@Data
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        MaterialAdd materialAdd = new MaterialAdd(this);
        materialAdd.publishAfterCommit();
    }

    public static MaterialRepository repository() {
        MaterialRepository materialRepository = applicationContext()
            .getBean(MaterialRepository.class);
        return materialRepository;
    }

    public static ApplicationContext applicationContext() {
        return ProductMasterApplication.applicationContext;
    }
}
