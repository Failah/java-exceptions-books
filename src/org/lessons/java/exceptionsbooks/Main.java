/*
 * Vogliamo gestire il catalogo di libri di una biblioteca.
Un libro è composto da :
- titolo
- numero pagine
- autore
- editore
Scrivere un programma che inserisce n libri in un array.
Chiede i dati di un libro (titolo, numero pagine, autore, editore), istanzia un nuovo oggetto della classe Book e lo inserisce nell’array.
Lo fa per il numero di elementi previsti nell’array.
Quando vengono inseriti i dati, verificare che siano corretti (es. non accettare titolo o autore o editore vuoto, numero pagine ≤ 0). 
Se ci sono errori, lanciare un’eccezione e gestirla mostrando a video il tipo di errore.
Implementare i getter e setter di tutti gli attributi del libro gestendo anche in questo caso eventuali errori di dati non corretti 
(che generano quindi eccezione).
 */

package org.lessons.java.exceptionsbooks;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of books: ");
		int n = s.nextInt();
		s.nextLine();
		Book[] books = new Book[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter book #" + (i + 1) + " details:");
			System.out.println("Title: ");
			String title = s.nextLine();
			System.out.println("Pages: ");
			int pages = s.nextInt();
			s.nextLine();
			System.out.println("Author: ");
			String author = s.nextLine();
			System.out.println("Publisher: ");
			String publisher = s.nextLine();

			try {

				books[i] = new Book(title, pages, author, publisher);

				if (title.isEmpty()) {
					throw new Exception("Title cannot be empty!");
				}
				if (pages <= 0) {
					throw new Exception("Pages cannot be 0 or negative!");
				}
				if (author.isEmpty()) {
					throw new Exception("Author cannot be empty!");
				}
				if (publisher.isEmpty()) {
					throw new Exception("Publisher cannot be empty!");
				}

			} catch (Exception e) {
				System.out.println("There is an Error in your input: " + e.getMessage());
				i--;
			}
		}

		System.out.println("\nHere is your books catalog:");
		for (int i = 0; i < n; i++) {
			System.out.println("Book #" + (i + 1) + ":");
			System.out.println(books[i].toString());
			System.out.println(" ");
		}

		s.close();
	}
}
