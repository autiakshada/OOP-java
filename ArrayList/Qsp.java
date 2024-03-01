import java.util.ArrayList;
class Qsp
{
	public static void main(String[] args) 
	{
		ArrayList java=new ArrayList();
		java.add("sam");
		java.add("rachana");
		java.add("dhanu");
		java.add("suraj");
		java.add("rajat");
		System.out.println("Java"+java);
		ArrayList sql=new ArrayList();
		sql.add("shubham");
		sql.add("megha");
		sql.add("priyanka");
		sql.add("suraj");
		sql.add("Akshada");
		System.out.println("SQL"+sql);
		java.addAll(sql);
		System.out.println("Java"+java);
		sql.remove("Akshada");
		System.out.println("SQL"+sql);
		System.out.println(java.size());
		if(java.contains("Akshada"))
		{
			System.out.println("good girl");
		}
		else
		{
			System.out.println("Maccchi first attend java!!!!!!!!!");
		}
		java.removeAll(sql);
		System.out.println("Java Students: ");
		for(int i=0; i<java.size(); i++)
		{
			System.out.println(java.get(i));
		}
	}
}
