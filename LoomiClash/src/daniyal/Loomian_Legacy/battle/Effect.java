package daniyal.Loomian_Legacy.battle;

import java.util.Comparator;
import java.util.function.Predicate;

public class Effect {
	
	private int round;
	private roundTiming roundTime;
	private int priority;
	
	Predicate<Battle> fcn;
	
	public Effect(int round, roundTiming roundTime, int priority, Predicate<Battle> fcn) {
		this.round = round;
		this.roundTime = roundTime;
		this.priority = priority;
		
		this.fcn = fcn;
	}
	
	public enum roundTiming {
		START, PRE_ALLY, POST_ALLY, PRE_ENEMY, POST_ENEMY, END;
	}
	
	
	public static final Comparator<Effect> byPriority = new Comparator<Effect>() {
		public int compare(Effect e1, Effect e2) {
			return e1.getPriority() - e2.getPriority();
		}
	};
	
	int getPriority() {
		return priority;
	}
	
	
}
