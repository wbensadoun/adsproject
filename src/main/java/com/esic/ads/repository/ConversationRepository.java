package com.esic.ads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esic.ads.model.Conversations;

@Repository
public interface ConversationRepository extends JpaRepository<Conversations, Long>{

}
