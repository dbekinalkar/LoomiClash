package daniyal.Loomian_Legacy.battle;

import daniyal.Loomian_Legacy.core.Move;

public class Battle {
	
	boolean ongoing;
	
	private int round;
	Player p1;
	Player p2;
	
	Effect[] effects;
	
	
	public Battle(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		
		ongoing = true;
		round = 0;
	}
	
	int currentRound() {
		return round;
	}
	
	void startBattle() {
		round = -1;
	}
	
	
	public boolean pickActive(int index1, int index2) {
		if(isOngoing() && round == 0) {
			p1.getTeam().selectActive(index1);
			p2.getTeam().selectActive(index2);
			
			System.out.println(p1.name+" sent out "+ p1.getTeam().getActive().l.getNickName()+"!");//test, delete later
			System.out.println(p2.name+" sent out "+ p2.getTeam().getActive().l.getNickName()+"!");//test, delete later
			
			round++;
			return true;
		}
		return false;
	}
	
	
	
	public boolean pickMoves(Move m1, Move m2) {
		if(isOngoing()) {
			/*for(Effect e: effects) {
				e.fcn.test(this);
			}*/ //Remember to uncomment when working on effects
			attack(p1, p2, m1);
			attack(p2, p1, m2);
			
			if(p2.getTeam().getActive().l.fainted) {
				ongoing = false;
				System.out.println("Player 1 has won!");
			}
			
			if(p1.getTeam().getActive().l.fainted) {
				ongoing = false;
				System.out.println("Player 2 has won!");
			}
			
			round++;
			return true;
		}
		return false;
	}
	
	private void attack(Player attacking, Player defending, Move m) {
		
		Active aLoomian = attacking.getTeam().getActive();
		Active dLoomian = defending.getTeam().getActive();
		
		defending.getTeam().getActive().l.cHealth -= damageCalc(attacking.getTeam().getActive(), defending.getTeam().getActive(), m);
		attacking.getTeam().getActive().l.cEnergy -= m.energyCost();
		
		System.out.println(attacking.name+"'s "+aLoomian.l.getNickName()+" used "+m.name()+".\n"
				+ defending.name+"'s "+dLoomian.l.getNickName()+" now has "+ dLoomian.l.cHealth+"/"+dLoomian.l.getTotal().get("health"));//test, remove later
		
		if(defending.getTeam().getActive().l.cHealth <= 0) {
			defending.getTeam().getActive().l.fainted = true;
			
			System.out.println(defending.name+"'s "+dLoomian.l.getNickName()+" fainted.");//test, remove later
		}
		
		
	}
	
	private int damageCalc(Active attacking, Active defending, Move m){
		
		int attack = ((2 * attacking.l.getLevel() / 5) + 2) * attacking.l.getTotal().get("mAtk") * m.power(); //update to choose between mAtk and rAtk, might want to change the names
		
		int defense = 50 * defending.l.getTotal().get("mDef");//update to choose between mDef and rDef, might want to change the names
		
		return attack / defense;
	}

	public boolean isOngoing() {
		return ongoing;
	}
	
	
}
