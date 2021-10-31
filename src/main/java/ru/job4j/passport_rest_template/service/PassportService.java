package ru.job4j.passport_rest_template.service;

import org.springframework.stereotype.Service;
import ru.job4j.passport_rest_template.domain.Passport;
import ru.job4j.passport_rest_template.repository.PassportAPIStore;

import java.util.List;

@Service
public class PassportService {

    private final PassportAPIStore passportAPIStore;

    public PassportService(PassportAPIStore passportAPIStore) {
        this.passportAPIStore = passportAPIStore;
    }

    public List<Passport> findAll() {
        return passportAPIStore.findAll();
    }

    public List<Passport> findBySerial(int serial) {
        return passportAPIStore.findBySerial(serial);
    }

    public List<Passport> findUnavailable() {
        return passportAPIStore.findUnavailable();
    }

    public List<Passport> findReplaceAble() {
        return passportAPIStore.findReplaceAble();
    }

    public Passport save(Passport passport) {
        return passportAPIStore.save(passport);
    }

    public Passport update(int id, Passport passport) {
        return passportAPIStore.update(id, passport);
    }

    public boolean delete(int id) {
        return passportAPIStore.delete(id);
    }
}
