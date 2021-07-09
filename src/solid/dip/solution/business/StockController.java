package solid.dip.solution.business;

public class StockController {

	private final StockRepository repository;
	
	public StockController(StockRepository repository) {
		this.repository = repository;
	}

	/**
	 * Our brainy studies have found that customers buy more products when the name of 
	 * this product  is longer, so the stock cannot be less than 100 * the length 
	 * of the product name.   For example: 
	 *   - we need at least 500 tables (table: 5 letters)
	 *   - and at least 400 lamps (lamp: 4 letters)
	 */
	public boolean needMoreItemsInShop (String shop, String product) {
		int currentStock = repository.getStock(shop, product);
		
		return  currentStock < product.length() * 100;
	}

}
