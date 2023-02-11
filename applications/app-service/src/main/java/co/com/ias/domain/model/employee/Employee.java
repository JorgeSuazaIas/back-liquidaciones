package co.com.ias.domain.model.employee;

public class Employee {
    //Atributos del empleado

    private final Name name;
    private final Id id;
    private final Position position;
    private final Salary salary;
    private final StartDate startDate;

    //Se generó un constructor que recibe cada atributo


    private Employee(Name name, Id id, Position position, Salary salary, StartDate startDate) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.startDate = startDate;
    }

    //Se creó este método para crear una instancia de la clase ya que puse el constructor privado
    public static Employee createInstance(Name name, Id id, Position position, Salary salary, StartDate startDate){
        return new Employee(name, id, position, salary, startDate);
    }
}
