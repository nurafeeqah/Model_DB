<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SOFTWARE MODEL SEARCH TOOL - Add New Model</title>
</head>
<body>

	<h1>SOFTWARE MODEL SEARCH TOOL - Add New Model</h1>

		<form action="UploadFile" method="post" enctype="multipart/form-data">
		
		Select File: <input type="file" name="filetoupload"><br/>
		
	
		<input type="submit" value="Upload File">
		
		</form>
		
	
	
	<form name=addForm action=addModel method=get>
	
	<label>
	Model Name: 
	</label>
	<input type=text name=modelName value="" />
	<br />
	
		<label>
	Model Author: 
	</label>
	<input type=text name=modelAuthor value="" />
	<br />
	
		<label>
	Model Date:
	</label>
	<input type=text name=modelDate value="" />
		<label>
	 (DD/MM/YYYY)
	</label>
	<br />
	
	<input type="reset" value="RESET">
	<input type=submit name=submit value="ADD NEW MODEL" />
	
	</form>

</body>
</html>