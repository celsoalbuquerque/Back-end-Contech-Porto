public class Vaga {
    private int id;
    private String nome;
    private String empresa;
    private String cargo;
    private String requisito;
    private String beneficio;

    /* GETTER E SETTER  */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getRequisito() {
        return requisito;
    }
    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }
    public String getBeneficio() {
        return beneficio;
    }
    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
}
