package leo.parttern;

import proxy.BuyCarProxy;
import proxy.Customer;

/**
 * 测试静态代理 
 * @author ligy
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		  Customer customer=new Customer();
		  customer.setCash(12000);
		  BuyCarProxy buyCarProxy=new BuyCarProxy(customer);
		  buyCarProxy.buyCar();
	}

}
