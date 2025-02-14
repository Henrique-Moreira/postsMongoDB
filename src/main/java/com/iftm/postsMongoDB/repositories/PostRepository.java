package com.iftm.postsMongoDB.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iftm.postsMongoDB.models.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
