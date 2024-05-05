package com.hewayah.hello_world.repository;
import com.hewayah.hello_world.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {
}
