package br.com.E3N.callback.exampleOne;

public class DoTask1 {
    public static void execute(){
        var task = new SimpleTask();
        var theCallBack = new TheCallBack();
        task.executeWith(theCallBack::justPrinting);
    }
}
