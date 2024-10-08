package edu.example.training.service;



import edu.example.shopping.input.TrainingInput;
import edu.example.training.entity.Training;
import edu.example.training.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService{

// @Service 를 통해 빈을 생성하고 @Autowired를 통해 의존성을 주입했다.

    @Autowired // 여기다 필드를 썼으니 인젝션 해줘
    private TrainingRepository trainingRepository;


    TrainingServiceImpl (TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
        System.out.println("TrainingServiceImpl constructor");
    }


    @Override
    public List<Training> findList() {
        return trainingRepository.selectList();
    }

    @Override
   // @PreAuthorize("hasRole('ADMIN')")
    public Training findById(String trainingId) {
        return trainingRepository.selectById(trainingId);
    }

//    @Override
//    public void modify(TrainingInput trainingInput) {
//        return trainingRepository.modify();
//    }
}


