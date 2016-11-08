package poemPackage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PoemTest {

	String[] luuletusRunnel = {
			"Kui sind kiusab kurat",
			"hüüa valjusti: Kurat!",
			"Kui sind jälgib jumal",
			"ütle julgesti: Jumal!",
			"ära häbene sõpru,",
			"ära vaenlasi varja,",
			"lahke meelega mine",
			"väike karjalaps, karja."
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
		answers.add("Kui sind jälgib jumal");
		answers.add("ütle julgesti: Jumal!");
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