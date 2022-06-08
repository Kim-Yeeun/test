//package com.yev.test.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.yev.test.vo.TestVo;
//
//@Controller
//public class ThymeleafTestController {
//
//	@GetMapping("/thymeleafTest")
//	public String thymeleafTest(Model model) {
//		TestVo testModel = new TestVo("kimyeeun", "김예은");
//		model.addAttribute("testModel", testModel);
//		return "thymeleafTest";
//	}
//}
