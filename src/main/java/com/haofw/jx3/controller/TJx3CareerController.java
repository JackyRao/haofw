package com.haofw.jx3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import com.haofw.jx3.entity.TJx3Career;

/**   
 * @Title: JX3职业列表
 * @Description: JX3职业列表
 * @author JackyRao
 * @date 2017-09-17 11:16:47
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/jx3/tjx3career")
@RequiresPathPermission("jx3:tjx3career")
public class TJx3CareerController extends BaseCRUDController<TJx3Career, String> {


}
