package producttest.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import producttest.ProductMasterApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductMasterApplication.class })
public class CucumberSpingConfiguration {}
