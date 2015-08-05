<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.css' />"/>
    <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap-theme.css' />"/>
    <link rel="stylesheet" href="<c:url value='/resources/css/common.css' />"/>

    <script type="text/javascript" src="<c:url value='/resources/js/jquery-1.10.2.js' />"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
    <title>${pageTitle}</title>
  </head>
  <body>
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="<c:url value='/'/>">漂流阅读</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="<c:url value='/'/>"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> 首页</a></li>
            <li><a href="<c:url value='/users'/>"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> 用户</a></li>
            <li><a href="<c:url value='/books'/>"><span class="glyphicon glyphicon-book" aria-hidden="true"></span> 图书</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>