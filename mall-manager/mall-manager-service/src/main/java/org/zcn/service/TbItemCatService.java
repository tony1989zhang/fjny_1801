package org.zcn.service;

import java.util.List;

import org.zcn.utils.EasyUITreeNodeBean;

public interface TbItemCatService {
	List<EasyUITreeNodeBean> getTbItemCatList(Long parendId);
}
