package poemPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poem {

	public static void main(String[] args) {

	}

	String[] poem;

	public String[] getPoem() {
		return poem;
	}

	public void setPoem(String[] poem) {
		this.poem = poem;
	}

	public Poem(String[] poem) {
		this.poem = poem;
	}

	public boolean hasWord(String[] poem) {

		if (Arrays.asList(getPoem()).toString().toLowerCase().contains("kui")) {
			return true;

		} else {
			return false;
		}
	}

	public int countWord(String[] poem) {
		int i = 0;
		String in = Arrays.asList(poem).toString().toLowerCase();
		Pattern p = Pattern.compile("kurat");
		Matcher m = p.matcher(in);
		while (m.find()) {
			i++;
		}
		// int j = 0;
		// int occurance =
		// StringUtils.countMatches(Arrays.asList(poem()).toString().toLowerCase(),
		// "jumal");
		// for (int i = 0; i < poem.toString(); i++) {
		// if (Arrays.asList(poem()).toString().toLowerCase().contains("jumal"))
		// {
		// j+=1;
		// }
		// }
		return i;
	}

	public int firstAppear(String[] poem) {

		for (int i = 0; i < Arrays.asList(poem).size(); i++) {
			if (Arrays.asList(poem[i]).toString().toLowerCase().contains("karjalaps")) {
				return i + 1;
			}
		}
		return 0;
	}

	public List<Integer> appearedOnRows(String[] poem) {
		int row = 1;
		List<Integer> rows = new ArrayList<>();
		for (String i : this.poem) {
			if (i.toLowerCase().contains("jumal")) {
				rows.add(row);
			}
			row++;
		}
		if (rows.isEmpty()) {
			rows.add(-1);
		}
		return rows;
	}

	public List<Integer> notAppearedOnRows(String[] poem) {
		int row = 1;
		List<Integer> rows = new ArrayList<>();
		for (String i : this.poem) {
			if (i.toLowerCase().contains("allah")) {
				rows.add(row);
			}
			row++;
		}
		if (rows.isEmpty()) {
			rows.add(-1);
		}
		return rows;
	}

	

	public List<String> appearedRows(String[] poem) {
		int row = 1;
		List<String> rows = new ArrayList<>();
		for (String i : this.poem) {
			if (i.toLowerCase().contains("jumal")) {
				rows.add(i);
			}
			row++;
		}
		if (rows.isEmpty()) {
			rows.add("no match");
		}
		return rows;
	}

	public List<String> notAppearedRows(String[] poem) {
		int row = 1;
		List<String> rows = new ArrayList<>();
		for (String i : this.poem) {
			if (i.toLowerCase().contains("dffvgf")) {
				rows.add(i);
			}
			row++;
		}
		if (rows.isEmpty()) {
			rows.add("no match");
		}
		return rows;
	}
}
