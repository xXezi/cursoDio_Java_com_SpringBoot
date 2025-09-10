package application;

import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();        
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");             
        
        // TODO: Verifique se o serviço está na lista de serviços contratados                
        if(encontrarServico(partes, servico)) {        	
        	System.out.println("Sim");
        }
        else {
        	System.out.println("Não");
        }
        scanner.close();
    }
    
    static boolean encontrarServico(String[] partes, String servico) {
    	for(String s : partes) {
    		if(s.equalsIgnoreCase(servico)) {    			
    			return true;
    		}
    	}
    	return false;
    }    
}