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

class Book {
	private String title;
	private int pages;
	private String author;
	private String publisher;

	public Book(String title, int pages, String author, String publisher) throws Exception {
		this.setTitle(title);
		this.setPages(pages);
		this.setAuthor(author);
		this.setPublisher(publisher);
	}

	@Override
	public String toString() {
		return "Title: " + title + "\n" + "Pages: " + pages + "\n" + "Author: " + author + "\n" + "Publisher: "
				+ publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if (title == null || title.isEmpty()) {
			throw new Exception("Title cannot be empty");
		}
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) throws Exception {
		if (pages <= 0) {
			throw new Exception("Number of pages must be positive");
		}
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		if (author == null || author.isEmpty()) {
			throw new Exception("Author cannot be empty");
		}
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) throws Exception {
		if (publisher == null || publisher.isEmpty()) {
			throw new Exception("Publisher cannot be empty");
		}
		this.publisher = publisher;
	}
}
