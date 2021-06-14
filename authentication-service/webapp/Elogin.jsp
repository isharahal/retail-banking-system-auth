<%@ include file="common/header.jspf"%>
<%@ include file="common/footer.jspf"%>
<h2 class="sticky-top p-3 my-3 bg-dark text-white">
	<a href="/elogin" class="active nav-link">Peoples' Bank <i><h5>-Let's
				make the change together...</h5></i></a>
</h2>

<form class="container" action="/inside" method="get">
	<div class="form-group container">
		<label for="exampleInputEmail1">Email address</label> <input
			type="email" class="form-control" id="exampleInputEmail1"
			aria-describedby="emailHelp" placeholder="Enter email"> <small
			id="emailHelp" class="form-text text-muted">We'll never share
			your email with anyone else.</small>
	</div>
	<div class="container form-group">
		<label for="exampleInputPassword1">Password</label> <input
			type="password" class="form-control" id="exampleInputPassword1"
			placeholder="Password">
	</div>
	<br>
	<br>
	<button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>