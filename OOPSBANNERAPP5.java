public class OOPSBANNERAPP5 {
	public static void main(String[] args) {
		// Inline initialization of banner lines using String.join() for clarity and conciseness
		String[] lines = {
			String.join("  ", " *** ", " *** ", "**** ", " ****"),
			String.join("  ", "*   *", "*   *", "*   *", "*    "),
			String.join("  ", "*   *", "*   *", "*   *", "*    "),
			String.join("  ", "*   *", "*   *", "**** ", " *** "),
			String.join("  ", "*   *", "*   *", "*    ", "    *"),
			String.join("  ", "*   *", "*   *", "*    ", "    *"),
			String.join("  ", " *** ", " *** ", "*    ", "**** ")
		};

		// Print the banner using an enhanced for loop
		for (String line : lines) {
			System.out.println(line);
		}
	}
}

