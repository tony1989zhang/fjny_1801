package org.zcn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zcn.mapper.TbItemCatMapper;
import org.zcn.pojo.TbItem;
import org.zcn.pojo.TbItemCat;
import org.zcn.pojo.TbItemCatExample;
import org.zcn.pojo.TbItemCatExample.Criteria;
import org.zcn.service.TbItemCatService;
import org.zcn.service.TbItemService;
import org.zcn.utils.EasyUIDataGridResult;
import org.zcn.utils.EasyUITreeNodeBean;
import org.zcn.utils.FjnyResult;

@Service
public class TbItemCatServiceImpl implements TbItemCatService {
	
	
	@Autowired
	private TbItemCatMapper tbItemCatMapper;

	@Override
	public List<EasyUITreeNodeBean> getTbItemCatList(Long parendId) {
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parendId);
		List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
		List<EasyUITreeNodeBean>  easyUiTreeNodeBeans = new ArrayList<>();
		for (TbItemCat tbItemCat : list) {
			EasyUITreeNodeBean e = new EasyUITreeNodeBean();
			e.setId(tbItemCat.getId());
			e.setText(tbItemCat.getName()); 
			/*Boolean isParent = tbItemCat.getIsParent();
			if(isParent){
				e.setState("closed");
			}else{
				e.setState("open");
			}*/
			e.setState(tbItemCat.getIsParent()?"closed":"open");
			easyUiTreeNodeBeans.add(e);
		}
		return easyUiTreeNodeBeans;
	}

}
