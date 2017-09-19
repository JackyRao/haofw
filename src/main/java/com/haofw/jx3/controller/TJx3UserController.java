package com.haofw.jx3.controller;


import cn.jeeweb.core.query.data.Queryable;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import com.haofw.jx3.entity.TJx3User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**   
 * @Title: 用户
 * @Description: 用户
 * @author JackyRao
 * @date 2017-09-17 12:54:58
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/jx3/tjx3user")
@RequiresPathPermission("jx3:tjx3user")
public class TJx3UserController extends BaseCRUDController<TJx3User, String> {

    /**
     * 在异步获取数据之前
     *
     * @param model
     * @param request
     * @param response
     */
    public void preAjaxList(Queryable queryable, DetachedCriteria detachedCriteria, HttpServletRequest request,
                            HttpServletResponse response) {
        System.out.println("12313131");

    }


}
