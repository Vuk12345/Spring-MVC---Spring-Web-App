
package in.ozeon.capp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Vuk
 */
@Controller
public class TestController {
    @RequestMapping("/test/heloWorld")
    public String helloWorld(){
        return "hello" ; // -> /WEB-INF/view/hello.jsp
    }
}
