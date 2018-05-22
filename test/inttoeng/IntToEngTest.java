package inttoeng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void 二十以上数字を英語に変換します	(){
		IntToEng ite  = new IntToEng();
		String expected = "twenty";
		String actual = ite.translateEng(20);
		assertThat(actual, is(expected));
	}
	@Test
	public void 一桁を英語に変換します	(){
		IntToEng ite  = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual, is(expected));
	}
	@Test
	public void 十番台数字を英語に変換します	(){
		IntToEng ite  = new IntToEng();
		String expected = "nineteen";
		String actual = ite.translateEng(19);
		assertThat(actual, is(expected));
	}

}
