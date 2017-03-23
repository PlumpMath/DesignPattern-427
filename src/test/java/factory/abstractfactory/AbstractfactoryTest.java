package factory.abstractfactory;

import factory.abstractfactory.creator.ConcreteCreator1;
import factory.abstractfactory.creator.Creator;
import factory.abstractfactory.product.ProductA;
import factory.abstractfactory.product.ProductB;


/**
 * 
 * @author ligy
 * 抽象工厂模式算是工厂相关模式的终极形态，如果完全理解了上一章的工厂方法模式，
 * 那么抽象工厂模式就很好理解了。它与工厂方法唯一的区别就是工厂的接口里是一系列创造抽象产品的方法，
 * 而不再是一个，而相应的，抽象产品也不再是一个了，而是一系列相关的产品。这其实是工厂方法模式的一种扩展。
 * 
 */
public class AbstractfactoryTest {
	
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator1();
		ProductA productA = creator.createProductA();
		ProductB productB = creator.createProductB(); 
		productA.methodA(); 
		productB.methodB();
		
		//切换具体的工厂实现类 creator = new ConcreteCreator2(); 
		//productA = creator.createProductA(); 
		//productB = creator.createProductB(); 
		//productA.methodA(); 
		//productB.methodB();
		
	}
}
