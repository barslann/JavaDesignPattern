package creationalpatterns.factory.approach2;


public interface DirectorFactory{

	public Director create(String name, String workingDepartment, int bonus);

}
