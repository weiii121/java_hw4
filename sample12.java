public class sample12 {
    public static void main(String[] args) {
		
		
		iVehicle38[] ivc;
        ivc = new iVehicle38[2];

        ivc[0] = new Car38(1234, 20.5);

        ivc[1] = new Plane38(232);

        for (int i = 0; i < ivc.length; i++) {
            ivc[i].show();
        }

	}

}

interface iVehicle38 {
    int weight = 1000;

    void show();
}

class Car38 implements iVehicle38 {
    private int num;
    private double gas;

    public Car38(int n, double g) {
        num = n;
        gas = g;

        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class Plane38 implements iVehicle38 {
    private int flight;

    public Plane38(int f) {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }

    public void show() {
        System.out.println("飛機的班次是" + flight);
    }
}
