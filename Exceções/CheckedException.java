import javax.swing.*;
import java.io.*;

public class CheckedException{
    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = "romances-blake-crouch.txt";
        try{
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch(FileNotFoundException e){ // Se não encontrar o arquivo pelo nome, imprime a mensagem 
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir!");
        } catch(IOException e){ // Se ocorrer qualquer outro erro além do nome do arquivo imprime a mensagem. A exception mais genérica sempre fica por último em relação à exception específica 
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado Entre em contato com o suporte!");
        } finally{
            System.out.println("Chegou no finally");
        }
            System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException { //IOException pega a exception do FileReader
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine(); // Lança uma IO Exception

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);
        bw.flush(); //descarrega o BufferedWriter com o flush
        br.close(); //fecha o BufferedReader com o close
    }
}