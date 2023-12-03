 API para Controlar os entregadores
 	Instruções para colocar em operação
 	
 	Requisitos
 		Java 17
		PostgreSQL
				Database: entregadores
				Username: postgres
				Password: s3nh4
 	
 	Instalação
		Clone este projeto
		Importe para o Eclipse
		Atualize as bibliotecas com o Maven
		Inicialize
 	
 	Acesso
		Abra o um gerenciador de API, como o Postman
		
	Utilização
	Para incluir um entregador
		URI: http://localhost:8080/entregadores

		Método: POST

		Formulário JSON: id, cpf, nome, capacidade do veículo

	Para listar todos os entregadores
		URI: http://localhost:8080/entregadores

		Método: GET

	Para mostrar apenas um entregador
		URI: http://localhost:8080/entregadores/{id}

		Método: GET

	Para excluir um entregador
		URI: http://localhost:8080/entregadores/{id}

		Método: DELETE

	Para alterar um entregador
		URI: http://localhost:8080/entregadores/{id}

		Método: PUT

		Formulário JSON: id, cpf, nome, capacidade do veiculo
 	