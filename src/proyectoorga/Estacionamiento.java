/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorga;

/**
 *
 * @author gusta
 */
public class Estacionamiento {

    Boolean full[];
    Carros estacionamiento[][];   

    public Estacionamiento() {
        this.full= new Boolean[22];
        this.estacionamiento = new Carros[22][3];
        
        for(int x = 0; x < estacionamiento.length; x++){
            for(int y = 0; y < estacionamiento[x].length; y++){
            estacionamiento[x][y] = null;
                System.out.print(estacionamiento[x][y]);
            }
            System.out.println("");
        }
        for (int x = 0; x < full.length; x++){
            full[x] = false;
        }
    }
    
    
    
    
    
    
    
public static int Hash(String placa){

    int key = 0;
    
    for(int x = 0; x < placa.length(); x++){
    
        key += (int)placa.charAt(x);
    }
    
   key = key%11;

    return key;
}    

public Carros BuscarCarro(int key, String placaBuscada){
    
    //busca los 3 registros en la posicion del key por la placa
    System.out.println(estacionamiento.length);
    
    for(int x = 0; x < estacionamiento[key].length; x++){
        if(estacionamiento[key][x] != null){
            String placaEncontrada = estacionamiento[key][x].getPlaca();

            if (placaEncontrada.equals(placaBuscada)){
                return estacionamiento[key][x];
            }
    }
        else{
            return null;
        }
    }
    //en caso de que haya overflow
    if(full[key] == true){
        
        key += 11;
        
        if(full[key] == false){
        for(int x = 0; x < 3; x++){
             if(estacionamiento[key][x] != null){
            String placaEncontrada = estacionamiento[key][x].getPlaca();

            if (placaEncontrada.equals(placaBuscada)){
                return estacionamiento[key][x];
            }
             }
             else{
             return null;
             }
        }
        }
        
    }
    
    return null;
}

public  Boolean AgregarCarro(String placa, String marca, String modelo, String color, int mensualidad){

    int key = Hash(placa);
    
    Carros carro = BuscarCarro(key, placa);
    System.out.println(carro);
    
    if (carro == null){
       
        carro = new Carros(placa, marca, modelo, color, mensualidad);

        if (full[key] == true){
            
            key += 11;
            if(full[key] == true){
            return false;
            }
           
        }
        for(int x = 0; x < estacionamiento[key].length; x++){
            if(estacionamiento[key][x] == null){
                estacionamiento[key][x] = carro;
                if(x == (estacionamiento[key].length - 1)){
                    full[key] = true;
                }
                return true;
            }
        }
    }
return false;
}
    
    
    
    
    
    
    
    
}
