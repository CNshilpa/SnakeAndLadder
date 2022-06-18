package SnakeLadder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int player1Position=0;
		Random random=new Random();
		int dice=1+random.nextInt(6);
		System.out.println("dice value: "+dice);
		Random random1=new Random();
		int playOption=random1.nextInt(3);
		System.out.println("play option: "+playOption);
		switch (playOption) {
		case 0:
			System.out.println(" NO PLAY "+" Player position is " +player1Position);
			break;
		case 1:
			player1Position=player1Position+dice;
			System.out.println(" Ladder!! \n Player position is " +player1Position);
			break;

		default:
			player1Position=player1Position-dice;
			System.out.println(" Snake "+" Player position is " +player1Position);
			break;
		}
		
	}

	}


