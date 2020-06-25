package com.BackApiTest.BackApiTest.chat.discussion;

import com.BackApiTest.BackApiTest.chat.discussion.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussionRepository extends JpaRepository<Discussion,Long> {

}
