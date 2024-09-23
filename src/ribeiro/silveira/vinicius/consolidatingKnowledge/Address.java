package ribeiro.silveira.vinicius.consolidatingKnowledge;

public class Address {
    String cep;
    String logradouro;
    String complemento;
    String bairro;
    String localidade;
    String uf;


    @Override
    public String toString() {
        return String.format("""
                
                ENDEREÇO COMPLETO
                CEP: %s
                Logradouro: %s
                Complemento: %s
                Bairro: %s
                Localidade: %s
                UF: %s
                """, cep, logradouro, complemento, bairro, localidade, uf);
    }
}
