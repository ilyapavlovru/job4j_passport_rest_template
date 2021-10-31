package ru.job4j.passport_rest_template.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.job4j.passport_rest_template.domain.Passport;
import ru.job4j.passport_rest_template.service.PassportService;

import java.util.List;

@RestController
@RequestMapping("/rest-template")
public class ReportsController {

    private final PassportService passportService;

    public ReportsController(PassportService passportService) {
        this.passportService = passportService;
    }

    @GetMapping("/findAll")
    public List<Passport> findAll() {
        return passportService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Passport> save(@RequestBody Passport passport) {
        return new ResponseEntity<>(
                passportService.save(passport),
                HttpStatus.CREATED
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Passport> update(@RequestParam int id, @RequestBody Passport passport) {
        return new ResponseEntity<>(
                passportService.update(id, passport),
                HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@RequestParam int id) {
        return new ResponseEntity<>(
                passportService.delete(id),
                HttpStatus.NO_CONTENT);
    }

    @GetMapping("/find")
    public ResponseEntity<List<Passport>> findPassportsBySerial(@RequestParam int serial) {
        return new ResponseEntity<>(
                passportService.findBySerial(serial),
                HttpStatus.OK);
    }

    @GetMapping("/unavailable")
    public ResponseEntity<List<Passport>> findUnavailablePassports() {
        return new ResponseEntity<>(
                passportService.findUnavailable(),
                HttpStatus.OK);
    }

    @GetMapping("/find-replaceable")
    public ResponseEntity<List<Passport>> findReplaceAblePassports() {
        return new ResponseEntity<>(
                passportService.findReplaceAble(),
                HttpStatus.OK);
    }
}
