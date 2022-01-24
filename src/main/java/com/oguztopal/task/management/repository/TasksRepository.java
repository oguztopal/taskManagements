package com.oguztopal.task.management.repository;

import com.oguztopal.task.management.entity.Tasks;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

public interface TasksRepository extends MongoRepository<Tasks, BigInteger> {


}
