package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LimeteUtrapassadoException extends Exception {
    String dataHora; // marca data e hora da ocorrencia da excecao


    public LimeteUtrapassadoException(String msg){
        super(msg);
        dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

}
