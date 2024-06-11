
package DioProjeto;
import java.util.Arrays;

import DioProjeto1.Musica;

public class ReprodutorMusical implements Musica {

    private String[] playlist;
    
    
    public ReprodutorMusical(String[] playlist){
        this.playlist=playlist;
        
    }
    

    public void removerMusica(String musica){
        boolean musicaRemovida=false;
    try {
        for (int i = 0; i < playlist.length; i++) {
            if (musica.equals(playlist[i])) {
                // Cria um novo array sem a música removida
                String[] novaPlaylist = new String[playlist.length - 1];
                for (int j = 0, k = 0; j < playlist.length; j++) {
                    if (j != i) {
                        novaPlaylist[k++] = playlist[j];
                    }
                }
                playlist = novaPlaylist;
                musicaRemovida = true;
                break;
            }
            if(!musicaRemovida) System.out.printf("Música %s removida com sucesso.\n", musica);
        }
     
      
    } catch (IllegalStateException e) {
        throw new IllegalStateException("Digite novamente a música a ser removida como String." + e.getMessage());
        }
    }
        
    

    public void adicionarMusica(String musica){
           //Aumenta o novo array em 1 posição copiando o array original, fazendo depois o array
           //original receber o novo array criado com a música adicionada
           String[] novaPlaylist = Arrays.copyOf(playlist, playlist.length + 1);
           //Garante a identificação da música caso seja necessário
           novaPlaylist[playlist.length] = musica; 
           playlist = novaPlaylist;

           System.out.println("Música adicionada com sucesso.");
    }


    //Verifica e retorna caso a música esteja presente na memória 
    public String selecionarMusica(String musica) {
        
            boolean musicaEncontrada=false;

            if (playlist == null || playlist.length == 0) {
                throw new IllegalStateException("Não há músicas na playlist.");
            }

            for (String mus : playlist) {
                if (musica.equals(mus)) {
                    musicaEncontrada=true;
                }
            }
            if(!musicaEncontrada)  {
                System.out.println("Esta música não está na playlist");
            }else{System.out.printf("Música '%s' encontrada...\n" , musica);}

            return musica;
        }
    
  
  
    public void pausar() {
        System.out.println("Música pausada...");  
    }

    
    public void tocar() {
        System.out.println("Música tocando...");
    }


  
    
}