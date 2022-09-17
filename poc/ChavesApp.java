import java.util.Scanner;
import java.util.Stack;

public class ChavesApp {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a string");

        String chaves = entrada.nextLine();
        
        System.out.println(validarChaves(chaves));

        entrada.close();;
    }


    public static boolean validarChaves(String chaves) {

        char charAux;
        boolean abrirChaves = false;
        boolean fecharChaves = false;
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < chaves.length(); i++) {
            charAux = chaves.charAt(i);
            System.out.println("chaves" + i + " = " + charAux);
            abrirChaves = (charAux == '(' || charAux == '{' || charAux == '[');
            fecharChaves = (charAux == ')' || charAux ==  '}' || charAux ==  ']');

            if (abrirChaves) {
                pilha.push(charAux);
            } else {
                if (fecharChaves) {
                    if (pilha.empty()) {
                        System.out.println("Erro chaves, na col" + i);
                        return false;
                    }
                    switch (charAux) {
                        case ')': { 
                            if (pilha.peek() != '(') {
                                System.out.println("Erro chaves, na col " + i);         
                                return false;

                            } else {
                                pilha.pop();
                            }
                            continue;
                        }
                        case ']': {
                            if (pilha.peek() != '[') {
                                System.out.println("Erro chaves, na col " + i);         
                                return false;

                            } else {
                                pilha.pop();
                            }
                            continue;
                        }
                        case '}': {
                            if (pilha.peek() != '{') {
                                System.out.println("Erro chaves, na col " + i);         
                                return false;

                            } else {
                                pilha.pop();
                            }
                            continue;
                        }
                        
                    }
                    
                    
                }
            }
        }
        return true;

    }
}
