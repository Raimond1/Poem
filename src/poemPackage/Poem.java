package poemPackage;

import java.util.ArrayList;
import java.util.List;

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

	public boolean hasWord(String word) {
		for (int i = 0; i < getPoem().length; i++) {
			if ((poem[i]).toString().toLowerCase().contains(word.toLowerCase())) {
				return true;
			}

		}
		return false;
	}

	public int countTheWord(String word) {
		int count = 0;
		for (String line : this.poem) {
			String cleanLine = line.replaceAll("[,.:;!?<>*/()]", "");
			String[] lineParts = cleanLine.split(" ");
			for (String part : lineParts) {
				if (part.toLowerCase().equals(word.toLowerCase())) {
					count++;
				}
			}
		}
		return count;
	}

	public int firstAppear(String word) {

		for (int i = 0; i < getPoem().length; i++) {
			if ((poem[i]).toString().toLowerCase().contains(word.toLowerCase())) {
				return i + 1;
			}
		}
		return 0;
	}

	public List<Integer> appearedOnRows(String word) {
		int row = 1;
		List<Integer> rows = new ArrayList<>();
		for (String i : this.poem) {
			if (i.toLowerCase().contains(word.toLowerCase())) {
				rows.add(row);
			}
			row++;
		}

		return rows;
	}

	public List<String> getAppearedRows(String word) {
		List<String> rows = new ArrayList<>();
		for (String i : this.poem) {
			if (i.toLowerCase().contains(word.toLowerCase())) {
				rows.add(i);
			}
		}
		return rows;
	}

}