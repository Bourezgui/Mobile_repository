#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package com.connexion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GlobalController {
	
	@GetMapping("/login")
	public String login() {
		System.out.println("this is the best way to test!!!");
		return "login";
		
	}
	

}
