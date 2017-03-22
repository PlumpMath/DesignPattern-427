package factory.factorymethod;

import factory.factorymethod.factory.AFactory;
import factory.factorymethod.factory.BFactory;
import factory.factorymethod.factory.ProductFactory;

/*
 * 工厂方法的测试
 * 特点：1、为什么叫工厂方法（就是返回工厂所做产品，相互之间没有干扰），打个比方相当于
 * 我有一批货(product)，生产A产品，生产B产品，同样的生产C产品，等等
 * 主要返回的是一个工厂，返回A工厂（返回A工厂所做A产品），B工厂（返回B工厂做B产品）
 */
public class FactoryMethodTest {
	public static void main(String[] args) {
		//实例化A工厂
		ProductFactory pfa=new AFactory();
		pfa.productFactory().careProduct();
		
		//实例化B工厂
		ProductFactory pfb=new BFactory();
		pfb.productFactory().careProduct();
		
	}
}
