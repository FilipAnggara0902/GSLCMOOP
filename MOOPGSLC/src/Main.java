import java.util.Scanner;

public class Main {
	
	Chef chef;
	Supir supir;
	Worker worker;
	Artis artis;
	Pelukis pelukis;
	Polisi polisi;
	Scanner scan = new Scanner(System.in);
	
	public void initCharachter() {
		chef = new Chef( "Chef", "Seseorang yang handal memasak.");
		supir = new Supir( "Supir", "Seseorang yang jago mengemudi");
		worker = new Worker( "Worker", "Seseorang yang bisa bekerja");
		artis = new Artis( "Artis", "Seseorang yang memiliki jiwa seni");
		pelukis = new Pelukis( "Pelukis", "Seseorang yang bisa melukis dengan indah");
		polisi = new Polisi( "Polisi", "Seseorang yang menjaga keamanan negara");
	}
	

	public Main() {
		// TODO Auto-generated constructor stub
		initCharachter();
		
		String input;
		String temp[];
		String temp2[];
		
		System.out.println("Simulasi kelompok kemampuan");
		System.out.println("0:Chef");
		System.out.println("1:Supir");
		System.out.println("2:Worker");
		System.out.println("3:Artis");
		System.out.println("4:Pelukis");
		System.out.println("5:Polisi");
		System.out.println("Input : ");
		
		input = scan.nextLine();
		temp = input.split(" ");//dipisahkan berdasarkan spasi
		temp2 = temp[1].split(",");
		
		if(temp[0].equals("Info")) {
			for(int i=0;i<temp2.length;i++) {
				if(temp[i].equals("0")) {
					chef.getInfo();
				}else if(temp[i].equals("1")) {
					supir.getInfo();
				}else if(temp[i].equals("2")) {
					worker.getInfo();
				}else if(temp[i].equals("3")) {
					artis.getInfo();
				}else if(temp[i].equals("4")) {
					pelukis.getInfo();
				}else if(temp[i].equals("5")) {
					polisi.getInfo();
				}
			}
		}else if(temp[0].equals("Cook")){
			for(int i=0;i<temp2.length;i++) {
				if(temp2[i].equals("0"))
					chef.Cook();
				else if(temp2[i].equals("1"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("2"))
					worker.Cook();
				else if(temp2[i].equals("3"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("4"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("5"))
					System.out.println("Karakter tidak dapat melakukan aksi");
			}
		}
		else if(temp[0].equals("Drive")){
			for(int i=0;i<temp2.length;i++) {
				if(temp2[i].equals("0"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("1"))
					supir.Drive();
				else if(temp2[i].equals("2"))
					worker.Drive();
				else if(temp2[i].equals("3"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("4"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("5"))
					System.out.println("Karakter tidak dapat melakukan aksi");
			}
		}
		else if(temp[0].equals("Work")){
			for(int i=0;i<temp2.length;i++) {
				if(temp2[i].equals("0"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("1"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("2"))
					worker.Work();
				else if(temp2[i].equals("3"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("4"))
					System.out.println("Karakter tidak dapat melakukan aksi");
				else if(temp2[i].equals("5"))
					System.out.println("Karakter tidak dapat melakukan aksi");
			}
		}
	
		else if(temp[0].equals("Paint")){
		for(int i=0;i<temp2.length;i++) {
			if(temp2[i].equals("0"))
				System.out.println("Karakter tidak dapat melakukan aksi");
			else if(temp2[i].equals("1"))
				System.out.println("Karakter tidak dapat melakukan aksi");
			else if(temp2[i].equals("2"))
				worker.Paint();
			else if(temp2[i].equals("3"))
				artis.Paint();
			else if(temp2[i].equals("4"))
				pelukis.Paint();
			else if(temp2[i].equals("5"))
				System.out.println("Karakter tidak dapat melakukan aksi");
		}
	}
}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
