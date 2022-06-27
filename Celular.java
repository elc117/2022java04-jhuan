public class Celular extends Eletronico {
    private double preco;
    private int velocidade;
    private int cameras;

    public Celular(String nome, String hardware, int tamanho, double preco, int velocidade, int cameras) {
        super(nome, hardware, tamanho);
        this.preco = preco;
        this.velocidade = velocidade;
        this.cameras = cameras;

    }

    public double getPreco() {
        return this.preco;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public int getCameras() {
        return cameras;
    }

    public static void main(String[] args)
	{
        Celular c1 = new Celular("motoz", "quadcore", 20, 1400.0, 300, 3);
        
        System.out.println(c1.getName());

    }
}
