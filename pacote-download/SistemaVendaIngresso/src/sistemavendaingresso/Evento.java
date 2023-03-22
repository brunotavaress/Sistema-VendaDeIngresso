package sistemavendaingresso;
public class Evento {
    //Atributos
    public String nome;
    public String data;
    public float valorUnico;
    public int capaciMax;
    public int ListaIngressos;
    
    //Métodos
    public void mostrarEvento(){
        System.out.println("---------------------------");
        System.out.println("Evento: " + this.getNome());
        System.out.println("Data: " + this.getData());
        System.out.println("Valor Único: R$ " + this.getValorUnico());
        System.out.println("Capacidade Máxima: " + this.getCapaciMax());
        System.out.println("---------------------------");
    }
    public void venderIngresso(){
        if (this.getCapaciMax()<= this.getListaIngressos()){
            System.out.println("PROCESSO DE VENDA:");
            System.out.println("Capacidade máxima atingida, ingressos esgotados!");
        } else {
            int v = 0;
            v = v + 1;
            this.setListaIngressos(v);
            System.out.println("PROCESSO DE VENDA:");
            System.out.println("Compra realizada com sucesso!");
            System.out.println("------------------------------");
        }
    }
    
    public void quantidadeVendida(){
        System.out.println("Quantidade vendida: " + this.getListaIngressos());
    }

    public Evento() {
        this.setListaIngressos(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(float valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapaciMax() {
        return capaciMax;
    }

    public void setCapaciMax(int capaciMax) {
        this.capaciMax = capaciMax;
    }

    public int getListaIngressos() {
        return ListaIngressos;
    }

    public void setListaIngressos(int ListaIngressos) {
        this.ListaIngressos = ListaIngressos;
    }
        
}

