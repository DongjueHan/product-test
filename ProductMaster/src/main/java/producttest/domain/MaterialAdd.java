package producttest.domain;

import java.util.*;
import lombok.*;
import producttest.domain.*;
import producttest.infra.AbstractEvent;

@Data
@ToString
public class MaterialAdd extends AbstractEvent {

    private Long id;
    private String name;

    public MaterialAdd(Material aggregate) {
        super(aggregate);
    }

    public MaterialAdd() {
        super();
    }
}
