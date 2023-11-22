package com.mysite.sbmission.answer;

import com.mysite.sbmission.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}