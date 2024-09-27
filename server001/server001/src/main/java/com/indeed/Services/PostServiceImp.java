package com.indeed.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indeed.DTo.PostDTO;
import com.indeed.Model.PostModel;
import com.indeed.Reposiotry.PostRepo;

@Service
public class PostServiceImp implements PostService {

	@Autowired
	private PostRepo postrepo;
	
	@Override
	public PostModel savePost(PostDTO postdto) {
		PostModel postmodel = new PostModel();
		
	      postmodel.setProfile(postdto.getProfile());
	      postmodel.setType(postdto.getType());
	      postmodel.setDescription(postdto.getDescription());
	      postmodel.setExperince(postdto.getExperince());
	      postmodel.setSalary(postdto.getSalary());
	      postmodel.setTechnology(postdto.getTechnology());
	      
	      return   postrepo.save(postmodel);
	      

	      
		
		
	}

	@Override
	public List<PostModel> getrecords() {
		return postrepo.findAll();
		
	}

}
