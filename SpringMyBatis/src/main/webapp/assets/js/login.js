function login() {
	var form = $('#login');
	$.ajax({
		type : "POST",
		url : "checkLogin.html",
		data : form.serialize(),
		success : function(response) {
			if (response != "OK")
				alert(response);
			else
				window.location.replace("loggato.html");
		},
		error : function(e) {
			alert('Si è verificato un errore: ' + e);
		}
	});
}

$(document).ready(function() {
	$("#btnLogin").click(login);
	$('#passwordInput').keypress(function(e) {
		if (e.keyCode == 13)
			login();
	});
});