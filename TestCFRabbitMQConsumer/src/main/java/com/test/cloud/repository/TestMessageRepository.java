package com.test.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.cloud.model.MessageTest;

public interface TestMessageRepository extends JpaRepository<MessageTest, Long> {

}
