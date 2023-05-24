package com.tw.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/getin/{username}")
	public ResponseEntity<String> getEntry(@PathVariable String username) {
		return ResponseEntity.ok("Hello " + username + " welcome to cloud environment");
	}

}
