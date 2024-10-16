package org.example.exercise.Map;


import java.time.LocalDate;
import java.util.*;

public class Run {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student marco = new Student();
        marco.setNome("marco");
        marco.setCognome("Rossi");
        marco.setCodiceFiscale("ASDFGH");
        marco.setDataDiNascita(new Date(2000, 3, 2));
        students.add(marco);

        Student luigi = new Student();
        luigi.setNome("Luigi");
        luigi.setCognome("Staxx");
        luigi.setCodiceFiscale("123345");
        students.add(luigi);

        Student willy = new Student();
        willy.setNome("Willy");
        willy.setCognome("Rex");
        willy.setCodiceFiscale("abcdef");
        students.add(willy);

        Optional<Student> optionalStudent = students.stream()
                .filter(s -> s.getNome().equals("Ludfsgsd"))
                .findFirst();

        optionalStudent.ifPresent(s -> System.out.println(s));

        try{
            Student foundStudent = optionalStudent.orElseThrow(() -> new RuntimeException("Student not found"));
            System.out.println("Studente trovato -> " + foundStudent.getNome());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
