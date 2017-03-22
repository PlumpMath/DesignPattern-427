package factory.factorymethod.factory;

import factory.factorymethod.product.BProduct;
import factory.factorymethod.product.Product;

public class BFactory implements ProductFactory {

	public Product productFactory() {
		return new BProduct();
	}

}
