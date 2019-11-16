package com.fr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fr.service.PyramidWordService;

@RestController
@RequestMapping("/api")
public class HomeController {

	@Autowired
	private PyramidWordService pyramidWordService;

	@GetMapping("/pyramidtest/{inputString}")
	public boolean pyramidWord(@PathVariable String inputString) {
		return pyramidWordService.checkForPyramidWord(inputString);
	}
}
