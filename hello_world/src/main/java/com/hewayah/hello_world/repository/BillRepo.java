package com.hewayah.hello_world.repository;
import com.hewayah.hello_world.entity.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepo extends JpaRepository<BillEntity,Integer> {
}
