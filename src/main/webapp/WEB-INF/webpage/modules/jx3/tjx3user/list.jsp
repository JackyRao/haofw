<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>用户列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="用户">
<grid:grid id="tJx3UserGridId" url="${adminPath}/jx3/tjx3user/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button title="sys.common.delete"  groupname="opt" function="delObj" outclass="btn-danger" innerclass="fa-trash" url="${adminPath}/jx3/tjx3user/delete" />
    <grid:column label="微信ID"  name="openId" />
    <grid:column label="状态0：有效 1：其他"  name="status" />
    <grid:column label="绑定时间"  name="bindTime" />
    <grid:column label="昵称"  name="nickName" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>