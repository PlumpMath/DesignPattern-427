package factory.abstractfactory.creator;

import factory.abstractfactory.product.ProductA;
import factory.abstractfactory.product.ProductA2;
import factory.abstractfactory.product.ProductB;
import factory.abstractfactory.product.ProductB2;

public class ConcreteCreator2 implements Creator {

	public ProductA createProductA() {
		return new ProductA2();
	}

	public ProductB createProductB() {
		return new ProductB2();
	}

}
