package singleton;

public class Singleton {
	
	/**如果是在本类中要保证只有本类的一个实例，一定要用私有构造器，不能new 来获得对象，只能通过 getInstance,来获得对象实例**/
	private Singleton() {}

	private volatile static  Singleton instance;

	private static Object obj = new Object();

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (obj) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	/**这段代码看起来很完美，很可惜，它是有问题。主要在于instance = new Singleton()这句，这并非是一个原子操作
	 * JVM 中这句话大概做了下面 3 件事情。
		1、给 instance 分配内存
		2、调用 Singleton 的构造函数来初始化成员变量
		3、将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
		
	  	但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，
	  	最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，
	  	被线程二抢占了，这时 instance 已经是非 null 了（但却没有初始化），
	 	所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
	 **/
	
	/**
	 * 上面的一句话理解成：线程1第3步已经完成完成，指向内存空间，但是还没有初始化，
	 * 当线程2来的时候 看到已经不为null,就返回当前实例，调用其没有实例完成的方法就报错了
	 * 
	 */
	
	/**
	 * volatile关键字的主要作用：禁止指令重排序优化，对于主要在于instance = new Singleton()，它是走了执行完了的操作
	 * volatile 变量的写操作都先行发生于后面对这个变量的读操作（这里的“后面”是时间上的先后顺序）
	 *在 volatile变量的赋值操作后面会有一个内存屏障（生成的汇编代码上），读操作不会被重排序到内存屏障之前。
	 * 比如上面的例子，取操作必须在执行完 1-2-3 之后或者 1-3-2 之后，不存在执行到 1-3 然后取到值的情况
	 */
	
	/**
	 * Volatile 变量具有 synchronized 的可见性特性，但是不具备原子特性
	 * 虽然增量操作（x++）看上去类似一个单独操作，
	 * 实际上它是一个由读取－修改－写入操作序列组成的组合操作，必须以原子方式执行，而 volatile 不能提供必须的原子特性
	 */
}
