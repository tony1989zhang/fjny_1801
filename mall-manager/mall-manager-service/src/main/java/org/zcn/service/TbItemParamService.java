package org.zcn.service;

import org.zcn.utils.EasyUIDataGridResult;
import org.zcn.utils.FjnyResult;

public interface TbItemParamService {
	EasyUIDataGridResult getItemParamList(Integer page, Integer rows);
	FjnyResult checkParam(Long itemCatId);
	FjnyResult addItemParam(Long itemCatId, String paramData);
}
