//parent class
class DhirubhaiAmbani 
{
	String company="reliance Industry";

	public void thinkingStyle()//behaviour
		{
			System.out.println("Mukesh Ambani ");
		}
}
//child class
class MukeshAmbani extends DhirubhaiAmbani
{

}
//Driver class 
class India
{
	public static void main(String[] args) 
	{
		MukeshAmbani ref= new MukeshAmbani();
		System.out.println("Company Name " +ref.company);
		ref.thinkingStyle();
	}
}
