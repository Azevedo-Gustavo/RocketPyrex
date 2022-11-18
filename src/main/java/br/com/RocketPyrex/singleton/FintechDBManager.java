package br.com.RocketPyrex.singleton;

/*Pacote: jdbc
 * Descri��o: Pacote criado para que seja feita a chamada do banco de dados atrav�s do m�todo
 * est�tico "obterConexao" de forma controlada.
 */


/*Bibliotecas "Connection" e "DriverManager" s�o necess�rias para efetivar a conec��o do Java ao
 * banco de dados.
 * A biblioteca "SQLException" faz o tratamento de erro caso a conex�o com o banco n�o ocorra.
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class FintechDBManager {

  public static Connection obterConexao(){
	  Connection conexao = null;
	  try {		  
			//Registra o Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
							
	        //Abre uma conex�o
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