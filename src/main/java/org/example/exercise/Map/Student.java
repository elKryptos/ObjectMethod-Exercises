package org.example.exercise.Map;

import java.util.Date;
import java.util.Objects;

public class Student {
    private String nome;
    private String cognome;
    private int eta;
    private String codiceFiscale;
    private Date dataDiNascita;

    public Student() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return eta == student.eta && Objects.equals(nome, student.nome) && Objects.equals(cognome, student.cognome) && Objects.equals(codiceFiscale, student.codiceFiscale) && Objects.equals(dataDiNascita, student.dataDiNascita);
    }

    @Override
    public String toString() {
        return "Student: " + nome+ " | Cognome: " + cognome +
                " | CodiceFiscale: " + codiceFiscale
                + " | Data di nascita: " + dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

}
