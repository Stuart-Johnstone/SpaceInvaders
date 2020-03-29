public class Prey extends Animal {
	private String defence;
	private int herdSize = 1;
	
	public Prey(char type, int health, String defence) {
		super(type, health);
		this.defence = (defence.equals("huddle")) ? defence : (defence.equals("hide")) ? defence : (defence.equals("stampede")) ? defence : "stampede";
		//this.herdSize = (herdSize > 0) ? herdSize :1;
	}
	
	public Prey(Prey toCopy){
		super(toCopy);
		defence = toCopy.defence;
		herdSize = toCopy.herdSize;
		
	}
	
	public String getDefence() {
		return defence;
	}
	public void setDefence(String aDefence) {
		this.defence = (aDefence.equals("huddle")) ? aDefence : (aDefence.equals("hide")) ? aDefence : (aDefence.equals("stampede")) ? aDefence : this.defence;
	}
	
	public int getHerdSize() {
		return herdSize;
	}
	
	public void setHerdSize(int size) {
		this.herdSize = (size > 0) ? size : herdSize;
	}
	
	public double getRelativeHealth() {
		return (defence.equals("hide")) ? this.getHealth() : (double)this.getHealth() * herdSize / 10;
	}
	
	public String toString() {
		return "[Prey] " + super.toString() + " Defence: " + getDefence();
	}
}