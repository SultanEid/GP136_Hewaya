package com.hewayah.hello_world.repository;


import com.hewayah.hello_world.model.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    /*
    List<BookingEntity> findByServiceProviderUsername(String serviceProviderUsername);

    List<BookingEntity> findByHobbyistUsername(String hobbyistUsername);

    List<BookingEntity> findByBookingStatus(BookingEntity.BookingStatus bookingStatus);

    Optional<BookingEntity> findByEventId(Integer eventId);

    List<BookingEntity> findByBookingDate(LocalDate bookingDate);

    List<BookingEntity> findByServiceProviderUsernameAndBookingStatus(String serviceProviderUsername, BookingEntity.BookingStatus bookingStatus);

    List<BookingEntity> findByHobbyistUsernameAndBookingStatus(String hobbyistUsername, BookingEntity.BookingStatus bookingStatus);



     */

}