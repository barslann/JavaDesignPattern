package solid.dip.exercise.bbdd;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

	// ----- this is our "database" -----
	public static Map<String, Map<String, Integer>> stocks = new HashMap<>();
	
	static {
		Map<String, Integer> northShopStock = new HashMap<>();
		northShopStock.put("lamp",350);
		northShopStock.put("table",500);
		
		stocks.put("north shop", northShopStock);
	}
	


}
