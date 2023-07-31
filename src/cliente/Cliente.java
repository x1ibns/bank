package cliente;
import endereco.Endereco;
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
    public void setEndereco(String rua , String bairro, String cidade , String estado ){
        this.endereco.setRua(rua) ;
        this.endereco.setBairro(bairro);
        this.endereco.setCidade(cidade);
        this.endereco.setEstado(estado);
        return ;
    }

    public Endereco getEndereco(){
        return this.endereco ;
    }

    
}
