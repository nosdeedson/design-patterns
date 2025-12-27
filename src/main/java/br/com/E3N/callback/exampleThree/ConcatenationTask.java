package br.com.E3N.callback.exampleThree;

public class ConcatenationTask extends Task<String>{
    @Override
    protected String execute() {
        StringBuilder builder = new StringBuilder();
        builder.append("The concatenation is : ");
        builder.append(12);
        builder.append(" and is done.");
        return builder.toString();
    }
}
