package com.ketankumar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ketankumar.response.ApiResponse;

@RestController
public class HomeController {
	@GetMapping
	public ApiResponse HomeControllerHandler() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage("Welcome from Home via response");
		return apiResponse;
	}
}
