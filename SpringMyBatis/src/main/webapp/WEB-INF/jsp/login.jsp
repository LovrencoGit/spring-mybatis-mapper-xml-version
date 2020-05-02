<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/bootstrap/bootstrap.css" rel="stylesheet" />

<title>Spring MyBatis</title>
</head>
<body>
	<script src="assets/js/jquery-1.11.3.js"></script>
	<script src="assets/js/bootstrap/bootstrap.js"></script>
	<script src="assets/js/login.js"></script>

	<div class="navbar navbar-default">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-responsive-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<!--
		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="logout.html">Logout</a></li>
			</ul>
		</div>
		 /.nav-collapse -->
	</div>

	<div class="container text-center">
		<div class="jumbotron">
			<div>
				<img src="assets/img/Augens_logo.jpg" class="img-responsive"
					style="margin: 0 auto;">
				<h2>Spring MyBatis</h2>
				<p>Login</p>
			</div>
		</div>

		<div></div>
	</div>

	<div class="container text-center">
		<div class="row">
			<div class="col-lg-6 col-lg-offset-3">
				<form id="login" class="bs-example form-horizontal">
					<legend>Credenziali di accesso</legend>

					<div class="form-group">
						<label class="col-lg-3 control-label">Username</label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="usernameInput"
								name="usernameInput" placeholder="Username" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-3 control-label">Password</label>
						<div class="col-lg-6">
							<input type="password" class="form-control" id="passwordInput"
								name="passwordInput" placeholder="Password" />
						</div>
					</div>

					<div class="col-lg-6 col-lg-offset-3">
						<button id="btnLogin" name="btnLogin" class="btn btn-primary"
							type="button">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>


</body>
</html>