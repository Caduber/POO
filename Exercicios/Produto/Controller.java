public class Controller{

    public static void main(String args[]){

            Produto novoProd = new Produto();

            novoProd.setId (1);
            novoProd.setNome ("Vela");
            novoProd.setPreco (19.90f);

            
            novoProd.setId( (Integer.parseInt (Leitura.retornaDados("Id do produto: "))) );
            novoProd.setNome (Leitura.retornaDados("Nome do produto: "));
            novoProd.setPreco( (Float.parseFloat (Leitura.retornaDados("Preco do produto: "))) );


            System.out.println("\nId do produto: " + novoProd.getId());
            System.out.println("Nome do produto: " + novoProd.getNome());
            System.out.println("Preco do produto: " + novoProd.getPreco());

    }

}