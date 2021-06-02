package day43_list_custom_classes;
//company class was created from employee class (objects)
public class Company {
    public static void main(String[] args) {
        // add 3 objects of Employee class
        Employee emp1 = new Employee();
        emp1.name = "Sabina Cunningham";
        emp1.jobTitle = "SDET";
        emp1.work();
        System.out.println(emp1.name);
        System.out.println(emp1.jobTitle);

        Employee emp2 = new Employee();
        emp2.name = "Venera English";
        emp2.jobTitle = "Full stack developer";
        emp2.work();

         //* assign name and job titles
         //* call work method

    }

}
