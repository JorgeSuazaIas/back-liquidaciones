package co.com.ias.domain.model.employee;

import org.springframework.util.Assert;

import java.util.regex.Pattern;

public class Position {

    private final String value;

    public Position(String value) {
        //Método Assert.isTrue para evaluar que contenga minimo 10 caracteres y no mas de 30 caracteres
        //Método Assert.isTrue(Pattern.matches para evaluar que no contenga caracteres especiales

        Assert.isTrue(value.length() <= 30, "El cargo no debe contener mas de 30 caracteres ");
        Assert.isTrue(value.length() >= 10, "El cargo debe contener al menos 10 caracteres");
        Assert.isTrue(Pattern.matches("^[A-z\\s]+(?<!\\s)$", value), "El cargo no debe contener caracteres especiales");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
