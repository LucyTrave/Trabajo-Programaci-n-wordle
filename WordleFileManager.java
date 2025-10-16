

import java.io.*;
import java.util.*;

public class WordleFileManager {

    // Método para cargar las palabras desde un archivo
	
	public class LeerArchivo {
	    public static void main(String[] args) {
	        String nombreArchivo = "words.txt"; // Reemplázalo con la ruta de tu archivo
	        
	        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                System.out.println(linea);
	            }
	        } catch (FileNotFoundException e) {
	            System.err.println("El archivo no fue encontrado: " + e.getMessage());
	        } catch (IOException e) {
	            System.err.println("Error al leer el archivo: " + e.getMessage());
	        }
	    }
	}

    // Método para guardar el historial del juego en un archivo
    public static void saveGameHistory(String filename, List<String> history) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            for (String attempt : history) {
                bw.write(attempt);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar la partida.");
        }
    }
}
	
	
	
	
	
