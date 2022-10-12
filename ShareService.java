package com.gl.CaseStudy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gl.CaseStudy.bean.CompanyShare;
import com.gl.CaseStudy.repository.ShareRepository;

@Service
public class ShareService {
	@Autowired
	private ShareRepository repository;
	
	public void save(CompanyShare share) {
		repository.save(share);
	}
	
	public List<CompanyShare> findAll(){
		return repository.findAll();
	}
	
	public Long generateCourseId() {
		Long val = repository.findMaxCompanyId();
		if(val == null)
			val = 1000001L;
		else
			val = val + 1;
		return val;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public CompanyShare findById(Long id) {
		return repository.getById(id);
	}
}
