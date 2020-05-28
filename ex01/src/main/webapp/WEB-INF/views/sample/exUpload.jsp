<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<!-- file selector -->
		<form action="/sample/exUploadPost" method="post" enctype="multiPART/form-data">
			<div>
				<input type="file" name="files">
			</div>
			<div>
				<input type="file" name="files">
			</div>
			<div>
				<input type="file" name="files">
			</div>
			<!-- Post 방식으로 submit -->
			<input type="submit" value="upload">
		</form>
	</body>
</html>