package poemPackage;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poem {

	public static void main(String[] args) {

	}

	public String[] poem() {

		String luuletusRunnel[] = new String[] { "Kui sind kiusab kurat", "h��a valjusti: Kurat!",
				"Kui sind j�lgib jumal, ", "�tle julgesti: Jumal!", "�ra h�bene s�pru, ", "�ra vaenlasi varja, ",
				"lahke meelega mine", "v�ike karjalaps karja." };
		return luuletusRunnel;
	}

	public boolean hasWord(String[] poem) {

		if (Arrays.asList(poem()).toString().toLowerCase().contains("kui")) {
				return true;

		}else {
			return false;
		}
	}
	public int countWord(String[] poem) {
		int i = 0;
		String in = Arrays.asList(poem).toString().toLowerCase();
		Pattern p = Pattern.compile("kurat");
		Matcher m = p.matcher( in );
		while (m.find()) {
		    i++;
		}
//		int j = 0;
//		int occurance = StringUtils.countMatches(Arrays.asList(poem()).toString().toLowerCase(), "jumal");
//		for (int i = 0; i < poem.toString(); i++) {
//			if (Arrays.asList(poem()).toString().toLowerCase().contains("jumal")) {
//				j+=1;
//			}
//		}
		return i;
	}
	public int firstAppear(String[] poem) {
		
		for (int i = 0; i < Arrays.asList(poem).size(); i++) {
			if (Arrays.asList(poem[i]).toString().toLowerCase().contains("karjalaps")) {
				return i+1;
			}
		}
		return 0;
	}
	public Integer[] allAppearances(String[] poem) {
		int j = 0;
		for (int i = 0; i < Arrays.asList(poem).size(); i++) {
			if (Arrays.asList(poem[i]).toString().toLowerCase().contains("karjalaps")) {
				return 0;
			}
		}
		return -1;
	}
}
