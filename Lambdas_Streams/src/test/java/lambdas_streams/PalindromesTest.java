package lambdas_streams;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class PalindromesTest {

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{"nitin","ada"},Palindromes.palindromeStrings(Arrays.asList("nitin","ada","Ada","Hello","Anthony")).toArray());
		Assert.assertArrayEquals(new String[]{}, Palindromes.palindromeStrings(Arrays.asList("Spider","Nova","Christie")).toArray());
		Assert.assertArrayEquals(new String[]{"SileeliS","goooooog"}, Palindromes.palindromeStrings(Arrays.asList("SileeliS","goooooog","Gooog")).toArray());
	}

}
