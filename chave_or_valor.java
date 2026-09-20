import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class chave_or_valor {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Map<Integer, String> minhaSenha = new HashMap<>();
        
        minhaSenha.put(1, "SENHA-X");
        minhaSenha.put(2, "SENHA-Y");
        minhaSenha.put(3, "SENHA-D");
        minhaSenha.put(4, "SENHA-F");
        minhaSenha.put(5, "SENHA-G");
        minhaSenha.put(6, "SENHA-H");
        
        System.out.println(" ESCOLHA O QUE QUER VER ");
        
        System.out.print(" DIGITE, O QUE QUER VER DE CHAVE? ");
        int chave = sc.nextInt();
        sc.nextLine();
        
        System.out.print(" DIGITE, O QUE QUER VER DE VALOR? ");
        int valores = sc.nextInt();
        sc.nextLine();
        
        if(chave == 1) {
        	System.out.println(minhaSenha.keySet());
        }
        if(valores == 2) {
        	System.out.println(minhaSenha.values());
        }
        
        System.out.println("=============================");
        System.out.println("        RELATORIO FINAL      ");
        System.out.println("=============================");
        for(Map.Entry<Integer, String> relatorio : minhaSenha.entrySet()) {
        	System.out.println(" [ " + relatorio.getKey() + " | " + relatorio.getValue() + " ] ");
        }
        
    }
}