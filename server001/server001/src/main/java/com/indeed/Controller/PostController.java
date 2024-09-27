package com.indeed.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indeed.DTo.PostDTO;
import com.indeed.Model.PostModel;
import com.indeed.Services.PostService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {
	
	private final PostService postserivce;
	
	@PostMapping("/post")
	public PostModel savePost(@Valid @RequestBody PostDTO postdtorequest)
	{
		log.info("saving post ######");
		return this.postserivce.savePost(postdtorequest);
	}
	
	
      @GetMapping("/posts")
      public List<PostModel> getrecords()
      {
    	  log.info("get Records ###");
    	  return this.postserivce.getrecords();
      }
}
