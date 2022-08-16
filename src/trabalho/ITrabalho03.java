package trabalho;

public interface ITrabalho03 {
	
	String getEstudante();

	ITAD[] criaLista(int tamanho);
	int getQuantidade(ITAD[] lista);
	
	void enqueue(ITAD[] lista, ITAD tad);
	ITAD dequeue(ITAD[] lista);
	
	String print(ITAD[] lista);
	
}
