package sdapp;

public class Car {

	private Iengine eng;
//	public Car() {
//		System.out.println("car constructor no arguments");
//	}
	public Car(Iengine eng) {
		System.out.println("car constructor");
		this.eng = eng;
	}
//	public void setEng(Iengine eng) {
//		System.out.println("setting engine");
//		this.eng = eng;
//	}
	public void drivecar() {
		int sd = eng.startengine();
		if(sd==1) {
		System.out.println("driving car with petrol engine ");
		}else if(sd==2){
			System.out.println("driving car with diesel engine");
		}else {
			System.out.println("engine not started");
		}
	}
	
	}

