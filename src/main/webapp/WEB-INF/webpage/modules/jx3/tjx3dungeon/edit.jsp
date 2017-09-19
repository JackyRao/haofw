<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>副本</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor" />
</head>

<body class="white-bg"  formid="tJx3DungeonForm">
    <form:form id="tJx3DungeonForm" modelAttribute="data" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">
						<label>副本名字:</label>
					</td>
					<td class="width-35">
						<form:input path="dungeonName" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label>人数:</label>
		            </td>
					<td class="width-35">
						<form:input path="peopleNumber" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>

				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>上次刷新时间:</label>
		            </td>
					<td class="width-35">
						<form:input path="lastRefreshTime" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">
						<label>下次刷新时间:</label>
					</td>
					<td class="width-35">
						<form:input path="nextRefreshTime" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>副本刷新周期 天数:</label>
		            </td>
					<td class="width-35">
						<form:input path="refreshCycle" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td class="width-15 active text-right"></td>
					<td class="width-35" ></td>
				</tr>
		      
		   </tbody>
		</table>   
	</form:form>
<html:js name="bootstrap-fileinput" />
<html:js name="simditor" />
</body>
</html>