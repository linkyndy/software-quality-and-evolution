package tema2;

import java.util.ArrayList;
import tema2.Circle;

public class CPUTest {
	public static void main(String[] args) {
		final int nr = 300;
		
		ArrayList<Circle> circles = new ArrayList<Circle>();
		
		for (int i = 0; i < nr; i++) {
			circles.add(new Circle(i));
		}
		
		for (int i = 0; i < nr; i++) {
			System.out.println(i);
			circles.get(i).getRadius();
		}
	}
}
