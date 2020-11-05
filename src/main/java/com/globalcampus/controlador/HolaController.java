package com.globalcampus.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaController {

	@RequestMapping(value="saludar")
	public String holaMundo(Model model) {
		model.addAttribute("objHola", "Hola mundo!");
		return "saludar";
	}
}
