package poemPackage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class PoemTest {

	@Test
	public void containsTheWord() {
		Poem poem = new Poem();
		
		String luuletusRunnel[] = new String[] { "Kui sind kiusab kurat", "h��a valjusti: Kurat!",
				"Kui sind j�lgib jumal, ", "�tle julgesti: Jumal!", "�ra h�bene s�pru, ", "�ra vaenlasi varja, ",
				"lahke meelega mine", "v�ike karjalaps karja." };
		poem.hasWord(poem.poem());
		assertThat(poem.hasWord(luuletusRunnel), is(true));
	}

	@Test
	public void countingTheWords() {
		Poem poem = new Poem();

		String luuletusRunnel[] = new String[] { "Kui sind kiusab kurat", "h��a valjusti: Kurat!",
				"Kui sind j�lgib jumal, ", "�tle julgesti: Jumal!", "�ra h�bene s�pru, ", "�ra vaenlasi varja, ",
				"lahke meelega mine", "v�ike karjalaps karja." };
		assertThat(poem.countWord(luuletusRunnel), is(2));
	}

	@Test
	public void firstAppearance() {
		Poem poem = new Poem();

		String luuletusRunnel[] = new String[] { "Kui sind kiusab kurat", "h��a valjusti: Kurat!",
				"Kui sind j�lgib jumal, ", "�tle julgesti: Jumal!", "�ra h�bene s�pru, ", "�ra vaenlasi varja, ",
				"lahke meelega mine", "v�ike karjalaps karja." };
		assertThat(poem.firstAppear(luuletusRunnel), is(8));

	}

	@Test
	public void allAppearance() {
		Poem poem = new Poem();
		int[] vastus = new int[]{3, 4};

		String luuletusRunnel[] = new String[] { "Kui sind kiusab kurat", "h��a valjusti: Kurat!",
				"Kui sind j�lgib jumal, ", "�tle julgesti: Jumal!", "�ra h�bene s�pru, ", "�ra vaenlasi varja, ",
				"lahke meelega mine", "v�ike karjalaps karja." };
		 assertThat(poem.allAppearances(luuletusRunnel), is(vastus));

	}
}