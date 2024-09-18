package javaPOO.sharedBehaviour.models;

public class Podcast extends Audio {

    String entrevistador;
    String convidado;

    public String getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(String entrevistador) {
        this.entrevistador = entrevistador;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() >= 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
