package cn.edu.buaa.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWord
 * ClassName: HelloController 
 * @Description: TODO
 * @author wangrong
 * @date 2017年9月16日
 */
@RestController
public class HelloController {

	 @RequestMapping("/hello")
	 public String say() {
		  return "Hello World！";
	 }
}
