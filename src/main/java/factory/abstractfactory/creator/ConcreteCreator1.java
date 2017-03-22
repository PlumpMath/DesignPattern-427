package factory.abstractfactory.creator;

import factory.abstractfactory.product.ProductA;
import factory.abstractfactory.product.ProductA1;
import factory.abstractfactory.product.ProductB;
import factory.abstractfactory.product.ProductB1;

public class ConcreteCreator1 implements Creator {

	public ProductA createProductA() {
		return new ProductA1();
	}

	public ProductB createProductB() {
		return new ProductB1();
	}

}
