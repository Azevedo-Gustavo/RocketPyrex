package br.com.RocketPyrex.singleton;

/*Pacote: jdbc
 * Descrição: Pacote criado para que seja feita a chamada do banco de dados através do método
 * estático "obterConexao" de forma controlada.
 */


/*Bibliotecas "Connection" e "DriverManager" são necessárias para efetivar a conecção do Java ao
 * banco de dados.
 * A biblioteca "SQLException" faz o tratamento de erro caso a conexão com o banco não ocorra.
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class FintechDBManager {

  public static Connection obterConexao(){
	  Connection conexao = null;
	  try {		  
			//Registra o Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
							
	        //Abre uma conexão
	        conexao = DriverManager.getConnection(
	            "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM95079", "140596");
	        
	        System.out.println("Conectado!");
	        
	        
	      //Tratamento de erro  
	      	} catch (Exception e) {
    		e.printStackTrace();
    	}
	  return conexao;
  }
}