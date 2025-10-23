import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    
    public Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
        public int getId() {
            return id;
        }
        
        public String getNome() {
            return nome;
        }
        
        public int getQuantidade() {
            return quantidade;
        }
        
        public double getPreco() {
            return preco;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void exibirProduto() {
            System.out.println("ID: " + id + " | Nome: " + nome + " | Quantidade: " + quantidade + " | Preço: R$ " + preco);
        }
    }

    public class Estoque {
        private static ArrayList<Produto> estoque = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int opcao;
            
            do {
                exibirMenu();
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opcao) {
                    
                    case 1:
                    adicionarProduto();
                    break;
                  
                    case 2:
                    removerProduto();
                    break;
                    
                    case 3:
                    atualizarProduto();
                    break;
                   
                    case 4:
                    listarProdutos();
                    break;
                    
                    case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                    default:
                    System.out.println("Opção inválida! Tente novamente.");
                }
            } while (opcao != 0);
        }
        
        public static void exibirMenu() {
            System.out.println("\n===== Sistema de Gerenciamento de Estoque =====");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Listar Produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
        }

        public static void adicionarProduto() {
            System.out.print("Digite o ID do produto: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            for (Produto p : estoque) {
                if (p.getId() == id) {
                    System.out.println("ID já cadastrado. Produto não adicionado.");
                    return;
                }
            }

            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            System.out.print("Digite o preço: ");
            double preco = scanner.nextDouble();

            Produto novoProduto = new Produto(id, nome, quantidade, preco);
            estoque.add(novoProduto);

            System.out.println("Produto adicionado com sucesso!");
        }

        public static void removerProduto() {
            System.out.print("Digite o ID do produto que deseja remover: ");
            int id = scanner.nextInt();

            Produto produtoParaRemover = null;

            for (Produto p : estoque) {
                if (p.getId() == id) {
                    produtoParaRemover = p;
                    break;
                }
            }

            if (produtoParaRemover != null) {
                estoque.remove(produtoParaRemover);
                System.out.println("Produto removido com sucesso!");
            } else {
                System.out.println("Produto não encontrado.");
            }
        }

        public static void atualizarProduto() {
            System.out.print("Digite o ID do produto que deseja atualizar: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Produto produtoParaAtualizar = null;

            for (Produto p : estoque) {
                if (p.getId() == id) {
                    produtoParaAtualizar = p;
                    break;
                }
            }

            if (produtoParaAtualizar != null) {
                System.out.print("Digite o novo nome (ou pressione Enter para manter): ");
                String nome = scanner.nextLine();
                if (!nome.isEmpty()) {
                    produtoParaAtualizar.setNome(nome);
                }

                System.out.print("Digite a nova quantidade (ou -1 para manter): ");
                int quantidade = scanner.nextInt();
                if (quantidade != -1) {
                    produtoParaAtualizar.setQuantidade(quantidade);}

                    System.out.print("Digite o novo preço (ou -1 para manter): ");
                    double preco = scanner.nextDouble();
                    if (preco != -1) {
                        produtoParaAtualizar.setPreco(preco);
                    }

                    System.out.println("Produto atualizado com sucesso!");
                } else {
                    System.out.println("Produto não encontrado.");
                }
            }

            public static void listarProdutos() {
                if (estoque.isEmpty()) {
                    System.out.println("O estoque está vazio.");
                } else {
                    System.out.println("\n===== Lista de Produtos no Estoque =====");
                    for (Produto p : estoque) {
                        p.exibirProduto();
                    }
                }
            }
        }


