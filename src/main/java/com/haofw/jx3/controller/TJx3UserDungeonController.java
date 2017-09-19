package com.haofw.jx3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import com.haofw.jx3.entity.TJx3UserDungeon;

/**   
 * @Title: 用户副本CD
 * @Description: 用户副本CD
 * @author JackyRao
 * @date 2017-09-17 09:14:46
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/jx3/tjx3userdungeon")
@RequiresPathPermission("jx3:tjx3userdungeon")
public class TJx3UserDungeonController extends BaseCRUDController<TJx3UserDungeon, String> {

}
