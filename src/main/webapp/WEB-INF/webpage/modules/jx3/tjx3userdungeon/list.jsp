<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>用户副本CD列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="用户副本CD">
<grid:grid id="tJx3UserDungeonGridId" url="${adminPath}/jx3/tjx3userdungeon/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="副本CD"  name="cd" />
    <grid:column label="创建时间"  name="createTime" />
    <grid:column label="副本ID"  name="did" />
    <grid:column label="0正常 1其他"  name="status" />
    <grid:column label="更新时间"  name="updateTime" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>