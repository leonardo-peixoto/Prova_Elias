package Aula;

public interface ValoresITF {
	
	boolean ins(int v);//insere um valor
	int del(int i); // remove/retorna valor de indice i
	int size(); // retorna quantidade valores armazenados
	double mean(); // retorna m�dia valores armazenados
	int greater(); // retorna maior valor armazenado
	int lower(); //retorna o menor valor armazenado

}
