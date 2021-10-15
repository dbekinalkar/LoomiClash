package daniyal.Loomian_Legacy.battle;

import daniyal.Loomian_Legacy.core.Loomian;
import daniyal.Loomian_Legacy.core.Stats;

public class Active{
	
	Loomian l;
	
	Stats statChanges;
	
	//Ability tempAbility;
	
	public Active(Loomian l){
		this.l = l;
	}
	
	public void swap(Loomian l) {
		this.l = l;
		statReset();
	}

	public void statReset(){
		statChanges = new Stats();
	}
		
	
}
