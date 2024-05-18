package com.example.JustCast.application.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.JustCast.application.classBDD.directeurCasting;

public interface directeurCastingRepository extends CrudRepository <directeurCasting,Long>{

	Iterable<directeurCasting> findByMail(String mail);

}
