package com.ll.SBB0524.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuesitonRepository quesitonRepository;

    public List<Question> getList() {
        return this.quesitonRepository.findAll();
    }
}
