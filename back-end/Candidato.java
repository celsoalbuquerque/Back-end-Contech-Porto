import java.util.Date;

public class Candidato extends Usuario{ /*Herança */
    private String raca;
    private char genero;
    private Date dataNasc;

    /* GETTER E SETTER  */
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public Date getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    /*Construtor */
    public Candidato(String nome, String email, String raca, char genero, Date dataNasc){
        this.setNome(nome);
        this.setEmail(email);
        this.setGenero(genero);
        this.setDataNasc(null);
        this.setRaca(raca);
    }

    /*Mostrar Candidato inscritos */
    public void status(){
        System.out.println("-----------------------CANDIDATO----------------------");
        System.out.println("Nome: " +this.getNome());
        System.out.println("Email: " +this.getEmail());
        if(genero == 'M' || genero == 'm'){
            System.out.println("Genêro: Masculino");
        }
        else if(genero == 'F' || genero == 'f'){
            System.out.println("Gênero: Feminino");
        }
        else{
            System.out.println("Gênero: Outro");
        }
        System.out.println("Data Nascimento: "+this.getDataNasc());
    }
}
