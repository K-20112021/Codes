package JavaBasic;

public class StringDemo1 {

	public static void main(String[] args) {

		String S = "rahul";

		int upper = 0;
		int lower = 0;

		for (int i = 0; i < S.length(); i++) {

			char Ch = S.charAt(i);

			if (Ch >= 65 && Ch <= 90) {

				upper++;
				
				
			} else {

				lower++;

				if (Ch == 32) {

					lower--;
				}

			}

		}

		System.out.println("upper count=" + upper);
		System.out.println("lower count=" + lower);

	}

}
