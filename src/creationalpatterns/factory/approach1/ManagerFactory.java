package creationalpatterns.factory.approach1;


import creationalpatterns.factory.EmployeeRandomizer;

public class ManagerFactory implements Factory {

	@Override
	public Manager create() {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
