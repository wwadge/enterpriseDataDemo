package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwadge on 24/10/2014.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
