package producttest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import producttest.ProductMasterApplication;
import producttest.domain.ProductAdd;

@Entity
@Table(name = "Product_table")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productNo;

    private String productName;

    private String productStandard;

    @Embedded
    private MaterialId materialId;

    @Embedded
    private ProcessId processId;

    @ElementCollection
    private List<ProductDetail> productDetail;

    @PostPersist
    public void onPostPersist() {
        ProductAdd productAdd = new ProductAdd(this);
        productAdd.publishAfterCommit();
    }

    public static ProductRepository repository() {
        ProductRepository productRepository = applicationContext()
            .getBean(ProductRepository.class);
        return productRepository;
    }

    public static ApplicationContext applicationContext() {
        return ProductMasterApplication.applicationContext;
    }
}
