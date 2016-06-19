<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dictionary</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css"
	href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" type="text/css"
	href="http://cdn.datatables.net/1.10.11/css/jquery.dataTables.min.css">
<script src="http://code.jquery.com/jquery-1.12.0.min.js"
	type="text/javascript"></script>
<script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script
	src="http://cdn.datatables.net/1.10.11/js/jquery.dataTables.min.js"></script>
<script src="js/script.js" type="text/javascript">
	
</script>
</head>
<body>
	<div class="content">
		<div class="banner"></div>
		<div class="search">
			<input type="text" id="search" name="q"
				placeholder="Input text here to start ">
			<div id="btnSearch">
				<span></span>
			</div>
		</div>

		<div class="result">
			<p id="nodata">No result found, please try again.</p>
			<table id="table" class="display" cellspacing="0" width="100%">
				<thead>
					<tr>
						<th>Word</th>
						<th>WordType</th>
						<th>Definition</th>
					</tr>
				</thead>
			</table>
		</div>
		<div>
			<input type="hidden" id="baseurl"
				value="${pageContext.request.contextPath}" />
		</div>
	</div>
</body>
</html>