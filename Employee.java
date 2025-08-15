package employee;
//create employee class
public class Employee {
//define variables
String name;
int id;
double salary;
	
//constructor(parameters)
public Employee(String n, int i,double sal){
	//assign  value to variable
	name=n;
	id=i;
    salary=sal;
}
	//display employee details
void display() {
	System.out.println("employee details are");
	System.out.println("employee id"+id);
	System.out.println("employee name"+name);
	System.out.println("employee salary"+salary);
}
	//increase salary
void inc_salary(double percentage) {
	double increment=(salary*percentage)/100;
	salary=salary+increment;
	System.out.println("employee salary increased by"+salary);
}
	
