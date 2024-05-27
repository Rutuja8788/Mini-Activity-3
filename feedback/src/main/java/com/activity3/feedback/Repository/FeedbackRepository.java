package com.activity3.feedback.Repository;

import com.activity3.feedback.Entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>
{
    List<Feedback> findByUserId(Long userId);
}