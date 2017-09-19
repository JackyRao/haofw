<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>JX3职业列表列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="JX3职业列表">
<grid:grid id="tJx3CareerGridId" url="${adminPath}/jx3/tjx3career/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<%--<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>--%>
	<%--<grid:button groupname="opt" function="delete" />--%>
    <grid:column label="角色名称"  name="careerName" />
    <grid:column label="角色图标路径"  name="careerIcon" />
	<%--<grid:toolbar function="create"/>--%>
	<%--<grid:toolbar function="update"/>--%>
	<%--<grid:toolbar function="delete"/>--%>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>