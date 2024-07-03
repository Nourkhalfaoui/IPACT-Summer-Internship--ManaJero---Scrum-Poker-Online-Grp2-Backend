package com.example.manajeroback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.manajeroback.entities.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ApiRepository extends MongoRepository<Test, Long> {

}
