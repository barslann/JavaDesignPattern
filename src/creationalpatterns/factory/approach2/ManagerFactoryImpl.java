package creationalpatterns.factory.approach2;


import creationalpatterns.factory.EmployeeRandomizer;

public class ManagerFactoryImpl implements ManagerFactory{

	@Override
	public Manager create(String name, String workingDepartment) {
		Manager manager = new Manager(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), workingDepartment, workingDepartment);
		return manager;
	}

}
