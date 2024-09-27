package com.indeed.Model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="indeed-clone")
@Entity
public class PostModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
   @NotNull
   private String profile;
	
	@NotNull
	private String type;
	
	@NotNull
	private String description;
	
	@NotNull
	private  String experince;
	
	@NotNull
	private String  technology[];
	
	@NotNull
	private String salary;
	
	@CreatedDate
	private Date CreateAt;
}
