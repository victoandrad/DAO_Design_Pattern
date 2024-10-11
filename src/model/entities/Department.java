package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    // VARIABLES

    private Integer id;
    private String name;

    // CONSTRUCTORS

    public Department() {}

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // METHODS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }

    // GETTERS

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // SETTERS

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
