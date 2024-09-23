package ribeiro.silveira.vinicius.consolidatingKnowledge;

public class validatorCEP {

    public static boolean validarCEP(String cep) {
        // Verifica se o CEP tem 8 dígitos
        if (cep.length() != 8) {
            return false;
        }

        // Verifica se todos os caracteres são dígitos
        try {
            Integer.parseInt(cep);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
