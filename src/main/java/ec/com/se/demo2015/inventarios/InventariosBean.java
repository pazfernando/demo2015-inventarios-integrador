package ec.com.se.demo2015.inventarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(Inventarios.class)
public class InventariosBean implements Inventarios {
	@Inject
	@Reference
	private InventariosBDD _inventario;

	@Override
	public List<Producto> getProducts() {
		List<Producto> productos = new ArrayList<Producto>();
		List<Map<String, Object>> datos = _inventario.getProducts();
		for (Map<String, Object> dato : datos) {
			Producto producto = new Producto();
			// for (String key : dato.keySet()) {
			// System.out.println("key -> " + key + ", value-> " +
			// dato.get(key));
			// }
			producto.setSKU(dato.get("SKU").toString());
			producto.setNombre(dato.get("NOMBRE").toString());
			producto.setDescripcion(dato.get("DESCRIPCION").toString());
			productos.add(producto);
		}
		return productos;
	}

}
