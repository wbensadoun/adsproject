package com.esic.ads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esic.ads.model.Annonce;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Long>{

}
