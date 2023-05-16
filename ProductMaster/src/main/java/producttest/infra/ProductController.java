package producttest.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import producttest.domain.*;

@RestController
// @RequestMapping(value="/products")
@Transactional
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PutMapping(
        "/products/search/findByProductNoOrProductNameOrProductStandard"
    )
    public Object findByProductNoOrProductNameOrProductStandard(
        @RequestBody ProductViewQuery query
    ) {
        return productRepository.findByProductNoOrProductNameOrProductStandard(
            query.getProductNo(),
            query.getProductName(),
            query.getProductStandard()
        );
    }
}
