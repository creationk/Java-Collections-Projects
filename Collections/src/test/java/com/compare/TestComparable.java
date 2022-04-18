package com.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

public class TestComparable {
    @Test
    void test() {
        TreeSet<Employee> el = new TreeSet<>();
        el.add(new Employee(123));
        el.add(new Employee(456));
        el.add(new Employee(7));

        for (Employee e:el) {
            System.out.println(e.toString());
        }
    }
}

@Getter
@Setter
@ToString
@AllArgsConstructor
class Employee implements Comparable<Employee> {
    int employeeId;

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.getEmployeeId(),o.getEmployeeId());
    }
}
