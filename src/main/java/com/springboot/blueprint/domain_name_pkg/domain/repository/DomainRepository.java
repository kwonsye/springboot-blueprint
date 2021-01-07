package com.springboot.blueprint.domain_name_pkg.domain.repository;

import com.springboot.blueprint.domain_name_pkg.domain.entity.DomainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<DomainEntity, Long> {
}
