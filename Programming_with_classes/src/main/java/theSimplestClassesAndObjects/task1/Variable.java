package theSimplestClassesAndObjects.task1;

public class Variable {
    private int variableA;
    private int variableB;

    public String displayOutput() {
        return "variable A= " + variableA + "\n" + "variable B= " + variableB;
    }

    public void setVariableA(int variableA) {
        this.variableA = variableA;
    }

    public void setVariableB(int variableB) {
        this.variableB = variableB;
    }

    public int getVariableA() {
        return variableA;
    }

    public int getVariableB() {
        return variableB;
    }

    public int sumVariables() {
        return variableA + variableB;
    }

    public int greaterImportance() {
        return variableA > variableB ? variableA : variableB;
    }
}