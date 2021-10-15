package daniyal.Loomian_Legacy.battle;

import java.util.Arrays;

import daniyal.Loomian_Legacy.core.Loomian;

public class Team {
	private Active active;
	Loomian[] team;
	
	public Team(Loomian[] team) {
		if(team.length>5) {
			this.team = Arrays.copyOfRange(team, 0, 4);
		} else {
			this.team = Arrays.copyOf(team, team.length);
		}
	}
	
	public boolean selectActive(int index) {
		if(index<team.length) {
			active = new Active(team[index]);
			return true;
		}
		
		return false;
		
	}
	
	public Active getActive() {
		return active;
	}
	
	public int indexOf(String loomianName) {
		for(int i = 0; i < team.length; i++) {
			if(loomianName.equalsIgnoreCase(team[0].loomian().name())) {
				return i;
			}
		}
		
		return -1;
	}
	
	
}
