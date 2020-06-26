package lambdas_streams;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AverageForListTest {

	@Test
	public void test() {
		Assert.assertEquals(3,AverageForList.average(Arrays.asList(1,2,3,4,5)),0);
		Assert.assertEquals(0,AverageForList.average(Arrays.asList(0)),0);
		Assert.assertEquals(4,AverageForList.average(Arrays.asList(1,3,4,5,5,2,7,5)),0);
	}

}
