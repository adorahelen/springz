package edu.example.training.service;


import edu.example.shopping.input.TrainingInput;
import edu.example.training.entity.Training;

import java.util.List;

public interface TrainingService {
    Training findById(String trainingId);
    // 서비스에서 레포지토리를 찾고, 호출한다. 따라서 find
    // 서비스 -> 레포 -> 엔티티
    List<Training> findList();

//    void modify(TrainingInput trainingInput);

}

