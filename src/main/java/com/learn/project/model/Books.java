package com.learn.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Books {
	@Id
	private int id;
	private String name;
	private String author;
	
	

}
