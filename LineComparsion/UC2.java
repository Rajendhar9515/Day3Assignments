public class UC2 {

	int x1, x2, y1, y2;
	int a1, a2, b1, b2;

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision");
		UC2 method = new UC2();
		method.Length();

	}

	public void Length() {
		Double distance_a, distance_b;
		x1 = 2; y1 = 3; x2 = 5; y2 = 6;
		a1 = 2; b1 = 3; a2 = 4; b2 = 6;
		distance_a = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
		System.out.println("Calculated length1: " + distance_a);
		distance_b = Math.sqrt(Math.pow((a2 - a1), 2) + (Math.pow((b2 - b1), 2)));
		System.out.println("Calculated length2: " + distance_b);
		if (distance_a.equals (distance_b)) {
			System.out.println("Lines are Equal");
		} else {
			System.out.println("Lines are not Equal");
		}

	}

}
