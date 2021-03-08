<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Items Management</title>
</head>
<body>
<h1>Items Management</h1>
<form method="post" action="insert_item.java">
 Item code: <input name="code" type="text" id =code><br> 
 Item name: <input name="name" type="text" id =name><br> 
 Item price: <input name="price" type="text" id=price><br> 
 Item description: <input name="desc" type="text" id=desc><br> 
 <input name="btnSubmit" type="submit" value="Save">
</form>
 
</body>
</html>
