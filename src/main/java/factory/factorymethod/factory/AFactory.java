package factory.factorymethod.factory;

import factory.factorymethod.product.AProuct;
import factory.factorymethod.product.Product;

public class AFactory implements ProductFactory{

	public Product productFactory() {
		return new AProuct();
	}

}
