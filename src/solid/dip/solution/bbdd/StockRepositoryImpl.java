package solid.dip.solution.bbdd;


import solid.dip.solution.business.StockRepository;

public class StockRepositoryImpl implements StockRepository {


	// Database query method
	
	@Override
	public int getStock(String shop, String product) {
		return DataBase.stocks.get(shop).get(product);
	}
}
