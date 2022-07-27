package application;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Manipulação de pastas com file
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath); //caminho digitado
        File[] folders = path.listFiles(File::isDirectory); //Gero uma lista com todas as pastas, filtrando com a função File::isDirectory
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile); //pega só arquivos
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }
        boolean success = new File(strPath + "\\subdir").mkdir(); //cria subpasta
        System.out.println("Directory created successfully: " + success);
        sc.close();
    }


    }
        /*
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

