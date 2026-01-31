package br.com.E3N.clientSessionPattern;

public class Main {
     public static void main(String[] args) {
         /**
          * The pattern client session has the purpose of knowing from where the message came from.
          * The origin does not matter what matters is that mu code should be able to relate a message with
          * a previous message, this is possible because the caller will send to the code an ID controlled by the code.
          * If the code receives a message for the first time from any origin and has to control the relation between
          * messages, the receiver code must create a session which will have an id, so the API ca relate message.
          * The purpose is similar to HTTP sessions but can apply for any kind of code that has to control the state
          * of who is calling.
          */
        App.execute();
    }
}
