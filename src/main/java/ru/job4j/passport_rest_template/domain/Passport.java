package ru.job4j.passport_rest_template.domain;

import java.util.Date;
import java.util.Objects;

public class Passport {

    private int id;

    private String fio;

    private int serial;

    private int number;

    private Date birthDate;

    private Date expirationDate;

    public Passport() {
    }

    public Passport(int id, String fio, int serial, int number, Date birthDate, Date expirationDate) {
        this.id = id;
        this.fio = fio;
        this.serial = serial;
        this.number = number;
        this.birthDate = birthDate;
        this.expirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return id == passport.id &&
                serial == passport.serial &&
                number == passport.number &&
                Objects.equals(fio, passport.fio) &&
                Objects.equals(birthDate, passport.birthDate) &&
                Objects.equals(expirationDate, passport.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, serial, number, birthDate, expirationDate);
    }
}
