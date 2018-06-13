package com.zd.warehouse.business.service;

import java.util.List;

import com.zd.warehouse.business.model.RepositoryDetails;
import com.zd.warehouse.core.model.Result;

/**
 * @author Kstar:
 * @version 2018年6月12日 上午10:23:05
 * 
 */
public interface RepositoryService {

	Result<List<RepositoryDetails>> queryAll();

	Result<RepositoryDetails> insertRepository(RepositoryDetails repositoryDetails);

	Result<String> deleteRepository(List<String> list);

	Result<RepositoryDetails> updateRepository(
			RepositoryDetails repositoryDetails);
}
