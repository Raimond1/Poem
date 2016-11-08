package poemPackage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PoemTest {

	String[] luuletusRunnel = {
			"Kui sind kiusab kurat",
			"h��a valjusti: Kurat!",
			"Kui sind j�lgib jumal",
			"�tle julgesti: Jumal!",
			"�ra h�bene s�pru,",
			"�ra vaenlasi varja,",
			"lahke meelega mine",
			"v�ike karjalaps, karja."
			};
	Poem poem = new Poem(luuletusRunnel);

	@Test
	public void doesThePoemContainTheWord() {
		assertThat(poem.hasWord("kui"), is(true));
	}

	@Test
	public void countingTheWord() {
		assertThat(poem.countTheWord("kARJA"), is(1));
	}

	@Test
	public void numberOfRowWhereTheWordfirstAppeared() {
		assertThat(poem.firstAppear("karjalaps"), is(8));
	}

	@Test
	public void rowsWhereTheWordAppearedOn() {
		List<Integer> answers = new ArrayList<>();
		answers.add(3);
		answers.add(4);
		assertThat(poem.appearedOnRows("jumal"), is(answers));
	}

	@Test
	public void getTheRowsThatTheWordAppearedOn() {
		List<String> answers = new ArrayList<>();
		answers.add("Kui sind j�lgib jumal");
		answers.add("�tle julgesti: Jumal!");
		assertThat(poem.getAppearedRows("jumal"), is(answers));
	}

	@Test
	public void theWordThatDidntAppearOnAnyOfTheRows() {
		List<String> noAnswerStr = new ArrayList<>();

		assertThat(poem.getAppearedRows("allah"), is(noAnswerStr));
	}

	@Test
	public void nonRowsAppear() {
		List<Integer> noAnswerInt = new ArrayList<>();

		assertThat(poem.appearedOnRows("allah"), is(noAnswerInt));
	}

}