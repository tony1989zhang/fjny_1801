package org.zcn.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zcn.mapper.TbItemDescMapper;
import org.zcn.mapper.TbItemMapper;
import org.zcn.mapper.TbItemParamItemMapper;
import org.zcn.pojo.TbItem;
import org.zcn.pojo.TbItemDesc;
import org.zcn.pojo.TbItemExample;
import org.zcn.pojo.TbItemParamItem;
import org.zcn.service.TbItemService;
import org.zcn.utils.EasyUIDataGridResult;
import org.zcn.utils.ExceptionUtil;
import org.zcn.utils.FjnyResult;
import org.zcn.utils.IDUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class TbItemServiceImpl implements TbItemService {

	@Resource
	private TbItemMapper tbItemMapper;
	@Resource
	private TbItemDescMapper tbItemDescMapper;
	@Resource
	private TbItemParamItemMapper tbItemParamItemMapper;
	
	@Override
	public EasyUIDataGridResult getTbItemList(Integer page,Integer rows) {
		//分页插件
		PageHelper.startPage(page, rows);
		TbItemExample example = new TbItemExample();
		example.createCriteria().andStatusNotEqualTo((byte)3);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(total, list);
		return easyUIDataGridResult;
	}

	@Override
	public FjnyResult saveTbItem(TbItem tbItem,String desc, String itemParams) {
		try {
		Date date = new Date();
		long genItemId = IDUtils.genItemId();
		tbItem.setId(genItemId);
		tbItem.setCreated(date);
		tbItem.setUpdated(date);
		tbItem.setStatus((byte)1);
		tbItemMapper.insertSelective(tbItem);
		//商品描述添加
		TbItemDesc tbItemDesc = new TbItemDesc();
		tbItemDesc.setItemId(tbItem.getId());
		tbItemDesc.setItemDesc(desc);
		tbItemDesc.setCreated(date);
		tbItemDesc.setUpdated(date);
		tbItemDescMapper.insertSelective(tbItemDesc);
		
		//商品规格数据添加
		TbItemParamItem record = new TbItemParamItem();
		record.setItemId(genItemId);
		record.setParamData(itemParams);
		record.setCreated(date);
		record.setUpdated(date);
		tbItemParamItemMapper.insert(record);
		
		} catch (Exception e) {
			return FjnyResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return FjnyResult.ok();
	}

	@Override
	public FjnyResult updateTbItem(TbItem tbItem, String desc) {
		//更新商品信息
		tbItem.setUpdated(new Date());//更新时间
		tbItemMapper.updateByPrimaryKeySelective(tbItem);
		//更新商品描述信息
		TbItemDesc record = new TbItemDesc();
		record.setItemId(tbItem.getId());
		record.setItemDesc(desc);
		record.setUpdated(new Date());
		tbItemDescMapper.updateByPrimaryKeySelective(record);
		return FjnyResult.ok();
	}

	@Override
	public FjnyResult deleteTbItem(List<Long> ids) {
		try {
			TbItem record = new TbItem();
			record.setStatus((byte)3);
			TbItemExample example = new TbItemExample();
			example.createCriteria().andIdIn(ids);
			tbItemMapper.updateByExampleSelective(record, example);
		} catch (Exception e) {
			return FjnyResult.build(500, "删除失败");
		}
		return FjnyResult.ok();
	}

}
