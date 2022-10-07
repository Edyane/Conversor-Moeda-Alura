package view;
import model.Moeda;
import model.Temperatura;
import javax.swing.JOptionPane;


public class App{
    
    public static void main(String[] args){
        
        
    
        while(true) {
            Temperatura temperatura = new Temperatura();
            Moeda moeda = new Moeda();
            int verificador = 0;
            
            String opcaoConversao = JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moedas", "Conversor de Temperatura"}, "Escolha").toString();

            switch (opcaoConversao) {

                
                case "Conversor de Moedas":
                

                    String tipoDeConversaoDaMoeda;
                    String MoedaConvertida;

                    tipoDeConversaoDaMoeda = JOptionPane.showInputDialog(null, "Escolha um tipo de conversão: ", "Conversor de Moeda",
                     JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Reais para Dolares", "Dolares para Reais", "Reais para Euro", "Euro para Reais",
                     "Reais para Libras Esterlinas", "Libras Esterlinas para Reais", "Reais para peso Chileno" ,"peso Chileno para Reais",
                     "Reais para Peso Argentino", "Peso Argentino para Reais"}, "Escolha").toString();
                    
                     String moedaAConverter = JOptionPane.showInputDialog(null, "Coloque a quantidade a ser convertida: ").toString();

                     if(moedaAConverter.matches("[0-9]*")){
                         MoedaConvertida = moeda.converter(tipoDeConversaoDaMoeda, moedaAConverter);
                         JOptionPane.showMessageDialog(null, "O valor convertido de " + tipoDeConversaoDaMoeda + ": " + MoedaConvertida);
                     }else{
                        JOptionPane.showMessageDialog(null, "Valor inserido inválido", "Error", JOptionPane.ERROR_MESSAGE);
                    }


                break;
                    
                case "Conversor de Temperatura":


                    

                        String tipoDeConversaoDaTemperatura;
                        String TemperaturaConvertida;
    
                        tipoDeConversaoDaTemperatura = JOptionPane.showInputDialog(null, "Escolha um tipo de conversão: ", "Conversor de Temperatura",
                         JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Celcius pra Fahrenheit", "Fahrenheit para Celcius"}, "Escolha").toString();
                    
                        String temperaturaAConverter = JOptionPane.showInputDialog(null, "Coloque a quantidade a ser convertida: ").toString();
                         
                         if(temperaturaAConverter.matches("[0-9]*") && temperaturaAConverter != "" ){
                             
                            TemperaturaConvertida = temperatura.converter(tipoDeConversaoDaTemperatura, temperaturaAConverter);
                            JOptionPane.showMessageDialog(null, "O valor convertido de " + tipoDeConversaoDaTemperatura + ": " + TemperaturaConvertida);

                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Valor inserido inválido", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        
                                       
                    break;
                    
                }
                
                verificador = JOptionPane.showConfirmDialog( null, "Deseja Continuar?", "Continuar", JOptionPane.YES_NO_CANCEL_OPTION);
                switch(verificador){
                    case 1:
                        System.exit(1);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Programa concluido!");
                        System.exit(1);
                        break;
                }

            }

    }

}
