package com.zd.warehouse.business.service.Imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zd.warehouse.business.mapper.RepositoryDetailsMapper;
import com.zd.warehouse.business.model.RepositoryDetails;
import com.zd.warehouse.business.service.RepositoryService;
import com.zd.warehouse.core.model.Result;

/**
 * @author Kstar:
 * @version 2018年6月12日 上午10:23:43
 * 
 */
@Service
public class RepositoryServiceImp implements RepositoryService {
	
	@Resource
	private RepositoryDetailsMapper repositoryDetailMapper;
	
	@Override
	public Result<List<RepositoryDetails>> queryAll() {
		Result<List<RepositoryDetails>> result = new Result<List<RepositoryDetails>>();
		List<RepositoryDetails> queryAll = repositoryDetailMapper.queryAll();
		result.success("查询成功", queryAll);
		return result;
	}
	
	@Override
	public Result<RepositoryDetails> insertRepository(RepositoryDetails repositoryDetails) {
		Result<RepositoryDetails> result = new Result<RepositoryDetails>();
		if(repositoryDetailMapper.insert(repositoryDetails)>0){
			result.success("插入仓库库存信息成功",repositoryDetails);
		}else{
			result.failure("插入仓库库存信息失败", null);
		}
		return result;
	}
	
	@Override
	public Result<String> deleteRepository(List<String> list) {
		Result<String> result = new Result<String>();
		if(repositoryDetailMapper.deleteRepository(list)>0){
			result.success("删除仓库库存信息成功");
		}else{
			result.failure("删除仓库库存信息失败");
		}
		return result;
	}
	@Override
	public Result<RepositoryDetails> updateRepository(
			RepositoryDetails repositoryDetails) {
		Result<RepositoryDetails> result = new Result<RepositoryDetails>();
		if(repositoryDetailMapper.updateByPrimaryKey(repositoryDetails)>0){
			result.success("更新仓库库存信息成功", repositoryDetails);
		}else{
			result.failure("更新仓库库存信息失败", null);
		}
		return result;
	}
}
