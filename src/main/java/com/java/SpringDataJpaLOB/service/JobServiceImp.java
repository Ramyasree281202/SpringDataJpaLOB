package com.java.SpringDataJpaLOB.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.SpringDataJpaLOB.dao.IJobRepo;
import com.java.SpringDataJpaLOB.dao.Jobseeker;

@Service
public class JobServiceImp implements IJobService {
	@Autowired
	private IJobRepo repo;
	@Override
	public String registerjobSeeker(Jobseeker one) {
		Integer id = repo.save(one).getId();
		return "New one with id : "+id;
	}
	@Override
	public Optional<Jobseeker> getAllDetails(Integer id) {
		Optional<Jobseeker> op = repo.findById(id);
		if(op.isPresent())
		return op;
		return op.empty();
	}

}
