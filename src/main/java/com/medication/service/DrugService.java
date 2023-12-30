package com.medication.service;

import com.medication.entity.AuditLog;
import com.medication.entity.Drug;
import com.medication.repository.AuditLogRepository;
import com.medication.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

//Adel Chebani

@Service
public class DrugService {

    // Les repositories pour interagir avec la base de données.

    @Autowired
    private DrugRepository drugRepository;

    @Autowired
    private AuditLogRepository auditLogRepository;

    // Récupère un médicament par son identifiant. Enregistre l'action d'audit.
    public Drug getById(int drugNumber) {
        Optional<Drug> drugOptional = drugRepository.findById(drugNumber);
        if (drugOptional.isPresent()) {
            auditLogRepository.save(getAuditLog("RETRIEVE"));
            return drugOptional.get();
        } else {
            throw new RuntimeException("No drug found with given id: " + drugNumber);
        }
    }

    // Enregistre une action d'audit.
    private AuditLog getAuditLog(String action) {
        AuditLog auditLog = new AuditLog();
        auditLog.setUserId(101);
        auditLog.setAction(action);
        auditLog.setTime(LocalDateTime.now());
        return auditLog;
    }

    public List<Drug> getAllDrugs() {
        auditLogRepository.save(getAuditLog("RETRIEVE_ALL"));
        return drugRepository.findAll();
    }

    public void deleteById(int drugNumber) {
        Optional<Drug> drugOptional = drugRepository.findById(drugNumber);
        if (drugOptional.isPresent()) {
            auditLogRepository.save(getAuditLog("DELETE"));
            drugRepository.deleteById(drugNumber);
        } else {
            throw new RuntimeException("No drug found with given id: " + drugNumber);
        }

    }

    public Drug updateDrug(Drug drug) {
        auditLogRepository.save(getAuditLog("UPDATE"));
        return drugRepository.save(drug);
    }

    public Drug addDrug(Drug drug) {
        auditLogRepository.save(getAuditLog("INSERT"));
        return drugRepository.save(drug);
    }
}
