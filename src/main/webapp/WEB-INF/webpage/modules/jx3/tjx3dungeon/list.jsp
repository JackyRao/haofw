<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>副本列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="副本">
<grid:grid id="tJx3DungeonGridId" url="${adminPath}/jx3/tjx3dungeon/ajaxListE">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<%--<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>--%>
	<%--<grid:button groupname="opt" function="delete" />--%>
    <%--<grid:column label="人数"  name="peopleNumber" />--%>
    <grid:column label="副本名字"  name="dungeonName" />
    <grid:column label="副本刷新周期"  name="refreshCycle" />
    <grid:column label="上次刷新时间"  name="lastRefreshTime" />
    <grid:column label="下次刷新时间"  name="nextRefreshTime" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<%--<grid:toolbar function="delete"/>--%>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>