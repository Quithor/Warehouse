package top.yanquithor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    
    private static final Logger log = LoggerFactory.getLogger(RequestController.class);
    
    @RequestMapping("/person")
    public String person( String name, Integer age){
        log.info("name is: {}", name);
        log.info("age is: {}", age);
        return "Data received!";
    }
    
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        log.info("user is: {}", user);
        return "Data received!";
    }
    
//    @RequestMapping("/person")
//    public String person(@RequestParam(name="name",required = false)String username, Integer age){
//        log.info("name is: {}", username);
//        log.info("age is: {}",age);
//        return "Data received!";
//    }
}
