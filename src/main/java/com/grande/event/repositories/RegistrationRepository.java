package com.grande.event.repositories;

import com.grande.event.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Long, Registration> {
}
