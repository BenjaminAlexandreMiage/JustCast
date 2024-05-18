package com.example.JustCast.application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JustCast.application.classBDD.directeurCasting;
import com.example.JustCast.application.repository.directeurCastingRepository;


@Service
public class directeurCastingServiceImpl implements directeurCastingService {

	@Autowired
	private directeurCastingRepository repoDirecteurCasting;
	
	@Override
	public void ajouterDirecteurCasting(String nom, String prenom, String mail, String mdp, String tel) {
		repoDirecteurCasting.save(new directeurCasting(nom,prenom,mail,mdp,tel));
		
	}
	
	@Override
	public boolean existant(String mail, String mdp) {
		Iterable<directeurCasting> verificationMail = repoDirecteurCasting.findByMail(mail);
		for (directeurCasting d : verificationMail) {
			if( d.getMdp().equals(mdp)) {
				return true;
			}
		}
		return false;
	}

	
	
}
