package daniyal.Loomian_Legacy.testing;

import java.util.Scanner;

import daniyal.Loomian_Legacy.battle.Battle;
import daniyal.Loomian_Legacy.battle.Player;
import daniyal.Loomian_Legacy.battle.Team;
import daniyal.Loomian_Legacy.core.Loomian;
import daniyal.Loomian_Legacy.core.Move;

public class TestingBattle {
	public static void main(String[] args) {
		String embit = "Embit\nPounce\nSkip";
		String weevolt = "Weevolt\nPounce\nSkip";
		Battle b = new Battle(new Player("Player 1", new Team(new Loomian[] {new Loomian(embit)})), 
				new Player("Player 2", new Team(new Loomian[] {new Loomian(weevolt)})));
		
		Scanner input = new Scanner(System.in);
		
		int index1 = Integer.parseInt(input.nextLine());
		int index2 = Integer.parseInt(input.nextLine());
		
		b.pickActive(index1, index2);
		
		while(b.isOngoing()) {
			String in1 = input.nextLine();
			String in2 = input.nextLine();
			
			b.pickMoves(Move.valueOf(in1), Move.valueOf(in2));
		}
		
		input.close();
	}
}
