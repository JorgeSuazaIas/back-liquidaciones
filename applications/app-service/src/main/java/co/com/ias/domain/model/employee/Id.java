package co.com.ias.domain.model.employee;

import org.springframework.util.Assert;

public class Id {

    private final String value;


    public Id(String value) {
        //Método Assert.notNull para evaluar que no hayan campos vacíos
        //Método Assert.isTrue para evaluar que contenga minimo 7 digitos y no mas de 15 digitos
        //Método Assert.isTrue(Pattern.matches para evaluar que no contenga caracteres especiales

        Assert.notNull(value, "No se permiten valores nulos");
        Assert.isTrue(value.length() <= 15, "El numero de documento no debe superar los 15 digitos");
        Assert.isTrue(value.length() >= 7, "El numero de documento debe tener minimo 7 digitos");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
