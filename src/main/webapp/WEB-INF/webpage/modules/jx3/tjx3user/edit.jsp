<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
    <title>用户</title>
    <meta name="decorator" content="form"/>
    <html:css name="bootstrap-fileinput" />
    <html:css name="simditor,jqgrid" />
</head>

<body class="white-bg"  formid="tJx3UserForm" beforeSubmit="beforeSubmit">
    <form:form id="tJx3UserForm" modelAttribute="data"  method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<table  class="table table-bordered  table-condensed dataTables-example dataTable no-footer">
		   <tbody>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>微信ID:</label>
		            </td>
					<td class="width-35">
						<form:input path="openId" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>状态0：有效 1：其他:</label>
		            </td>
					<td class="width-35">
						<form:input path="status" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>绑定时间:</label>
		            </td>
					<td class="width-35">
						<form:input path="bindTime" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td  class="width-15 active text-right">	
		              <label><font color="red">*</font>用户ID:</label>
		            </td>
					<td class="width-35">
						<form:input path="id" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
				</tr>
				<tr>
					<td  class="width-15 active text-right">	
		              <label>昵称:</label>
		            </td>
					<td class="width-35">
						<form:input path="nickName" htmlEscape="false" class="form-control"      />
						<label class="Validform_checktip"></label>
					</td>
					<td class="width-15 active text-right"></td>
		   			<td class="width-35" ></td>
		  		</tr>
		      
		   </tbody>
		</table>   
	</form:form>
	<div class="row">
        <div class="tabs-container">
            <ul class="nav nav-tabs">
            </ul>
            <div class="tab-content">
          
            </div>
        </div>
    </div>
<html:js name="bootstrap-fileinput" />
<html:js name="simditor,jqgrid,jqGrid_curdtools,jqGrid_curdtools_inline" />
<script>
	$(document).ready(function () {
	    $('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
	    	 resizeGrid();
		});
	});
	$(function(){
	   $(window).resize(function(){   
		   resizeGrid();
	   });
	});
	function resizeGrid(){
	}

	/**
	*提交回调方法
	*/
	function beforeSubmit(curform){
		 //这里最好还是使用JSON提交，控制器改变提交方法，并使用JSON方式来解析数
		 //通过判断，如果有问题不提交
		 return true;
	}
	
	function initGridFormData(curform,gridId){
		 var rowDatas =getRowDatas(gridId+"Grid");
		 var rowJson = JSON.stringify(rowDatas);
		 if(rowJson.indexOf("editable") > 0&&rowJson.indexOf("inline-edit-cell") )
	     {
	    	 return false;
	     }
		 var gridListJson=$('#'+gridId+"ListJson").val();
		 if(gridListJson==undefined||gridListJson==''){
			 var rowInput = $('<input id="'+gridId+'ListJson" type="hidden" name="'+gridId+'ListJson" />');  
			 rowInput.attr('value', rowJson);  
			 // 附加到Form  
			 curform.append(rowInput); 
		 }else{
			 $('#'+gridId+"ListJson").val(rowJson);
		 }
		 return true;
	}
</script>
</body>
</html>