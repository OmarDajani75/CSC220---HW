package edu.sfsu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // TODO code application logic here
        SalariedEmployee salariedEmployee
                = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee
                = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40.0);
           ComissionEmployee comissionEmployee
               = new ComissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);


        System.out.println("Employees processed individually:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                comissionEmployee, "earned", comissionEmployee.earnings());
        Employee employees[] = new Employee[3];
        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;

        System.out.println("Employees processed polymorphically:\n");

        // generically process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println(); // invokes toString
            System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
        } // end for
        // get type name of each object in employees array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s\n", j,
                    employees[j].getClass().getName());
        }
    }
}
