package org.zcn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zcn.mapper.TbItemDescMapper;
import org.zcn.pojo.TbItemDesc;
import org.zcn.service.TbItemDescService;
import org.zcn.utils.FjnyResult;

@Service
public class TbItemDescServiceImpl implements TbItemDescService {
	
	@Autowired
	private TbItemDescMapper tbItemDescMapper;

	@Override
	public FjnyResult getTbItemDesc(Long itemId) {
		TbItemDesc itemDesc = tbItemDescMapper.selectByPrimaryKey(itemId);
		return FjnyResult.ok(itemDesc);
	}

}
