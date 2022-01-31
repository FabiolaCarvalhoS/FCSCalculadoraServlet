<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora Servelet</title>

<!--Bootstrap  -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- CSS -->
<style>
/* FONTE */
@import
	url('https://fonts.googleapis.com/css2? family= Roboto:wght@100 & display=swap')
	;

header, body, html {
	margin: 0px;
	padding: 0px; ]
	font-family: "Roboto";
	background-color: black;
}

h2 {
	text-align: center;
}

#triangulo {
	margin-top: 50px;
	width: 400px;
	height: 280px;
	background-color: #DE264C;
	margin-left: 200px;
	align-itens: center;
	justify-content: center;
	color: white;
	border: 1px solid white;
}

.formulario {
	align-itens: center;
	justify-content: center;
	text-align: center;
}

input {
	background-color: #F6B1C3;
	border: 1px solid white;
}

button {
	background-color: #F6B1C3;
	border: 1px solid black;
	color: #BC0D35;
	width: 70px;
	height: 25px;
	border-radius: 10px;
	font-weight: 950;
}
</style>

</head>

<body>

	<!-- <h1>Minha Calculadora!!</h1>

	<form method="post" action="PrimeiroServelet">

		Valor 1: <input type="number" name="valor1">
		<p>
			Valor 2: <input type="number" name="valor2">
		<p>Resultado = ${requestScope.res}
		<h2></h2>

		<button type="reset">Limpar</button>

		<button type="submit">Somar</button>


	</form>  -->

	<div class="cantainer" id="triangulo">
		<h2>Minha Calculadora!</h2>

		<form class="formulario" method="post" action="CalculadoraServlet">
			<div class="mb-4">
				<label for="exampleInputValor1" class="form-label"> Valor 1:</label>
				<br> <input type="text" class="form-control" name="valor1">
			</div>
			<br>
			<div class="mb-4">
				<label for="exampleInputValor2" class="form-label"> Valor 2:</label>
				<br> <input type="text" class="form-control" name="valor2">
			</div>
<br>

			

			<div class="buttons">
				<input type="submit" name="cmd" value="+"> <input
					type="submit" name="cmd" value="-"> <input type="submit"
					name="cmd" value="*"> <input type="submit" name="cmd"
					value="/">
					<br>
					<br>

				<button type="reset">Limpar</button>

<h4>Resultado : ${requestScope.res}</h4>
			</div>

		</form>
	</div>


</body>
</html>
