package lambdas_streams;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ThreeCharsAndStartWithATest {

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{"anu","abi","aha"},ThreeCharsAndStartWithA.match(Arrays.asList("Abhi","anu","Hello","abi","Aha","aha")).toArray());
		Assert.assertArrayEquals(new String[]{"ant","aha","aaa"},ThreeCharsAndStartWithA.match(Arrays.asList("Abhi","Birbal","Rajesh","anthony","ant","aha","nua","aaa","ola")).toArray());
		Assert.assertArrayEquals(new String[]{},ThreeCharsAndStartWithA.match(Arrays.asList("paper","amar","sweet","special")).toArray());
	}

}
