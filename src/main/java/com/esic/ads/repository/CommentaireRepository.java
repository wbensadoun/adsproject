package com.esic.ads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esic.ads.model.Commentaires;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaires, Long>{

}
