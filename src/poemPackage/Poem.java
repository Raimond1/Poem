package poemPackage;

import java.util.Arrays;

public class Poem {

	public static void main(String[] args) {

	}

	public String[] poem() {

		String luuletusRunnel[] = new String[] { "Kui sind kiusab kurat", "h��a valjusti: Kurat!",
				"Kui sind j�lgib jumal, ", "�tle julgesti: Jumal!", "�ra h�bene s�pru, ", "�ra vaenlasi varja, ",
				"lahke meelega mine", "�ike karjalaps karja." };
		return luuletusRunnel;
	}

	public boolean hasWord(String[] poem) {

			if (Arrays.asList(poem()).toString().toLowerCase().contains("kui")) {
				return true;

		}
		return false;
	}
	public int countWord(String[] poem) {
		int j = 0;
		for (int i = 0; i < poem.toString().length(); i++) {
			if (Arrays.asList(poem()).toString().toLowerCase().contains("jumal")) {
				j+=1;
			}
		}
		return j;
	}
}
