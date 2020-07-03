package com.greeting.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class UserDTO {
    @NotNull
    @Pattern(regexp = "^[A-Za-z]{3,}$", message = "Should Have Minimum 3 Characters")
    private String firstName;

    @NotNull
    @Pattern(regexp = "^[A-Za-z]{3,}$", message = "Should Have Minimum 3 Characters")
    private String lastName;

    public UserDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
