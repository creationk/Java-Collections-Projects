package com.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class TestComparator {
    @Test
    void testRunsInError() {
        TreeSet<Student> ts = new TreeSet<>(new Student());
        ts.add(new Student(789));
        ts.add(new Student(6));


        for (Student s : ts) {
            System.out.println(s.toString());
        }
    }
}

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student implements Comparator<Student> {
    int marks;

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getMarks(), o2.getMarks());
    }
}
