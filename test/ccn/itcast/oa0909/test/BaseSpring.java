package ccn.itcast.oa0909.test;


import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseSpring {
	public static ApplicationContext context;

	@Before
	public void startSpring() {
		context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
	}
}
