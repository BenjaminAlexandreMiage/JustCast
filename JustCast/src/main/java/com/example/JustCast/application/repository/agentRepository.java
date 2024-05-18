package com.example.JustCast.application.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.JustCast.application.classBDD.Agent;
import com.example.JustCast.application.classBDD.directeurCasting;

public interface agentRepository extends CrudRepository <Agent,Long>{

	Iterable<Agent> findByMail(String mail);

}
