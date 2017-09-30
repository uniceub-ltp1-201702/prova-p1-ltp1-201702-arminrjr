import java.util.ArrayList;

//Nome: Armin Reinehr Junior      RA: 213863

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDSimulado bd = new BDSimulado();
		
		//Questão 2a
		System.out.println(bd.InfoCliente("Otaviano Neves"));
		
		//Questao 2b
		ArrayList<Ligacao> listaLigacoes = bd.ligacoesPorCliente("Otaviano Neves");
		for (int i = 0; i < listaLigacoes.size(); i++) {
			System.out.println(listaLigacoes.get(i).getNumeroD());
		}
		
		//Questao 2c
		System.out.println(bd.ligacoesPorUF("DF"));
				
		
	}

}
