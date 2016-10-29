package poemPackage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class PoemTest {
	
	@Test
	public void doesItContainTheWord(){
		Poem poem = new Poem();

		String luuletusRunnel[] = new String[] { "Kui sind kiusab kurat", "hüüa valjusti: Kurat!",
				"Kui sind jälgib jumal, ", "ütle julgesti: Jumal!", "ära häbene sõpru, ", "ära vaenlasi varja, ",
				"lahke meelega mine", "äike karjalaps karja." };
		poem.hasWord(poem.poem());
		assertThat(poem.hasWord(luuletusRunnel), is(true));
	}
	@Test
	public void countingTheWords(){
		Poem poem = new Poem();

		String luuletusRunnel[] = new String[] { "Kui sind kiusab kurat", "hüüa valjusti: Kurat!",
				"Kui sind jälgib jumal, ", "ütle julgesti: Jumal!", "ära häbene sõpru, ", 
				"ära vaenlasi varja, ", "lahke meelega mine", "äike karjalaps karja." };
		assertThat(poem.countWord(luuletusRunnel), is(2));
	}
}
