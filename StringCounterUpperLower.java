package JavaBasic;

public class StringCounterUpperLower {

	public static void main(String[] args) {

		String Str = "VElocity            ";
        int upper = 0;
		int Lower = 0;

		for (int i = 0; i < Str.length(); i++) {

			char ch = Str.charAt(i);

			// if Char is upper //upper letter start from A=65 to Z=90

			if (ch >= 65 && ch <= 90) {

				upper++;// if upper letter found increase the upper count

			}
            else {

				Lower++;// if lower lwttter found increase the Lower count

				// if any space found ignore it space ASCII value is =32// so we decrease the
				// lower
				if (ch == 32) {
					Lower--;
				}
				
				
			}
		}
		System.out.println("Upper=" + upper);
		System.out.println("Lower=" + Lower);
	}
}
