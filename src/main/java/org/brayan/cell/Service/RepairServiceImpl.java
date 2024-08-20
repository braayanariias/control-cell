package org.brayan.cell.Service;

import org.brayan.cell.Model.Repair;
import org.brayan.cell.Repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RepairServiceImpl implements RepairService{

    final RepairRepository repairRepository;

    public RepairServiceImpl(RepairRepository repairRepository) {
        this.repairRepository = repairRepository;
    }

    @Override
    public List<Repair> findAllRepairs() {
        return repairRepository.findAll();
    }

    @Override
    public Repair findRepairById(UUID id) {
        if (repairRepository.findById(id).isPresent()) {
            return repairRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public Repair saveRepair(Repair repair) {
        return repairRepository.save(repair);
    }

    @Override
    public Repair updateRepair(UUID id, Repair repair) {
        return null;
    }

    @Override
    public void deleteRepair(UUID id) {
        repairRepository.deleteById(id);
    }
}
