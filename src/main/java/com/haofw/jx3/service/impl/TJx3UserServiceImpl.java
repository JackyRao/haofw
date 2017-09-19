package com.haofw.jx3.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import com.haofw.jx3.entity.TJx3User;
import com.haofw.jx3.service.ITJx3UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.jeeweb.core.utils.MyBeanUtils;
import cn.jeeweb.core.utils.ServletUtils;
import cn.jeeweb.core.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringEscapeUtils;

/**   
 * @Title: 用户
 * @Description: 用户
 * @author JackyRao
 * @date 2017-09-17 12:54:58
 * @version V1.0   
 *
 */
@Transactional
@Service("tJx3UserService")
public class TJx3UserServiceImpl  extends CommonServiceImpl<TJx3User> implements  ITJx3UserService {
	
	@Override
	public void save(TJx3User tJx3User) {
		// 保存主表
		super.save(tJx3User);
	}
	
	@Override
	public void update(TJx3User tJx3User) {
		try {
			// 更新主表
			super.update(tJx3User);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}
	
	
	
}