package stream;

public class Widget {
	private String color;
	private int weight;
	
	public Widget(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return this.weight;
	}
}
