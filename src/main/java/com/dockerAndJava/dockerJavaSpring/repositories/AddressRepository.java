package com.dockerAndJava.dockerJavaSpring.repositories;

import com.dockerAndJava.dockerJavaSpring.domain.Address;
import com.dockerAndJava.dockerJavaSpring.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface AddressRepository extends JpaRepository<Address, UUID> {
}
