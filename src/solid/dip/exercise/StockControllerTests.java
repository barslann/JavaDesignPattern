package solid.dip.exercise;

import org.junit.Assert;
import org.junit.Test;
import solid.dip.exercise.bbdd.StockRepository;
import solid.dip.exercise.business.StockController;


public class StockControllerTests {

	@Test
	public void test_stock_control() {
		StockController controller = new StockController(new StockRepository());
		Assert.assertFalse(controller.needMoreItemsInShop("north shop", "table"));
		Assert.assertTrue(controller.needMoreItemsInShop("north shop", "lamp"));
	}

}
