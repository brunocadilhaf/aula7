package Pacote3;

public class Carro {
    private String letrasPlaca;
    private int numerosPlaca;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Carro(Motorista motorista) {
        this.motorista = motorista;
        motorista.setVeiculoAtual(this);
    }

    public Carro(String placa, int numChassi, Motorista motorista){
        setPlaca(placa);
        this.numChassi = numChassi;
        this.motorista = motorista;
        motorista.setVeiculoAtual(this);
    }

    public String getPlaca() {
        if ("ERRO!!!".equals(letrasPlaca)) {
            return letrasPlaca;
        } else {
            return letrasPlaca + numerosPlaca;
        }
    }

    public void setPlaca(String placa) {
        if (placa != null && placa.length() == 7 &&
            placa.matches("[A-Z]{3}\\d{4}")) {
            this.letrasPlaca = placa.substring(0, 3); //ABC
            this.numerosPlaca = Integer.parseInt(placa.substring(3)); //1234
        } else {
            this.letrasPlaca = "ERRO!!!";
        }
    }
    

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    void acelerar() {
        this.velocidadeAtual++;
    }

    void acelerar(int limite) {
        for (int i = velocidadeAtual; i < limite; i++) {
            acelerar();
        }
    }

    public boolean frear() {
        return false;
    }
}
