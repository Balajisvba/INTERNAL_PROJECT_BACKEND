package com.tvm.internal.tvm_internal_project.repo.onboarding;

import com.tvm.internal.tvm_internal_project.model.onboarding.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer> {
}
