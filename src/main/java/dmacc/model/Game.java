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
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}
	
	private void determineWinner() {
		


		//Code for debugging
//		if(player1 == "rock") {
//			if(computerPlayer == "rock") {
//				winner = "PLAYER ROCK COM ROCK";
//			}
//			else if(computerPlayer == "paper") {
//				winner = "PLAYER ROCK COM PAPER";
//			}
//			else {
//				winner = "PLAYER ROCK COM SCISSORS";
//			}
//		} else if(player1 == "paper") {
//			if(computerPlayer == "rock") {
//				winner = "PLAYER PAPER COM ROCK";
//			}
//			else if(computerPlayer == "paper") {
//				winner = "PLAYER PAPER COM PAPER";
//			}
//			else {
//				winner = "PLAYER PAPER COM SCISSORS";
//			}
//		} else {
//			if(computerPlayer == "rock") {
//				winner = "PLAYER SCISSORS COM ROCK";
//			}
//			else if(computerPlayer == "paper") {
//				winner = "PLAYER SCISSORS COM PAPER";
//			}
//			else {
//				winner = "PLAYER SCISSORS COM SCISSORS";
//			}
//		}
		//Debug 2
//		if(computerPlayer == "rock") {
//			if(player1 == "rock") {
//				winner = "COM ROCK PLAYER ROCK";
//			}
//			else if(player1 == "paper") {
//				winner = "COM ROCK PLAYER PAPER";
//			}
//			else {
//				winner = "COM ROCK PLAYER SCISSORS";
//			}
//		} else if(computerPlayer == "paper") {
//			if(player1 == "rock") {
//				winner = "COM PAPER PLAYER ROCK";
//			}
//			else if(player1 == "paper") {
//				winner = "COM PAPER PLAYER PAPER";
//			}
//			else {
//				winner = "COM PAPER PLAYER SCISSORS";
//			}
//		} else {
//			if(player1 == "rock") {
//				winner = "COM SCISSORS PLAYER ROCK";
//			}
//			else if(player1 == "paper") {
//				winner = "COM SCISSORS PLAYER PAPER";
//			}
//			else {
//				winner = "COM SCISSORS PLAYER SCISSORS";
//			}
//		}
		
		//Code if things worked properly
		if(player1 == "rock") {
			if(computerPlayer == "rock") {
				winner = "Draw";
			}
			else if(computerPlayer == "paper") {
				winner = "Computer";
			}
			else {
				winner = "Player";
			}
		} else if(player1 == "paper") {
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
		
		//Print for debugging
		System.out.println("Player: " + player1 + ", Computer: " + computerPlayer);
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
