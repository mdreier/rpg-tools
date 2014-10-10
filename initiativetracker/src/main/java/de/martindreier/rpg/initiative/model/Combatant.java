package de.martindreier.rpg.initiative.model;

/**
 * Model class for combatant. Holds name and initative information.
 * 
 * @author Martin Dreier <martin@martindreier.de>
 *
 */
public class Combatant implements Comparable<Combatant> {
	/**
	 * Combatant name.
	 */
	private String name;
	
	/**
	 * Initiative count.
	 */
	private int initative;
	
	/**
	 * Initiative modifier.
	 */
	private int modifier;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInitative() {
		return initative;
	}

	public void setInitative(int initative) {
		this.initative = initative;
	}

	public int getModifier() {
		return modifier;
	}

	public void setModifier(int modifier) {
		this.modifier = modifier;
	}

	@Override
	public int compareTo(Combatant other) {
		if (other.initative == initative) {
			return Integer.compare(modifier, other.modifier);
		} else {
			return Integer.compare(initative, other.initative);
		}
	}

	@Override
	public String toString() {
		return String.format("Combatant <%s> (Int: %d; Mod: %+d)", name, initative, modifier);
	}
}
