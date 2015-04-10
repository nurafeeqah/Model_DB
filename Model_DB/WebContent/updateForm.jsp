<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model.Model" %>

<% Model model = (Model) request.getAttribute("model"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SOFTWARE MODEL SEARCH TOOL - Update Model</title>
</head>
<body>

<h1>SOFTWARE MODEL SEARCH TOOL - Update Model</h1>

<form name=updateForm action=updateModel method=get >
	
	<label>
	Model ID: 
	</label>
	<input type=text name=modelID value="<%= model.getModelID() %>" />
	<br />
	
	<label>
	Model Name: 
	</label>
	<input type=text name=modelName value="<%= model.getModelName() %>" />
	<br />
	
		<label>
	Model Author: 
	</label>
	<input type=text name=modelAuthor value="<%= model.getModelAuthor() %>" />
	<br />
	
		<label>
	Model Date: 
	</label>
	<input type=text name=modelDate value="<%= model.getModelDate() %>" />
	<br />
	
	<input type=submit name=submit value="UPDATE MODEL" />
	
	</form>

</body>
</html>