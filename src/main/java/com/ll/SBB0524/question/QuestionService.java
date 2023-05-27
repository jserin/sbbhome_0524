package com.ll.SBB0524.question;

import com.ll.SBB0524.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionRepository quesitonRepository;

    public List<Question> getList() {
        return this.quesitonRepository.findAll();
    }

    public Question getQuestion(Integer id) {
        Optional<Question> question = this.quesitonRepository.findById(id);
        if(question.isPresent()) {
            return question.get();
        } else {
            throw new DataNotFoundException("question not found");
        }
    }
}
