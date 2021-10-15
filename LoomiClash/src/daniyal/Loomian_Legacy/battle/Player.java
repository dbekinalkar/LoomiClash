package daniyal.Loomian_Legacy.battle;

import daniyal.Loomian_Legacy.core.Move;

public class Player {
	String name;
	private Team t;
	
	public Player(String n, Team t) {
		name = n;
		this.t = t;
	}
	
	public Team getTeam() {
		return t;
	}
	
	
	Move[] options(){
		return t.getActive().l.getMoves();
	}

	public void useMove(Move m1, Player p2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
