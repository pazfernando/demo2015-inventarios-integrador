package ec.com.se.demo2015.inventarios;

import java.util.List;
import java.util.Map;

public interface InventariosBDD {
	List<Map<String, Object>> getProducts();
}
