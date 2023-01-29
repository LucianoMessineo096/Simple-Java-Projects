/*Definire una classe Stack che implementi una pila di 100 String tramite un ArrayList<String>. Le funzioni
membro della classe devono essere:
void push(String s)
String pop()
boolean isEmpty()
boolean isFull().
Scrivete un programma che crea un oggetto Stack e, tramite un menu testuale, verifica il corretto
funzionamento della classe.
Implementate infine i metodi toString e equals e verificatene il corretto funzionamento.*/
////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;

public class Stack
{
  /*variabile di istanza*/
	private ArrayList<String> dati;

  /*costruttore*/

	public Stack(){
		dati = new ArrayList<String>();
	}

  /*metodi*/

	public boolean isFull(){
		return dati.size() == 100;
	}

	public boolean isEmpty(){
		return dati.size() == 0;
	}

	public void push(String s){
		if(!isFull())
			dati.add(s);
	}

	public String pop(){
		if(!isEmpty())
			return dati.remove(dati.size() - 1);
		return "";
	}

	public String toString(){
		return dati.toString();
	}

	public boolean equals(Stack s){
		return this.dati.equals(s.dati);
		/*
		if(this.dati.size() != s.dati.size())
			return false;

		for(int i = 0; i<this.dati.size(); ++i)
			if(!(this.dati.get(i).equals(s.dati.get(i))))
				return false;

		return true; */
	}
}
