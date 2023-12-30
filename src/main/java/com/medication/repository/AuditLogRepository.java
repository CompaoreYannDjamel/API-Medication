package com.medication.repository;

import com.medication.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Compaore Yann Djamel

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Integer> {
}
