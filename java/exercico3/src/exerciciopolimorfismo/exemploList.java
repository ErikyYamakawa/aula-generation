package exerciciopolimorfismo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class exemploList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> minhaLista = new ArrayList<Integer>();

		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		
		
		for(Integer listaElementos:minhaLista)
		{
			System.out.println(listaElementos);
		}
		System.out.println("Removendo um elemento da lista");
		System.out.println();
		minhaLista.remove(0);
		
		for(Integer listaElementos:minhaLista)
		{
			System.out.println(listaElementos);
		}
		int primeiroElemento = minhaLista.get(0);
		
		System.out.println("\n O primeiro elemento é : "+primeiroElemento);
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++)
		{
			System.out.println("\n Elemento : "+ minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);
		System.out.println("\n Depois de ordenada....");
		System.out.println(minhaLista);
		
		System.out.println();
		
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(4);
		
		Iterator <Integer> imeuSet = meuSet.iterator();
		
		while(imeuSet.hasNext()) 
		{
			System.out.println(imeuSet.next());
		}
		
		
	}

}
