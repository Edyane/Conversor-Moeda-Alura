package model;

public class Moeda {

    private double reaisDolar;
    private double dolarReais;
    private double euroReais;
    private double reaisEuro;
    private double reaisPesoArgentinos;
    private double pesoArgentinoReais;
    private double reaisLibrasEsterlinas;
    private double librasEsterlinasReais;
    private double reaisPesoChilenos;
    private double pesoChilenoReais;

    public Moeda(){
        this.dolarReais = 5.09;
        this.reaisDolar = 0.19;
        this.euroReais = 5.23;
        this.reaisEuro = 0.19;
        this.reaisPesoArgentinos = 27.32;
        this.pesoArgentinoReais = 0.037;
        this.reaisLibrasEsterlinas = 5.82;
        this.librasEsterlinasReais = 0.17;
        this.reaisPesoChilenos = 177.91;
        this.pesoChilenoReais = 0.0056;
    }


    public String converter(String tipoConversao, String Quantidade){

        double valor= 0;

        switch(tipoConversao) {
            case "Reais para Dolares":
                valor = reaisDolar;
                break;
            case "Dolares para Reais":
                valor = dolarReais;
                break;
            case "Reais para Euro":
                valor = reaisEuro;
                break;
            case "Euro para Reais":
                valor = euroReais;
                break;            
            case "Reais para Libras Esterlinas":
                valor = reaisLibrasEsterlinas;
                break;
            case "Libras Esterlinas para Reais":
                valor = librasEsterlinasReais;
                break;
            case "Reais para peso Chileno":
                valor = reaisPesoChilenos;
                break;
            case "peso Chileno para Reais":
                valor = pesoChilenoReais;
                break;
            case "Reais para Peso Argentino":
                valor = reaisPesoArgentinos;
                break;
            case "Peso Argentino para Reais":
                valor = pesoArgentinoReais;
                break;
            }

        
        return String.valueOf(valor * Double.parseDouble(Quantidade));
    }

}