package poemPackage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class PoemTest {


	String[] luuletusRunnel = {"Kui sind kiusab kurat", "h��a valjusti: Kurat!", "Kui sind j�lgib jumal", "�tle julgesti: Jumal!", "�ra h�bene s�pru,", "�ra vaenlasi varja,", "lahke meelega mine", "v�ike karjalaps karja."};
	
	@Test
	public void containsTheWord() {
		Poem poem = new Poem(luuletusRunnel);
		
		
		assertThat(poem.hasWord(luuletusRunnel), is(true));
	}

	@Test
	public void countingTheWords() {
		Poem poem = new Poem(luuletusRunnel);
		assertThat(poem.countWord(luuletusRunnel), is(2));
	}

	@Test
	public void firstAppearance() {
		Poem poem = new Poem(luuletusRunnel);
		assertThat(poem.firstAppear(luuletusRunnel), is(8));

	}

	@Test
	public void rowsAppearedOn() {
		Poem poem = new Poem(luuletusRunnel);
		
		assertThat(poem.appearedOnRows(luuletusRunnel).toString(), is("[3, 4]"));
	}
	
	@Test
	public void notRowsAppeared() {
		Poem poem = new Poem(luuletusRunnel);
		
		assertThat(poem.notAppearedRows(luuletusRunnel).toString(), is("[no match]"));
	}
	
	@Test
	public void nonRowsAppearTest(){
		Poem poem = new Poem(luuletusRunnel);
		assertThat(poem.notAppearedOnRows(luuletusRunnel).toString(), is("[-1]"));
	}
	
}