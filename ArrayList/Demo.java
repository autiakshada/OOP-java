import java.util.ArrayList;
class Demo 
{
	public static void main(String[] args) 
	{
		ArrayList ref=new ArrayList();
		ref.add("Idli");
		ref.add("medu vada");
		ref.add("dal vada");
		ref.add("dosa");
		ref.add("uttapa");
		ref.add("raggi ball");
		ref.add("sambar");
		
		System.out.println("south : "+ref);
		ArrayList m=new ArrayList();
		m.add("Purapoli");
		m.add("Massvadi");
		m.add("modak");
		m.add("MisalPav");
		m.add("Dal batti");
		m.add("kheer");
		System.out.println("Maharashtrian :"+m);
		ref.add("Biryani");
		//ref.addAll(m);
		ref.add(0,"Biryani");
		System.out.println("south : "+ref);
		System.out.println("search :"+m.containsAll(ref));
		System.out.println("search :"+ref.contains("misalpav"));
		//m.remove("Biryani");
		//m.clear();
		m.remove(1);
		System.out.println("Maharashtrian :"+m);
	}
}
