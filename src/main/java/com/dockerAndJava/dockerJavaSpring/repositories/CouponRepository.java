package com.dockerAndJava.dockerJavaSpring.repositories;

import com.dockerAndJava.dockerJavaSpring.domain.Address;
import com.dockerAndJava.dockerJavaSpring.domain.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
