package com.example.portfolioapi.repository;

import com.example.portfolioapi.model.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillRepository extends MongoRepository<Skill, String> {
}
