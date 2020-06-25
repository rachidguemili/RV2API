package com.BackApiTest.BackApiTest.chat.discussion;

import com.BackApiTest.BackApiTest.chat.discussion.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscussionRepository extends JpaRepository<Discussion,Long> {

	List<Discussion> findAllByPatientId(Long id);
}
