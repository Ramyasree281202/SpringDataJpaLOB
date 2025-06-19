package com.java.SpringDataJpaLOB.service;

import java.util.Optional;

import com.java.SpringDataJpaLOB.dao.Jobseeker;

public interface IJobService {
	public String registerjobSeeker(Jobseeker one);
	
	
	 public Optional<Jobseeker> getAllDetails(Integer id);
}
