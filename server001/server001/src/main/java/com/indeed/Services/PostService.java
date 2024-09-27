package com.indeed.Services;

import java.util.List;

import com.indeed.DTo.PostDTO;
import com.indeed.Model.PostModel;

public interface PostService {
	
	public PostModel savePost(PostDTO postdto);

	public List<PostModel> getrecords();

}
