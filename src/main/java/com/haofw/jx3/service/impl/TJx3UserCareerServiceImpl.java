package com.haofw.jx3.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import com.haofw.jx3.entity.TJx3UserCareer;
import com.haofw.jx3.service.ITJx3UserCareerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 绑定职业表
 * @Description: 绑定职业表
 * @author JackyRao
 * @date 2017-09-17 12:55:56
 * @version V1.0   
 *
 */
@Transactional
@Service("tJx3UserCareerService")
public class TJx3UserCareerServiceImpl  extends CommonServiceImpl<TJx3UserCareer> implements  ITJx3UserCareerService {

}
