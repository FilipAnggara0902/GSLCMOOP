
public class Pelukis extends BaseCharachter implements IArtist{

	public Pelukis(String name,String description) {
		// TODO Auto-generated constructor stub
		super(name,description);
	}

	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(name+" melukis ");
	}

}
