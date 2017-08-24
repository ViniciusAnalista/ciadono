
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="generator" content="Bootply" />

<title>CiaDoNó</title>

</head>
<body>
	<form method="post" action="/ciadono/cadastroaluno">
		<div>
			<label for="title">Titulo</label> 
			<input type="text" name="title" id="title" />
		</div>
		<div>
			<label for="description">Descrição</label>
			<textarea rows="10" cols="20" name="description" id="description">
            </textarea>
		</div>
		<div>
			<label for="pages">Número de paginas</label> 
			<input type="text" name="pages" id="pages" />
		</div>
		<div>
			<input type="submit" value="Enviar">
		</div>
	</form>
</body>
</html>
