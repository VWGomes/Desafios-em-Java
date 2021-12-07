package tiposprimitivos;


public class TiposPrimitivos {


    public static void main(String[] args) {
        
        float nota = 8.5f;
        
        String nome = "Igor";
                
        System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.2f! \n", nome, nota);
        System.out.printf("A nota é %.4f \n", nota);
        System.out.printf("A nota é %.2f! \n", nota);
        System.out.format("A nota de %s é %.6f!!!! \n", nome, nota);
    }
    
}
