package in.bushansirgur.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "Hello Welcome to Docker!!!!!";
    }
}
