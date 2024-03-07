
package Cliente;

public class DaoCliente {
    
    public void setCliente(Cliente c){
        System.out.println("Conectando .........");
        System.out.println("Executando..........");
        System.out.printf("Executado : Insert into Cliente values : %s / %s /  %d ", c.getNome(),c.getCidade(),c.getId());
        System.out.println("    ");
        System.out.println("Desconectando ..........");
    
    
    }
      public Cliente getCliente(int id){
           Cliente c = new Cliente();
           
           System.out.println("Conectando ............");
           System.out.println("Executando .........");
           System.out.println("Executado  :  Select *from Cliente where Id= "+id);
           c.setCidade("Itambaraca");
           c.setNome("Maria");
           c.setId(id);
           System.out.println("Desconetando ........");
      
      
      return c;
      
      }
    
    
    
}
