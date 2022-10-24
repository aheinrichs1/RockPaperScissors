package dmacc.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Random;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Oct 21, 2022
 */
@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}
	
	private void determineWinner() {
		if(player1.equalsIgnoreCase("rock")) {
			if(computerPlayer == "rock") {
				winner = "Draw";
			}
			else if(computerPlayer == "paper") {
				winner = "Computer";
			}
			else {
				winner = "Player";
			}
		} else if(player1.equalsIgnoreCase("paper")) {
			if(computerPlayer == "rock") {
				winner = "Player";
			}
			else if(computerPlayer == "paper") {
				winner = "Draw";
			}
			else {
				winner = "Computer";
			}
		} else {
			if(computerPlayer == "rock") {
				winner = "Computer";
			}
			else if(computerPlayer == "paper") {
				winner = "Player";
			}
			else {
				winner = "Draw";
			}
		}
	}
	
	private void setComputerPlayer() {
		Random rand = new Random();
		int randChoice = rand.nextInt(3);
		if(randChoice == 0) {
			this.setComputerPlayer("rock");
		} else if (randChoice == 1) {
			this.setComputerPlayer("paper");
		} else {
			this.setComputerPlayer("scissors");
		}

	}

}
