/*****************************************************************************
 * @Purpose: To Generate Entity Object That Can Be Stored In database
 * @Author: Kumar Shanbhag
 * @Date: 02/07/2020
 *****************************************************************************/
package com.greeting.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (nullable = false)
    private int id;

    @Column (nullable = false)
    private String firstName;

    @Column (nullable = false)
    private String lastName;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
