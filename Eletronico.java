//pode ser extendida para os tipos de eletronicos. como PCs, celulares e etc.

public class Eletronico {
    private String nome;
    private String hardware;
    private int tamanho;
    
    //pega as caracteristicas dos eletronicos
    public Eletronico(String nome,String hardware, int tamanho) {
        this.nome = nome;
        this.hardware = hardware;
        this.tamanho = tamanho;
    }
    //pega hardware
    public String getHardware() {
        return hardware;
    }
    //pega o nome
    public String getName() {
        return nome;
    }
    //pega o tamanho
    public int getTamanho() {
        return tamanho;
    }
}
