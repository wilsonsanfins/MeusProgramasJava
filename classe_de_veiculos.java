
public class classe_de_veiculos {
private String marca;
private String modelos;
private int ano;
private int potencia;
private int eixos;
private int carga;

public classe_de_veiculos (String marca , String modelo, int ano, int potencia, int eixos, int carga){
    this.marca=marca;
    this.modelos=modelos;
    this.ano=ano;
    this.potencia=potencia;
    this.eixos=eixos;
    this.carga=carga;
}
public void alternar (String modelos){
    this.modelos=modelos;

}

}
