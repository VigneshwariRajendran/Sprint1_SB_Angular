package com.univ.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.univ.entity.Applicant;

@Repository
public interface ApplicantDAO extends CrudRepository<Applicant,Integer>{



}

