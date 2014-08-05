package asg07;

public class NumeralItem implements Item {
	public int value;
	
	public NumeralItem(int value) {
		this.value = value;
	}
	
	public Item clone() {
		return this;
	}
	
	public String toString() {
		return "" + value;
	}
	
	public boolean equals(Item numeral) {
		if(this.toString() == numeral.toString())
			return true;
		else return false;
	}
}
