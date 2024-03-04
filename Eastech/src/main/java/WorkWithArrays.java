
public class WorkWithArrays {
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);

		String[] colors;
		colors = new String[5];
		colors[0] = "Red";
		colors[1] = "Blue";
		colors[2] = "Red";
		colors[3] = "Black";
		colors[4] = "Pink";

		System.out.println(colors[3]);
		System.out.println(cars.length);
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}

		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers[1][2]); // Outputs 7

		for (int i = 0; i < myNumbers.length; ++i) {
			for(int j = 0; j < myNumbers[i].length; ++j) {
				System.out.print(myNumbers[i][j]);
				System.out.print(" ");

			}
			System.out.println("");
		}
		
		String[][] arraysOfColors = new String[colors.length][];
		
		for (int i = 0; i < colors.length; i++) {
			arraysOfColors[i] = colors;
			
		}

		for (int i = 0; i < arraysOfColors.length; ++i) {
			for(int j = 0; j < arraysOfColors[i].length; ++j) {
				System.out.print(arraysOfColors[i][j]);
				System.out.print(" ");

			}
			System.out.println("");
		}
	}
}
