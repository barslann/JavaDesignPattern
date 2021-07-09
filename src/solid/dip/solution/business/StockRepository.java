package solid.dip.solution.business;

public interface StockRepository {

	int getStock(String shop, String product);

}