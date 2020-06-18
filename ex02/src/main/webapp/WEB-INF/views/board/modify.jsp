<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>


<div class="row">
  <div class="col-lg-12">
    <h1 class="page-header">게시글 수정</h1>
  </div>
  <!-- /.col-lg-12 -->
</div>
<!-- /.row -->

<div class="row">
  <div class="col-lg-12">
    <div class="panel panel-default">

	<form role="form" action="/board/modify", method="post">
      <div class="panel-heading">Board Modify</div>
      <!-- /.panel-heading -->
      <div class="panel-body">

		<div class="form-group">
			<label>Bno</label>
			<input class="form-control" name='bno' value='<c:out value="${board.bno }"/>' readonly="readonly">
		</div>
		
		<div class="form-group">
			<label>Title</label>
			<input class="form-control" name='title' value='<c:out value="${board.title }"/>'>
		</div>
		<div class="form-group">
			<label>Text area</label>
			<textarea class="form-control" rows="3" name='content'><c:out value="${board.content}" /></textarea>
		</div>
		<div class="form-group">
			<label>Writer</label>
			<input class="form-control" name='writer' value='<c:out value="${board.writer }"/>' readonly="readonly">
		</div>
          <button type="submit" data-oper='modify' class="btn btn-info">Submit</button>
          <button type="submit" data-oper='remove' class="btn btn-danger">Remove</button>
          <button type="submit" data-oper='list' class="btn btn-default">List</button>
      </div>
      <!--  end panel-body -->
	</form>
    </div>
    <!--  end panel-body -->
  </div>
  
  <!-- end panel -->
  
</div>
<!-- /.row -->
<%@include file="../includes/footer.jsp"%>
