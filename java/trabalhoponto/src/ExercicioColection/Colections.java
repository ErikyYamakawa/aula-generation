package ExercicioColection;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class Colections {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int op;
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> estoque = new ArrayList();
			
			do
			{
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\n(1) adicionar produtos ao estoque ?");
				System.out.println("\n(2) remover produtos ao estoque ?");
				System.out.println("\n(3) atualizar produtos do estoque ?");
				System.out.println("\n(4) mostrar produtos do estoque ?");
				System.out.println("\n(0) encerrar o programa ?");
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("\n Digite a sua opção");
				op = leia.nextInt();
				
				switch(op)
				{
				case 1:
					leia.nextLine();
					System.out.println(" adicionar produto para o estoque");
					String produto = leia.nextLine();
					estoque.add(produto);
					break;
				case 2:
					leia.nextLine();
					System.out.println("\n  remover produto do estoque");
					String produtor = leia.nextLine();
					
					if(estoque.contains(produtor))
					{
						estoque.remove(produtor);
					}
					else
					{
						System.out.println("\n produto nao encontrado!!!");
					}
					break;
				case 3:
					leia.nextLine();
					System.out.println("\n atualizat produto");
					String verifica = leia.nextLine();
					System.out.println("Digite o nome do produto que entrara no lugar do produto " + verifica );
					String novo = leia.nextLine();
					if(estoque.contains(verifica))
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else
					{
						System.out.println("\n produto nao encontrado!!!");
					}
					System.out.println("\n"+ estoque);
					break;
				case 4:
					leia.nextLine();
					System.out.println("\n os produtos que temos no estoque são :");
					System.out.println(estoque);
					break;
					default:
						System.out.println("\n Finalizou o programa");
					
					
				}
			}while(op!=0);
		};

	}


