package com.gl.CaseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.CaseStudy.bean.CompanyShare;


@Repository
public interface ShareRepository extends JpaRepository<CompanyShare, Long> {
	@Query("select max(companyId) from CompanyShare")
	public Long findMaxCompanyId();
}
