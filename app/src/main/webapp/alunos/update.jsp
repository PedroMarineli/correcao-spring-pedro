<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Editar Aluno</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" />
    </head>
    <body>
        <main class="container">
  88888888888/h1>
  88888888888unos/update" method="post">
  88888888888hidden" value="${aluno.id}" name="id" />
  88888888888orm-group">
  88888888888r="nome">Nome</label>
  88888888888ass="form-control" type="text" name="nome"  value="${aluno.nome}"placeholder="Nome do Gênero" />
  88888888888
  88888888888orm-group">
  88888888888r="idade">Idade</label>
  88888888888ass="form-control" type="number" name="idade" />
  88888888888
  88888888888
  88888888888 btn-primary" href="/alunos/list">Voltar</a>
                <button class="btn btn-success" type="submit">Salvar</button>
            </form>
        </main>
    </body>
</html>