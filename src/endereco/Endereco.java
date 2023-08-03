package endereco;
public class Endereco {
    private String rua ;
    private String bairro ;
    private String cidade ;
    private String estado ;
    
    public Endereco(String rua ,String bairro , String cidade , String estado){
        setRua(rua);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
    }
    
    
}