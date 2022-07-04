package com.colmeia.projetointegrador.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EstoqueDeProdutos {
    // key = codigo do produto , value = lista com a quantidade do mesmo produto em estoque
    public static Map<String, List<Produto>> estoque = new LinkedHashMap<String, List<Produto>>();;
    private static Map<String, List<Produto>> copiaDoEstoque;
    private static Produto produto;


    private static Map<String, List<Produto>> getCopiaDoEstoque() {
        return copiaDoEstoque;
    }

    private static void setCopiaDoEstoque(Map<String, List<Produto>> copiaDoEstoque) {
        copiaDoEstoque = copiaDoEstoque;
    }

    
    public static void adicionarProduto(Produto produto, double quantidade){
        List<Produto> produtosDoIdProduto;
        String codigo = produto.getId();
        
        if(estoque.containsId(codigo)){
            produtosDoId = estoque.get(codigo);
            
            if (produtosDoIdProduto.get(0).getNome_Item().equals(produto.getNome_Item())) {
                if (produto instanceof ProdutoUnitario) {
                    while (quantidade > 0) {                
                        produtosDoId.add(produto);
                        quantidade--;
                    }
                }
                else if (produto instanceof ProdutoQuilo) {
                    ProdutoQuilo pdt = ObtenhaProdutoQuiloTemporario(produto);
                    pdt.setQtdQuilos(((ProdutoQuilo)produtosDoId.get(0)).getQtdQuilos() +  quantidade);
                    produtosDoId = new LinkedList<Produto>();
                    produtosDoId.add(pdt);
                }

                estoque.put(codigo, produtosDoId);
            }
            else{
                System.out.println("ATENÇÃO\tATENÇÃO\tATENÇÃO\tATENÇÃO\tATENÇÃO");
                System.out.println("Produto NÃO foi adicionado pois o codigo '" + produto.getCodigo() + "' possui apenas produtos '"
                +produtosDoId.get(0).getNome() + "' e voce esta tentando adicionar '" + produto.getNome() + "'");
            }
        }else{
            produtosDoId = new LinkedList<Produto>();
            
            if (produto instanceof ProdutoUnitario) {
                while (quantidade > 0) {                
                    produtosDoId.add(produto);
                    quantidade--;
                }
            } 
            else if (produto instanceof ProdutoQuilo) {
                produtosDoId.add(produto);
            }
            
            estoque.put(codigo, produtosDoId);
        }
    }


    public static void removerProduto(String codigo, double quantidade){
        List<Produto> produtosDoId;
        boolean removerDoEstoque = false;
        
        if(estoque.containsId(codigo)){
            produtosDoId = estoque.get(codigo);
            p = produtosDoId.get(0);
            if (produtosDoId.get(0) instanceof ProdutoUnitario) {
                double temp = quantidade;
                for (int i = 0; i < quantidade; i++) {
                    if(produtosDoId.size() > 0 && temp > 0) {                
                        produtosDoId.remove(produtosDoId.get(0));
                        //System.out.println("Removendo um produto de codigo: " + codigo);
                        temp--;
                    }
                    else {
                        //System.out.println("ATENÇÃO! O estoque desse produto acabou: " + p.getNome()); 
                        removerDoEstoque = true;
                        break;
                    }
                }
            }
            else if (p instanceof ProdutoQuilo){
                ProdutoQuilo pdtQuilo = ObtenhaProdutoQuiloTemporario(p);
                        
                double peso = pdtQuilo.getQtdQuilos() - quantidade;
                removerDoEstoque = peso <= 0 ? true : false;
                pdtQuilo.setQtdQuilos(peso);
                produtosDoId.clear();
                produtosDoId.add(pdtQuilo);
            }
            if (removerDoEstoque) {
            	System.out.println("*  ATENÇÃO! O estoque desse produto acabou: " + produto.getNome() +"  *"); 
                estoque.remove(codigo);
            }
            else{
                estoque.put(codigo, produtosDoId);
            }
        }else{
        	System.out.println("*  ATENÇÃO! Produto com o código " + codigo + " não encontrado  *");
        }
        System.out.println();
    }
    
    
  //Verifica s eexiste o produto no estoque, caso não exista, retorna null
//    public static Produto seekProduto(String codigo) {
  //      Map<String, List<Produto>> temp = estoque.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e-> new LinkedList(e.getValue())));
    //    if(temp.containsKey(codigo)){
      //      Iterator it = temp.get(codigo).iterator();
         
        //    if(it.hasNext()){
          //      Produto pdt = (Produto) it.next();
            //    if (pdt instanceof ProdutoUnitario) {
              //      String codigo_un = pdt.getId();
                //    String nome_un = pdt.getNome_Item();
                  //  ProdutoUnitario pdt_un = new ProdutoUnitario(codigo_un, nome_un);
                    //return pdt_un;
                //}
                //else if (pdt instanceof ProdutoQuilo){
                  //  return ObtenhaProdutoQuiloTemporario(pdt);
                //}
           // }
        //}else{
        	//System.out.println("*                   Produto indisponível!                     *");
        //}
        //return null;
    //}   

    // Este método exibe para o beneficiário, somente os itens e a quantidade disponível
    public static void exibirEstoqueBeneficiario(){
        Produto produto = null;
        System.out.println("*                     PRODUTOS DISPONÍVEIS                      *");
        Iterator listasDeId = EstoqueDeProdutos.estoque.IdSet().iterator();
        int quantidade = 0;
        double quilos = 0;
        
        while (listasDeId.hasNext()) {
            String codigo = (String)listasDeId.next();
            Iterator produtos = estoque.get(codigo).iterator();
            boolean mostrarNomeProduto = true;
           
            while (produtos.hasNext()) {
                produto = (Produto)produtos.next();
                
                if (mostrarNomeProduto) {
                    System.out.println("Código: " + codigo);
                    System.out.println("Produto: " + produto.getNome());
                    mostrarNomeProduto = false;
                }
                
                //if (p instanceof ProdutoQuilo) {
                  //  ProdutoQuilo pdt = (ProdutoQuilo)produto;
                    //System.out.println("Quilos: " + pdt.getQtdQuilos() + "kg\n");
                //}

               // quantidade++;
            }
            
            if (produto instanceof ProdutoUnitario) {
                System.out.println("Quantidade em estoque = " +quantidade + "\n");
            }
            
            quantidade = 0;
        }
        
        System.out.println();
    }

    
    
    
    
    
}

