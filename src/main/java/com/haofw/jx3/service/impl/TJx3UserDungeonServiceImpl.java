package com.haofw.jx3.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import com.haofw.jx3.entity.TJx3UserDungeon;
import com.haofw.jx3.service.ITJx3UserDungeonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 用户副本CD
 * @Description: 用户副本CD
 * @author JackyRao
 * @date 2017-09-17 09:14:46
 * @version V1.0   
 *
 */
@Transactional
@Service("tJx3UserDungeonService")
public class TJx3UserDungeonServiceImpl  extends CommonServiceImpl<TJx3UserDungeon> implements  ITJx3UserDungeonService {

}
