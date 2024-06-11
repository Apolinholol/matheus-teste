package DioProjeto1;

public abstract interface Correio {

    void ligar(String numero);
    void iniciarCorreioVoz();
    void atender();
    void adicionarContatos(String numero);
    void removerContatos(String numero);

}
