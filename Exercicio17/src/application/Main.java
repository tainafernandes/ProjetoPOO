package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Usando FileWriter e Buffered Writer
        String[] lines = new String[]{"Good nigth", "Welcome"};

        String path = "/home/taina-fernandes/ProjetosJava/Projeto_POO/Exercicio17/index.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine(); // quebra de linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        /*
        //exemplo com o bloco try-with-resources
            String path = "/home/taina-fernandes/ProjetosJava/Projeto_POO/Exercicio17/index.txt";
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line = br.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } */


        /*
        MEXENDO SOMENTE COM O FILE
        File file = new File("/home/taina-fernandes/ProjetosJava/Projeto_POO/Exercicio17/index.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    } */
}
