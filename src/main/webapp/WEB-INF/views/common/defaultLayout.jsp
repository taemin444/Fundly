<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: dobigulbi
  Date: 2/2/24
  Time: 12:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<!--header-->
<tiles:insertAttribute name="header"/>
<!--body-->
<%--<tiles:insertAttribute name="header"/>--%>
<tiles:insertAttribute name="body"/>

</body>
</html>
