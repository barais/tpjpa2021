package com.springproject.springproject.service;

import com.springproject.springproject.domain.Doctor;
import com.springproject.springproject.domain.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface TimeSlotDAO extends JpaRepository<TimeSlot, Long> {

    @Query("select t from TimeSlot as t where t.date = ?1 and t.doctor = ?2")
    Optional<TimeSlot> getTimeSlotByDate(Date date, Doctor doctor);

}