
package condeicoesjava;

public class CondeicoesJava {

    public static void main(String[] args) {
        
    int nota1 = 6;
    int nota2 = 8;
    int media = (nota1 + nota2) /2;
    int faltas = 7;
       System.out.println("Sua média é: " + media);
       
       if(media >= 7){
           System.out.println("Aprovado");
        } else if (media >=4 & media <=6){
        System.out.println("Exame!");
    } else{
           System.out.println("Reprovado");
        }if (media >=4 & faltas <=7){
           System.out.println("Reprovado po faltas");
    } else ((media >=4 & media <=6) & faltas <=10){
         System.out.println("Reporvado");
    }
    }    
}
