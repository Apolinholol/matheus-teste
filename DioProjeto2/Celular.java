package DioProjeto2;
import DioProjeto1.*;
import DioProjeto.*;

public interface Celular {
    public static void main(String[] args) {

        String[] agenda1 = {"Agenda1"};
        String[] agenda2 = {"Agenda2"};
        String[] agenda3 = {"Agenda3"};
        boolean chamada1 = false;
        boolean chamada2 = true;
        String c1=("981254343");
        String c2=("981254345");
        String c3=("981254346");

        String url1 = "https://www.xcomgames.com.br";
        String url2 = "http://www.xcomgames.com.br";
        String[] browser1 = {};
        String[] browser2 = {};

        String[] playlist1 = {};

        String nomeMusica1 = ("Chop Suey"); 
        String nomeMusica2 = ("Luz e Sombra");
        String nomeMusica3 = ("Amor que não vai");

        AparelhoTelefonico a1 = new AparelhoTelefonico(agenda1, chamada1);
        AparelhoTelefonico a2 = new AparelhoTelefonico(agenda2, chamada2);
        AparelhoTelefonico a3 = new AparelhoTelefonico(agenda3, chamada2);

        NavegadorInternet n1 = new NavegadorInternet(url1, browser1);
        NavegadorInternet n2 = new NavegadorInternet(browser2);

        ReprodutorMusical r1 = new ReprodutorMusical(playlist1);
        ReprodutorMusical r2 = new ReprodutorMusical(playlist1);
        ReprodutorMusical r3 = new ReprodutorMusical(playlist1);


//         r1.adicionarMusica(nomeMusica1);
//         r1.selecionarMusica(nomeMusica1); 
//         r1.tocar();
// System.out.println("----------------");
//         r2.adicionarMusica(nomeMusica2);
//         r2.selecionarMusica(nomeMusica1); 
//         r2.removerMusica(nomeMusica2);
// System.out.println("----------------");
//         r3.adicionarMusica(nomeMusica3);
//         r3.selecionarMusica(nomeMusica3); 
//         r3.pausar();
// System.out.println("----------------");

            // a1.adicionarContatos(c1);
            // a1.atender();
            // System.out.println("----------------");
            // a3.adicionarContatos(c3);
            // a3.iniciarCorreioVoz();
            // System.out.println("----------------");
            // a2.adicionarContatos(c2);
            // a2.adicionarContatos(c1);
            // a2.removerContatos(c2);
            // System.out.println("----------------");

     
        // n1.adicionarNovaAba();
        // n1.exibirPagina(url2);
        // n2.exibirPagina(url1);
        // n2.adicionarNovaAba();
        // n2.atualizarPagina();
        
    }
}