package com.haofw.jx3.controller;


import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.model.PageJson;
import cn.jeeweb.core.query.annotation.PageableDefaults;
import cn.jeeweb.core.query.data.PropertyPreFilterable;
import cn.jeeweb.core.query.data.Queryable;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.jeeweb.core.utils.StringUtils;
import cn.jeeweb.modules.sys.security.shiro.realm.UserRealm;
import cn.jeeweb.modules.sys.utils.UserUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.haofw.jx3.entity.TJx3Dungeon;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**   
 * @Title: 副本
 * @Description: 副本
 * @author JackyRao
 * @date 2017-09-17 11:25:54
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/jx3/tjx3dungeon")
@RequiresPathPermission("jx3:tjx3dungeon")
public class TJx3DungeonController extends BaseCRUDController<TJx3Dungeon, String> {


    /**
     * 根据页码和每页记录数，以及查询条件动态加载数据
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "ajaxListE", method = { RequestMethod.GET, RequestMethod.POST })
    @PageableDefaults(sort = "id=desc")
    private void ajaxList(Queryable queryable, PropertyPreFilterable propertyPreFilterable, HttpServletRequest request,
                          HttpServletResponse response) throws IOException {

        UserRealm.Principal principal = UserUtils.getPrincipal(); // 如果已经登录，则跳转到管理首页

        System.out.println(principal);

        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(entityClass);

        propertyPreFilterable.addQueryProperty("id");
        SerializeFilter filter = propertyPreFilterable.constructFilter(entityClass);
        PageJson<TJx3Dungeon> pagejson = new PageJson<>(commonService.list(queryable, detachedCriteria));
        for(TJx3Dungeon jx3Dungeon:pagejson.getResults()){
            jx3Dungeon.setDungeonName(jx3Dungeon.getPeopleNumber()+"人"+jx3Dungeon.getDungeonName());
        }
        String content = JSON.toJSONString(pagejson, filter);
        StringUtils.printJson(response, content);
    }
}
