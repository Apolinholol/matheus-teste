package DioProjeto;

import java.util.Arrays;

import DioProjeto1.Correio;

public class AparelhoTelefonico implements Correio {

    private String []agendaContatos;
    private boolean chamadaAtiva;


    public AparelhoTelefonico(String[] agendaContatos, boolean chamadaAtiva) {
        this.agendaContatos = agendaContatos;
        this.chamadaAtiva = chamadaAtiva;
    }


    public void adicionarContatos(String numero){
        if (numero.length() != 9) {
            throw new IllegalArgumentException("O número informado não contém 9 caracteres: " + numero);
        }
    
        // Verifica se o número já existe na agenda
        for (String contato : agendaContatos) {
            if (numero.equals(contato)) {
                System.out.printf("O número %s está presente na agenda de contatos!\n", numero);
                // Sai do método se o número já existir na agenda
                return; 
                
            }
        }
    
        // Copia o array original para outro array, adicionando mais 1 de tamanho
        String[] novaAgenda = Arrays.copyOf(agendaContatos, agendaContatos.length + 1);
        // Adiciona o novo contato ao final da agenda
        novaAgenda[agendaContatos.length] = numero; 
        // Faz o atributo da classe receber a nova agenda
        agendaContatos = novaAgenda;
        System.out.printf("O número %s foi adicionado à agenda de contatos.\n", numero);
    }

    
    public void removerContatos(String numero){
        boolean contatoRemovido=false;
        try {
            for (int i = 0; i < agendaContatos.length; i++) {
                if (numero.equals(agendaContatos[i])) {
                    // Remove o contato da lista, criando um novo array sem o contato que foi removido
                    String[] novaAgenda = new String[agendaContatos.length - 1];
                    for (int j = 0, k = 0; j < agendaContatos.length; j++) {
                        if (j != i) {
                            //Faz a nova agenda receber os contatos que não foram removidos
                            novaAgenda[k++] = agendaContatos[j];
                        }
                    }
                    //Recebe a nova agenda com o contato removido
                    agendaContatos = novaAgenda;
                    contatoRemovido = true;
                    break;
                }

        if(!contatoRemovido) System.out.printf("O número %s foi removido da agenda de contatos.\n", numero);
            }    
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Digite novamente o número a ser removido como String." + e.getMessage());
        }
    }  
    public void ligar(String numero){
        if (numero.length() != 9) System.out.println("Não foi possível ligar para esse número: " + numero);
        System.out.println("Ligação em andamento...");
        this.chamadaAtiva=true;
        
    }
    public void iniciarCorreioVoz(){
        if(!this.chamadaAtiva){
            System.out.println("Não foi possível iniciar o correio de voz, pois está em uma chamada ativa.");
        }else{
            System.out.println("Iniciando correio de voz...");
        }

       
    }
    public void atender(){
        this.chamadaAtiva=true;
        System.out.println("Chamada em andamento...");
    }
  
}
