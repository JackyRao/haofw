package com.haofw.jx3.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import com.haofw.jx3.entity.TJx3Career;
import com.haofw.jx3.service.ITJx3CareerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: JX3职业列表
 * @Description: JX3职业列表
 * @author JackyRao
 * @date 2017-09-17 11:16:47
 * @version V1.0   
 *
 */
@Transactional
@Service("tJx3CareerService")
public class TJx3CareerServiceImpl  extends CommonServiceImpl<TJx3Career> implements  ITJx3CareerService {

}
