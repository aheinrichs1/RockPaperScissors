package dmacc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dmacc.model.Game;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Oct 21, 2022
 */
@Controller
public class WebController {
	@GetMapping("/playagame")
	public String playGame(@RequestParam(name="choice", required=false) String theChoice, Model model) {
		if(theChoice==null) {
			return "index";
		}
		
		Game theOutcome = new Game(theChoice);
		model.addAttribute("game", theOutcome);
		return "results";
	}

}
