package org.zcn.service;

import java.util.List;

import org.zcn.pojo.TbItem;
import org.zcn.utils.EasyUIDataGridResult;
import org.zcn.utils.FjnyResult;

public interface TbItemService {
	//获取商品列表 测试
	public EasyUIDataGridResult getTbItemList(Integer page,Integer rows);
	//添加商品
	public FjnyResult saveTbItem(TbItem tbItem, String desc, String itemParams);
	//更新商品
	public FjnyResult updateTbItem(TbItem tbItem,String desc);
	//删除商品
	public FjnyResult deleteTbItem(List<Long> ids);
	
}
