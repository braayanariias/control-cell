package org.brayan.cell.Service;

import org.brayan.cell.Model.Repair;

import java.util.List;
import java.util.UUID;

public interface RepairService {

    List<Repair> findAllRepairs();
    Repair findRepairById(UUID id);
    Repair saveRepair(Repair repair);
    Repair updateRepair(UUID id, Repair repair);
    void deleteRepair(UUID id);

}
