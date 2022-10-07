package model;

public class Temperatura {

    public String converter(String tipoDeConversao, String temperatura){
        
        if(tipoDeConversao == "Celcius pra Fahrenheit"){
            return String.valueOf(( Double.parseDouble(temperatura)*1.8)+32);
        }
        else if(tipoDeConversao == "Fahrenheit para Celcius"){
            
            return (String.valueOf(( Double.parseDouble(temperatura) - 32) / 1.8));
        }
        
        return "";
    }


}