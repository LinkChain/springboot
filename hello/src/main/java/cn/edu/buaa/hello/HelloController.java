package cn.edu.buaa.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	 @RequestMapping("/hello")
	 public String say() {
		  return "Hello World！";
	 }
}
