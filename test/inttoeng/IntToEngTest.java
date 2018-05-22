package inttoeng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IntToEngTest {

	@Test
	public void 二十以上の数字を英語に変換します() {
		IntToEng ite = new IntToEng();
		String expected = "twenty";
		String actual = ite.translateEng(20);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void 一桁を英語に変換します() {
		IntToEng ite = new IntToEng();
		String expected = "onehundredone";
		String actual = ite.translateEng(101);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void 十番台の数字を英語に変換します() {
		IntToEng ite = new IntToEng();
		String expected = "nineteen";
		String actual = ite.translateEng(19);
		assertThat(actual,is(expected));
		
	}

}
