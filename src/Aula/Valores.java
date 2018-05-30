package Aula;

import java.util.ArrayList;
import java.util.List;
public class Valores implements ValoresITF{

		
		private List<Integer> lista = new ArrayList<>();

		public List<Integer> getLista() {
			return lista;
		}

		public void setLista(List<Integer> lista) {
			this.lista = lista;
		}

		@Override
		public boolean ins(int v) {
			if(lista.size() < 10) {
				lista.add(v);
				return true;
			}
			return false;
		}

		@Override
		public int del(int i) {
			Integer valorDoElemento = null;
			if(!lista.isEmpty() && i < lista.size()) {
				valorDoElemento = lista.get(i);
				lista.remove(i);
				return valorDoElemento;
			}
			return -1;
			
		}

		@Override
		public int size() {
			return lista.size();
		}

		@Override
		public double mean() {
			double media = 0d;
			if(lista.isEmpty()) {
				return 0d;
			}
			for (Integer valor : lista) {
				media += valor;
			}
			return media/lista.size();
		}

		@Override
		public int greater() {
			Integer maior = null;
			if(lista.isEmpty()) {
				return -1;
			} else {
				for (Integer valor: lista) {
					if(maior == null) {
						maior = valor;
					} else {
						if(valor > maior) {
							maior = valor;
						}
					}
				}
			}
			return maior;
		}

		@Override
		public int lower() {
			Integer menor = null;
			if(lista.isEmpty()) {
				return -1;
			} else {
				for (Integer valor: lista) {
					if(menor == null) {
						menor = valor;
					} else {
						if(valor < menor) {
							menor = valor;
						}
					}
				}
			}
			return menor;
		}

		public void imprimeLista() {
			lista.forEach(item -> System.out.print(item + " "));
		}

	}