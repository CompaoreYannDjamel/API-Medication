package com.medication.controller;

import com.medication.entity.Drug;
import com.medication.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Compaore Yann Djamel

@RestController
@RequestMapping("/drug")
public class DrugController {

    @Autowired
    private DrugService drugService;

    // récupérera tous les médicaments de la table
    @GetMapping
    public List<Drug> getAllDrugs() {
        return drugService.getAllDrugs();
    }

    // obtiendra le médicament en fonction de son identifiant
    @GetMapping("{drugNumber}")
    public ResponseEntity<Drug> getById(@PathVariable("drugNumber") int drugNumber) {
        drugService.getById(drugNumber);
        return ResponseEntity.ok(drugService.getById(drugNumber));
    }

    // ajoute le médicament à la base de données
    @PostMapping
    public Drug addDrug(@RequestBody Drug drug) {
        return drugService.addDrug(drug);
    }

    // mettre à jour le médicament
    @PutMapping
    public Drug updateDrug(@RequestBody Drug drug) {
        return drugService.updateDrug(drug);
    }

    // supprime le médicament par drugNumber
    @DeleteMapping("{drugNumber}")
    public ResponseEntity<String> deleteDrug(@PathVariable("drugNumber") int drugNumber) {
        drugService.deleteById(drugNumber);
        return ResponseEntity.ok("Successfully Delete!");
    }
}
