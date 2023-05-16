package producttest.domain;

import java.util.*;
import lombok.*;
import producttest.domain.*;
import producttest.infra.AbstractEvent;

@Data
@ToString
public class ProductAdd extends AbstractEvent {

    private Long id;
    private String productNo;
    private String productName;
    private String productStandard;
    private MaterialId materialId;
    private ProcessId processId;
    private List<ProductDetail> productDetail;

    public ProductAdd(Product aggregate) {
        super(aggregate);
    }

    public ProductAdd() {
        super();
    }
}
