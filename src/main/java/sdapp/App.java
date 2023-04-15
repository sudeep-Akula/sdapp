package sdapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont = new ClassPathXmlApplicationContext("beans.xml");
		Car car = cont.getBean(Car.class);
		car.drivecar();
		
	}

}
