package co.com.ias.domain.model.employee;
import org.springframework.util.Assert;

import java.util.regex.Pattern;

public class Name {

    private final String value;

    public Name(String value) {
        //Método Assert.notNull para evaluar que no hayan campos vacíos
        //Método Assert.isTrue para evaluar que no contenga mas de 50 caracteres
        //Método Assert.isTrue(Pattern.matches para evaluar que no contenga caracteres especiales

        Assert.notNull(value, "No se permiten valores nulos");
        Assert.isTrue(value.length() <= 50, "El nombre debe superar los 50 caracteres");
        Assert.isTrue(Pattern.matches("^[A-z\\s]+(?<!\\s)$", value), "El nombre debe contener unicamente letras");

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
