package tema2;

import java.util.ArrayList;

public class Circle {
	private double radius;
	private ArrayList<Integer> array_list;
	
	public Circle(double radius) {
		this.radius = radius;
		this.array_list = new ArrayList<Integer>();
		this.array_list.add(1);
		this.array_list.add(2);
		this.array_list.add(3);
	}
	
	public double getLength() {
		return 2 * Math.PI * this.radius;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getRadius() {
		System.out.println("before");
		
		double r = this.radius * 123456789.987654321 / this.radius * Math.pow(this.radius, 5) / Math.sqrt(this.radius * 5) / this.radius * this.radius / this.radius / 123456789.987654321;
		
		System.out.println("middle");
		
		double i = 0;
		while (i < r) {
			this.array_list.add(1, (this.array_list.remove(2)));
			i += 12.3456789;
		}
		
		System.out.println("after");
		return r;
	}
}
