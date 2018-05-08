package snakecamel;
import static org.junit.Assert.*;

import org.junit.Test;



public class SnakeCamelTest {

	@Test
	public void スネークケースの文字列をキャメルケースに変換() {
		SnakeCamelUtil scu= new SnakeCamelUtil();
		String expected="AbcDefGhi";
		String actual = scu.snakeToCamelcase("abc_def_ghi"); 
		assertEquals(expected,actual);
		
	
				

	}

	@Test
	public void キャメルケースの文字列をスネークケースに変換する() {
		SnakeCamelUtil scu= new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = scu.camelToSnakecase("AbcDefGhi"); 
		assertEquals(expected,actual);
				

	}
}
