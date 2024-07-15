package com.study.potshop.service;

import com.study.potshop.dto.TestDto;
import com.study.potshop.entity.TestEntity;
import com.study.potshop.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestService {

   // @Autowired
    private final TestRepository testRepository;

    public void insertName(TestDto testDto) {
        TestEntity testEntity = new TestEntity();
        testEntity.setName(testDto.getName());
        testRepository.save(testEntity);
    }

}
