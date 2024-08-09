package demo;

public class AbDemo {

	public static void main(String[] args) {
		MaheshPhone obj=new SureshPhone();
		obj.calling();
		obj.AiIntegration();
		obj.SatellitecConn();
		obj.HealthMonitoring();
		

	}
}
abstract class MaheshPhone
{
	public void calling()
	{
		System.out.println("calling");
	}
	public abstract void AiIntegration();
	public abstract void SatellitecConn();
	public abstract void HealthMonitoring();
	
}
abstract class RameshPhone extends MaheshPhone
{
	public void AiIntegration()
	{
		System.out.println("Phone is integrated with AI");
	}
}
class SureshPhone extends RameshPhone
{
	public void SatellitecConn()
	{
		System.out.println("Phone is integrated with SatellitecConn");
	}
	public void HealthMonitoring()
	{
		System.out.println("Phone is integrated with HealthMonitoring ");
	}
}