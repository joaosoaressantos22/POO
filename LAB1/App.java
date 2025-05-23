public class App {

    public static void main(String[] args) {
        
        Empresa empresa = new Empresa("Garoto"); 
        
        Departamento d1 = new Departamento("Serenata"); 
        
        Departamento d2 = new Departamento("Caribe"); 
        
        empresa.adicionarDepartamento(d1); 
        
        empresa.adicionarDepartamento(d2);

        Pessoa Gustavo = new Pessoa("Gustavo", 2002, 9, 22); 
        Pessoa Leonardo = new Pessoa("Leonardo", 1999, 6, 22); 

        // Pessoa Jadir = new Pessoa("Jadir", 1955, 1, 17); 
        // Pessoa Pacheco = new Pessoa("Leonardo", 1988, 8, 31); 

        // d1.adicionarDepartamento(Pacheco);
        d1.adicionarDepartamento(Gustavo);
        d1.adicionarDepartamento(Leonardo);

        // d2.adicionarDepartamento(Jadir);

        System.out.println("Idade média da empresa é " + empresa.getIdadeMediaEmpresa());

    }
}