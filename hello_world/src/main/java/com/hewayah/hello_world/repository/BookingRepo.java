package com.hewayah.hello_world.repository;


import com.hewayah.hello_world.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepo extends JpaRepository<BookingEntity, Integer> {

    List<BookingEntity> findByServiceProviderUsername(String serviceProviderUsername);

    List<BookingEntity> findByHobbyistUsername(String hobbyistUsername);

    List<BookingEntity> findByBookingStatus(BookingEntity.BookingStatus bookingStatus);

    Optional<BookingEntity> findByEventId(Integer eventId);

    List<BookingEntity> findByBookingDate(LocalDate bookingDate);

    List<BookingEntity> findByServiceProviderUsernameAndBookingStatus(String serviceProviderUsername, BookingEntity.BookingStatus bookingStatus);

    List<BookingEntity> findByHobbyistUsernameAndBookingStatus(String hobbyistUsername, BookingEntity.BookingStatus bookingStatus);



}