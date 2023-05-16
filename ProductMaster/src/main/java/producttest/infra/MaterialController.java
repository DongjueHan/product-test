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
// @RequestMapping(value="/materials")
@Transactional
public class MaterialController {

    @Autowired
    MaterialRepository materialRepository;

    @PutMapping("/materials/search/findByName")
    public Object findByName(@RequestBody MaterialViewQuery query) {
        return materialRepository.findByName(query.getName());
    }
}
