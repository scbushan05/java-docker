package in.bushansirgur.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "Setup the CI/CD";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello... Greeting message";
    }
}
