package co.com.ias.domain.model.employee;

import org.springframework.util.Assert;

public class Salary {
    //Se creó clase co.com.ias.domain.model.employee.Salary con un método Assert.notNull para evaluar que no hayan campos vacíos
    private final double value;

    public Salary(double value) {
        Assert.notNull(value, "No se permiten valores nulos");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
