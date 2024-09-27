package com.indeed.Reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indeed.Model.PostModel;

@Repository
public interface PostRepo  extends JpaRepository<PostModel, Integer>{

}
