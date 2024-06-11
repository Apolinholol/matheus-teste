package DioProjeto;

import java.util.Arrays;
import DioProjeto1.Internet;

public class NavegadorInternet implements Internet {
    
    String url;
    String[] aba;

    // Construtor principal
    public NavegadorInternet(String url, String[] aba) {
        this.url = url;
        this.aba = aba;
    }

    // Construtor secundário
    public NavegadorInternet(String[] aba) {
        this.aba = aba;
    }

    // Método para exibir uma página
    public String exibirPagina(String url1) {
        this.url = url1;
        try {
            // Verifica se a URL é nula ou vazia
            if (url == null || url.isEmpty()) {
                throw new IllegalArgumentException("Insira uma URL.");
            }
            // Verifica se a URL começa com "https://"
            if (!url.startsWith("https://")) {
                throw new IllegalArgumentException("A URL deve começar com 'https://' para garantir sua segurança.");
            }
            
            // Exibe a URL
            System.out.println("A URL fornecida é: " + url);
            return url;
        
        } catch (IllegalArgumentException e) {
            // Tratamento geral para as exceções
            throw new IllegalArgumentException("URL inválida. " + e.getMessage());
        }
    }
    
    // Método para adicionar uma nova aba
    public void adicionarNovaAba() {
        try {
            // Verifica se a URL atual é válida antes de adicionar uma nova aba
            if (url == null || url.isEmpty() || !url.startsWith("https://")) {
                throw new IllegalArgumentException("URL inválida. Não é possível adicionar uma nova aba.");
            }

            // Copia o array original para um novo array com tamanho aumentado em 1 para que seja acomodada a nova aba
            String[] novasAbas = Arrays.copyOf(aba, aba.length + 1);
            // Adiciona a nova URL ao final do novo array na posição que foi aumentada
            novasAbas[aba.length] = this.url;
            // Atualiza a referência do array original para o novo array, fazendo com que as informações de outras abas não se percam
            aba = novasAbas;
            
            // Exibe a mensagem após obter êxito
            System.out.println("Nova aba adicionada com sucesso para: " + url);
           
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException( e.getMessage());
        }
    }

    // Método para atualizar a página
    public void atualizarPagina() {
        try {
            // Faz a verificação dentro do array para encontrar a URL correspondente
            boolean propriaAba = false;
            for (int i = 0; i < aba.length; i++) {
                if (this.url.equals(aba[i])) {
                    propriaAba = true;
                    break;
                }
            }
            
            // Caso não encontre a mesma URL, é exibida a mensagem
            if (!propriaAba) {
                throw new IllegalArgumentException("A URL especificada não corresponde a nenhuma das abas abertas.");
            }
            
            // Exibe a mensagem caso tenha êxito
            System.out.println("Página atualizada para: " + url);
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possível atualizar a página. " + e.getMessage());
        }
    }

}
