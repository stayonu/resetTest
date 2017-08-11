package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author stayo
 *
 */
@RestController
public class HelloController {
    
	/**
	 * 
	 * @return
	 */
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    /**
     * 
     * @return
     */
    @RequestMapping("/welcome.do")
    public String welcome() {
        return "Welcome to Spring Boot!";
    }
}
