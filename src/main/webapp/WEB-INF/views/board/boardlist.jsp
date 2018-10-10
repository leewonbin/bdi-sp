<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
</head>

<body>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>파일</th>
				<th>작성일자</th>
				<th>수정일</th>
				<th>조회수</th>
				<th>삭제여부</th>
				<th>게시자</th>
				<th>비고</th>
			</tr>
		</thead>
	</table>
	<button onclick="boardAdd()">게시글작성</button>
	
	<script>
	function boardUpdate(binum) {
		
	}
	</script>
</body>
</html>