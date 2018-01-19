
public class Human extends Animal {
	public Human(String name) {
		super(name);
	}
	public String getSound() {
		return "Hi. My name is " + getName() + ".";
	}
	public boolean hasWings() {
		return false;
	}
	public int getNumLegs() {
		return 2;
	}
}
