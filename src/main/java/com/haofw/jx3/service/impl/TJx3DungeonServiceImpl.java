package com.haofw.jx3.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import com.haofw.jx3.entity.TJx3Dungeon;
import com.haofw.jx3.service.ITJx3DungeonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 副本
 * @Description: 副本
 * @author JackyRao
 * @date 2017-09-17 11:25:54
 * @version V1.0   
 *
 */
@Transactional
@Service("tJx3DungeonService")
public class TJx3DungeonServiceImpl  extends CommonServiceImpl<TJx3Dungeon> implements  ITJx3DungeonService {

}
