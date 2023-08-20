
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>
    <h2>Click to activate account</h2>

    <form method="post" action="${flowExecutionUrl}">
        <input type="submit" name="_eventId_activate" value="activate" />
        <input type="submit" name="_eventId_cancel" value="cancel" />
    </form>
</body>
</html>
