import java.util.*;

public class Main {
    public static void main(String[] args) {
       int idade = 18;
     int pais = 1;
     if(idade >= 18 || pais >= 1){
       System.out.println("Voce tem " + idade);
       char nossa = 10004;
       System.out.println(pais + " acompanhado" + " voce pode comprar bebida " + nossa);
       String lll = "login:";
       lll = lll + "........";
       System.out.println(lll);
       String llll = "senha:";
       llll = llll + "........";
       System.out.println(llll);
     }
     else{
        char ll = 10006;
       System.out.println("voce é de menor " + pais + " acompanhado " + ll);
     }
     System.out.println();
    System.out.println("              Estoque de fornecedor");
    System.out.println();
    boolean estoque = true;
    if(estoque == true){
      char sim = 10004;
      System.out.println("A bebida no estoque" + sim);
    }
    else{
      char nao = 1006;
      System.out.println("Nao a bebida no estoque");
    }
  }
}