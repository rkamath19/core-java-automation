package CoreJavaTraining.interfaceNAbstract.traffic;

public class IndianTraffic implements CentralTraffic, ContinentTraffic {

	public static void main(String[] args) {
		
		CentralTraffic a = new IndianTraffic();
		a.greenGo();
		a.redStop();
		a.slowYellow();
		
		IndianTraffic b = new IndianTraffic();
		b.zebroCrossing();
		
		ContinentTraffic c = new IndianTraffic();
		c.trafficPolice();		
	}

	@Override
	public void greenGo() {
		System.out.println("Green");
	}

	@Override
	public void redStop() {
		System.out.println("Red");		
	}

	@Override
	public void slowYellow() {
		System.out.println("Yellow");		
	}
	
	public void zebroCrossing() {
		System.out.println("Crossing");
	}

	@Override
	public void trafficPolice() {
		System.out.println("Police");		
	}

}
