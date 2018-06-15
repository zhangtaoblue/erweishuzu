package cn.et.dgp;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@EnableAutoConfiguration
@Controller
public class TestController {
	@ResponseBody
	@RequestMapping("dpg")
	public String test() {
		return "Hello SB DGP";
	}
	public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }
}
