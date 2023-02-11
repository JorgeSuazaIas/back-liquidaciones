package co.com.ias.domain.model.employee;

import org.springframework.util.Assert;

import java.util.Date;

public class StartDate {
    //Se creó clase co.com.ias.domain.model.employee.StartDate con un método Assert.notNull para evaluar que no hayan campos vacíos
    private final Date value;

    public StartDate(Date value) {
        Assert.notNull(value, "No se permiten valores nulos");
        this.value = value;
    }

    public Date getValue() {
        return value;
    }
}
