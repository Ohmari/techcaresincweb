package org.techcaresinc.techcaresincweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class TechcaresincwebApplication {

    @RequestMapping(value = "/")
    public String root (){
        return "Index";
    }
    public static void main(String[] args) {
        SpringApplication.run(TechcaresincwebApplication.class, args);
    }

}
