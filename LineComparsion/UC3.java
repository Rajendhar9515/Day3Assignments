
public class UC3 {
	int x1, x2, y1, y2;
	int a1, a2, b1, b2;

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision");
		UC3 method = new UC3();
		method.Length();
	}

	public void Length() {
		Double distance_a, distance_b;
		x1 = 1;
		y1 = 3;
		x2 = 4;
		y2 = 5;
		a1 = 1;
		b1 = 3;
		a2 = 4;
		b2 = 5;
		distance_a = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
		System.out.println("Calculated len1: " + distance_a);
		distance_b = Math.sqrt(Math.pow((a2 - a1), 2) + (Math.pow((b2 - b1), 2)));
		System.out.println("Calculated len2: " + distance_b);
		if (distance_a.compareTo(distance_b) == 0) {
			System.out.println("Line1 is  Equal to Line2");

		} else if (distance_a.compareTo(distance_b) == -1) {
			System.out.println("Line1 less than Line2");
		} else if (distance_a.compareTo(distance_b) == +1) {
			System.out.println("Line1 Greater than Line2");
		}
	}
}
