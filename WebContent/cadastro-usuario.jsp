<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuario</title>
<%@ include file="header.jsp" %>
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-register100">
				<form class="login100-form validate-form">
					<span class="login100-form-title p-b-26">
						<a href="login.jsp"> <img class="img-splash" width="100%" height="auto" src="resources/Finplan/login/images/icons/Vector_logo.png" alt="Tela Inicial"> </a>
						<br>
						Cadastro
					</span>
					<span class="login100-form-title p-b-48">
						<p>Você está a poucos passos de mudar sua vida financeira, por favor, preencha os dados abaixo:</p>
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Digite Nome e Sobrenome nome">
						<input class="input100" type="text" name="name">
						<span class="focus-input100" data-placeholder="Nome Completo"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Digite um CPF válido">
						<input class="input100" type="int" name="CPF">
						<span class="focus-input100" data-placeholder="CPF"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Digite um E-mail válido">
						<input class="input100" type="text" name="email">
						<span class="focus-input100" data-placeholder="E-mail"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Digite uma senha válida">
						<span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
						<input class="input100" type="password" name="pass">
						<span class="focus-input100" data-placeholder="Senha"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Digite novamente a senha">
						<span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
						<input class="input100" type="password" name="confirmPass">
						<span class="focus-input100" data-placeholder="Confirmação de Senha"></span>
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">
								CONTINUAR
							</button>
						</div>
					</div>

					<div class="text-center p-t-115">
						<span class="txt1">
							Já possui conta?
						</span>

						<a class="txt2" href="login.jsp">
							Acessar
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="resources/Finplan/login/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/Finplan/login/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/Finplan/login/vendor/bootstrap/js/popper.js"></script>
	<script src="resources/Finplan/login/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/Finplan/login/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/Finplan/login/vendor/daterangepicker/moment.min.js"></script>
	<script src="resources/Finplan/login/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="resources/Finplan/login/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="resources/Finplan/login/js/main.js"></script>

</body>
</html>