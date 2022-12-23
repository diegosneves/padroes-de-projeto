package diegosneves.github.fatorial.enums;

public enum Fatorial {

    RECURSIVO {
        @Override
        public Integer fatorial(Integer valor) {
            if (valor > 1) {
                return valor * fatorial(valor - 1);
            }
            return 1;
        }
    },
    FOR {
        @Override
        public Integer fatorial(Integer valor) {
            Integer resultado = 1;
            for(int i = valor; i >= 1; i--) {
                resultado *= i;
            }
            return resultado;
        }
    };

    public abstract Integer fatorial(Integer valor);

}
