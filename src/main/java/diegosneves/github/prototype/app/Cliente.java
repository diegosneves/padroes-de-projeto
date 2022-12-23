package diegosneves.github.prototype.app;

import diegosneves.github.prototype.model.Botao;
import diegosneves.github.prototype.model.Prototipo;

public class Cliente {

    public static void main(String[] args) {

//        RegistroDePrototipo registro = new RegistroDePrototipo();
        Prototipo botao = new Botao(10, 40, "vermelho");
        Prototipo botao2 = botao.clone();

//        registro.addItem("Botao ok", botao);

//        botao = registro.getPorCor("vermelho");
//        System.out.println(botao);

        System.out.printf("Os objetos são iguais? %b\n", botao == botao2);
        System.out.printf("Os objetos são identicos? %b\n", botao.equals(botao2));



    }

}
