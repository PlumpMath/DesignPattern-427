package factory.abstractfactory.creator;

import factory.abstractfactory.product.ProductA;
import factory.abstractfactory.product.ProductB;

public interface Creator {
	ProductA createProductA();

	ProductB createProductB();
}
