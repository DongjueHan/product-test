package producttest.domain;

import java.util.*;
import lombok.*;
import producttest.domain.*;
import producttest.infra.AbstractEvent;

@Data
@ToString
public class ProcessAdd extends AbstractEvent {

    private Long id;
    private String name;

    public ProcessAdd(Process aggregate) {
        super(aggregate);
    }

    public ProcessAdd() {
        super();
    }
}
