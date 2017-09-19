package com.haofw.jx3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import com.haofw.jx3.entity.TJx3UserCareer;

/**   
 * @Title: 绑定职业表
 * @Description: 绑定职业表
 * @author JackyRao
 * @date 2017-09-17 12:55:56
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/jx3/tjx3usercareer")
@RequiresPathPermission("jx3:tjx3usercareer")
public class TJx3UserCareerController extends BaseCRUDController<TJx3UserCareer, String> {

}
