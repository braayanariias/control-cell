package org.brayan.cell.Repository;

import org.brayan.cell.Model.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepairRepository extends JpaRepository<Repair, UUID> {
}
