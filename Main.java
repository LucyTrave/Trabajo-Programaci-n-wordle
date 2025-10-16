
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // Cargar palabras desde el archivo
            List<String> wordList = Files.readAllLines(Paths.get("C:\\Users\\34687\\eclipse-workspace\\TrabajoEnfoque\\src\\words.txt"));
            
            // Crear una instancia del juego con la lista de palabras
            WordleGame game = new WordleGame(wordList.toArray(new String[0]));
            
            // Iniciar el juego
            game.start();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de palabras.");
            e.printStackTrace();
		
		
		
		
		
		
		
	}
	}

}


