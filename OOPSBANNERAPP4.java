/**
 * OOPSBANNERAPP4 - UC4: Render OOPS as Banner using String Array and Loop
 *
 * This program builds the OOPS banner by storing each of the 7 output
 * lines in a String array and printing them with an enhanced for loop.
 */
public class OOPSBANNERAPP4 {

	public static void main(String[] args) {
		// Each letter is represented as a 7-line pattern
		String[] O = {
				"  ***  ",
				" *   * ",
				"*     *",
				"*     *",
				"*     *",
				" *   * ",
				"  ***  "
		};

		String[] P = {
				"***** ",
				"*    *",
				"*    *",
				"***** ",
				"*     ",
				"*     ",
				"*     "
		};

		String[] S = {
				" **** ",
				"*    *",
				"*     ",
				" ***  ",
				"    * ",
				"*    *",
				" **** "
		};

		// Construct the full banner lines by joining the corresponding
		// segments of each character with two spaces between letters.
		String[] lines = new String[7];
		for (int i = 0; i < 7; i++) {
			lines[i] = String.join("  ", O[i], O[i], P[i], S[i]);
		}

		// Print the banner using an enhanced for loop
		for (String line : lines) {
			System.out.println(line);
		}
	}
}

