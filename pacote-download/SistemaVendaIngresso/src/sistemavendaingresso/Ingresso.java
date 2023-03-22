package sistemavendaingresso;
public class Ingresso {
    //Atributos
    public String nome;
    public long cpf;
    public String evento;
    public String categoria;
    public float valorUnico;
    public float valorAjustado;
    
    //Métodos
    public void valorIngresso(float v){
        if(this.getCategoria() == "Pista"){
            this.setValorAjustado(this.getValorUnico());
        } else if (this.getCategoria() == "VIP"){
            v =(this.getValorUnico()*1.3f);
            this.setValorAjustado(v);
        } else if (this.getCategoria() == "Camarote"){
            v =(1.6f*this.getValorUnico());
            this.setValorAjustado(v);
        }        
    }
    
    public void mostrarResumo(){
        System.out.println("------------------------");
        System.out.println("RESUMO DA COMPRA:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Evento: " + this.getEvento());
    }
    
    public void imprimirValor(){
        System.out.println("Ingresso da categoria: " + this.getCategoria());
        System.out.println("Valor: R$ " + this.getValorAjustado());
    }

    public Ingresso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(float valorUnico) {
        this.valorUnico = valorUnico;
    }

    public float getValorAjustado() {
        return valorAjustado;
    }

    public void setValorAjustado(float valorAjustado) {
        this.valorAjustado = valorAjustado;
    }
    
    
}
