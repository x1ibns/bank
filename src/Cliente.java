public class Cliente {
    private String nome ;
    private String cpf ;
    private Endereco endereco ;

    public void setNome(String nome){
        this.nome = nome ;
        return ;
    }

    public String getNome(){
        return this.nome ;
    }

    public void setCpf(String cpf){
        this.cpf = cpf ;
        return ;
    }

    public String getCpf(){
        return this.cpf ;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco ;
        return ;
    }

    public Endereco getEndereco(){
        return this.endereco ;
    }

}
