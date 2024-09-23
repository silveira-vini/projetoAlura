package ribeiro.silveira.vinicius.consolidatingKnowledge;

import java.text.Normalizer;

public class NormalizerStr {
    public static String formatString(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        str = str.trim();
        str = str.replaceAll(" ", "%20");
        return str;

    }

    public static String formatCEP(String cep) {
        cep = cep.trim();
        cep = cep.replaceAll("-","");
        return cep;
    }
}
