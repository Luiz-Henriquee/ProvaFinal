package Aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.CompararValor;
import Classes.CompararValor;
import Classes.Produto;
import Classes.Venda;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        int codigo;
        List<Produto> produtos = new ArrayList<>();
        

        do{

            System.out.println("\n--------------\nMENU DE OPÇÕES\n--------------\n");
            System.out.println("1- Incluir produto " );
            System.out.println("2- Consultar produto ");
            System.out.println("3- Listagem de produtos ");
            System.out.println("4- Vendas por período ");
            System.out.println("5- Realizar venda ");
            System.out.println("0- Fechar o programa\n ");

            System.out.printf("Digite a opção que deseja escolher: ");
            opcao = in.nextInt();
            in.nextLine();

            if (opcao == 1){

                Produto novoProduto = new Produto();

                System.out.printf("Digite o nome do produto: ");
                novoProduto.setNome(in.nextLine());

                System.out.printf("Digite o código do produto: ");
                novoProduto.setCodigo(in.nextInt());
                in.nextLine();

                System.out.printf("Digite o valor do produto: ");
                novoProduto.setValor(in.nextDouble());
                in.nextLine();

                System.out.printf("Digite a quantidade do produto: ");
                novoProduto.setQtdEstoque(in.nextInt());
                in.nextLine();

                produtos.add(novoProduto);


            }

            else if (opcao == 2){

                

                if(produtos.size() < 1){

                    System.out.printf("Nenhum produto cadastrado, volte e selecione a 1° opção.");
                }else{


                    for (Produto produto : produtos) {



                        System.out.printf("Digite o código do produto:");
                        codigo = in.nextInt();
                        in.nextLine();
    
                        if (codigo != produto.getCodigo()){
    
                            System.out.println("Não temos nenhum produto com esse código no sistema!");
                            continue;
                        
                        }
    
                        for (Produto produto2 : produtos) {
    
                            if(codigo == produto2.getCodigo()){
    
    
                                System.out.println("---------------------------------"  );
                                System.out.println("Dados do produto que você buscou:"  );
                                System.out.println("---------------------------------\n"  );
                                System.out.printf("Nome: %s\nCódigo: %s\nValor unitário: %s\nQuantidade em estoque: %s\n", produto.getNome(), produto.getCodigo(), produto.getValor(), produto.getQtdEstoque());
    
    
                            }
                            
                        }


                        
                    }
                   



                }
               

            }

            else if (opcao == 3){

               

                if(produtos.size() < 1){

                    System.out.println("Nenhum produto cadastrado, volte e selecione a 1° opção.");

               }else{

                for (Produto produto : produtos) {

                    System.out.println("---------------------" );
                    System.out.println("Produtos Cadastrados:" );
                    System.out.println("---------------------\n" );
    
    
                    System.out.printf("Nome: %s \nCódigo: %s \nValor unitário: %s \nQuantidade em estoque: %s \n" 
                    , produto.getNome(), produto.getCodigo(), produto.getValor(),
                     produto.getQtdEstoque() );

                     //produtos.sort(new CompararValor());
                     

                       // produtos.get(0);

                        //System.out.println("O valor minímo é: " + produtos.get(0));

                         
                     
    
    
                   } 
                    
                }

             

               } 

            

            else if (opcao == 4){

                if(produtos.size() < 1){

                    System.out.println("Nenhum produto cadastrado, volte e selecione a 1° opção.");

               }else{


                   System.out.println("Relatótio de vendas");
                   


               }


            }

            else if (opcao == 5){
               
                Produto novoProduto = new Produto();
                Venda novaVenda = new Venda();

                if(produtos.size() < 1){

                    System.out.println("Nenhum produto cadastrado, volte e selecione a 1° opção.");

               }else{

                   System.out.printf("Digite o código do produto que deseja vender: ");
                   codigo = in.nextInt();
                   in.nextLine();

                   if(codigo != novoProduto.getCodigo()){

                        System.out.println("Código inválido.");

                   }else{

                   

                    if(codigo == novoProduto.getCodigo()){

                        novaVenda.setProdutoVendido(novoProduto);

                        if(novoProduto.getQtdEstoque() > 0){

                            System.out.printf("Digite a quantidade que deseja vender: ");
                            novaVenda.setQtdVenda(in.nextInt());
                            in.nextLine();
                            
                            

                            if(novoProduto.getQtdEstoque() >= novaVenda.getQtdVenda() ){

                               novaVenda.concluirVenda();

                               System.out.println("Venda concluida com sucesso!");

                            } else{

                                System.out.println("Quantidade insuficiente no estoque.");

                            }

                        }

                    }

               }
            
            }
        
        }

            else if (opcao != 0){
                
                System.out.println("A opção que você escolheu, não existe no sistema.");

            }
            

        }while(opcao != 0);
        
        System.out.println("Fim do programa!");

        in.close();






    }
}
