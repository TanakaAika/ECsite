<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="jp_co.good_works.lesson.CartForm" %>

<!DOCTYPE html>

<html xmlns:th="http://www.thymeleaf.org">

	<head>
		<!-- Required meta tags -->
		  <meta charset="utf-8">
		  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

		  <!-- Bootstrap CSS -->
		  <link rel="stylesheet"
		        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
		        crossorigin="anonymous">

		<meta charset="UTF-8">

		<title>【ECサイト】購入完了画面</title>
	</head>

	<body>

		<div class="container" style="margin-top:10px; width:700px">
		<div class="jumbotron">

			<h1 align="center">ありがとうございました！</h1>

			<hr class="my-4">

		        	<table align="center">
		        		<th>
		        			<form action="search" method="POST">
		            		<button type="submit" class="btn btn-primary">買い物を続ける</button>
		            		</form>
		            	</th>
						<th>
		    				<form action="finishLogout" method="POST">
		           			<button type="submit" class="btn btn-primary">　ログアウト　</button>
		        			</form>
		    			</th>
		        	</table>

		</div>
		</div>

			 <!-- Optional JavaScript -->
			  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
			  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
			          integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
			          crossorigin="anonymous"></script>

			  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
			          integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
			          crossorigin="anonymous"></script>

			  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
			          integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
			          crossorigin="anonymous"></script>

	 </body>

</html>