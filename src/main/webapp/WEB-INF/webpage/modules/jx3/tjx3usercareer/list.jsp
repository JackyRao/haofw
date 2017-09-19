<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>绑定职业表列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="绑定职业表列表">
<grid:grid id="tJx3UserCareerGridId" url="${adminPath}/jx3/tjx3usercareer/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="游戏帐号"  name="loginName" />
    <grid:column label="自定义备注"  name="remark" />
    <grid:column label="用户ID"  name="uid" />
    <grid:column label="CREATE_TIME"  name="createTime" />
    <grid:column label="STATUS"  name="status" />
    <grid:column label="角色名字"  name="nickName" />
    <grid:column label="职业ID"  name="careerId" />
    <grid:column label="UPDATE_TIME"  name="updateTime" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>