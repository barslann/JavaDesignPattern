package solid.dip.solution;

import org.junit.Assert;
import org.junit.Test;
import solid.dip.solution.bbdd.StockRepositoryImpl;
import solid.dip.solution.business.StockController;


public class StockControllerTests {

	@Test
	public void test_stock_control() {
		StockController controller = new StockController(new StockRepositoryImpl());
		
		Assert.assertFalse(controller.needMoreItemsInShop("north shop", "table"));
		Assert.assertTrue(controller.needMoreItemsInShop("north shop", "lamp"));

	}

}
