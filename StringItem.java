package asg07;

public class StringItem implements Item {
	private String value;
	
	public StringItem(String value) {
		this.value = value;
	}
	
	public Item clone() {
		Item strItem;
		strItem = new StringItem(value);
		return strItem;
	}
	
	public String toString() {
		return "" + value;
	}
	
	public boolean equals(Item str) {
		if(this.value == str.toString()) return true;
		else return false;
	}
}
