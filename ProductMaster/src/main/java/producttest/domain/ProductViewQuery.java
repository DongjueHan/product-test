package producttest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class ProductViewQuery {

    String productNo;
    String productName;
    String productStandard;
}
