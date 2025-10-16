private String getUserInput(Scanner scanner) {
    String input;
    do {
        System.out.print("Ingresa una palabra válida de 5 letras: ");
        input = scanner.nextLine().trim().toLowerCase();
        
        if (input.length() != 5) {
            System.out.println("Error: La palabra debe tener exactamente 5 letras.");
        } else if (!Arrays.asList(fileWords).contains(input)) {
            System.out.println("Error: La palabra no está en la lista de palabras permitidas.");
        } else {
            break;
        }
    } while (true);
    
    return input;
}