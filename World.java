
public class World {
	World()
	{
		System.out.println("1");
	}

	static void add()
	{
		System.out.println("2");
	}
	void substract()
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		add();
		World m1 =new World();
		m1.substract();
	}
}
