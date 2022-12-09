package Number4;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.HashMap;

public class ExpressionParser {
    HashMap<TrippleInterface, Integer> operandsList;
    public TrippleInterface parse(String str) throws ParseException {
        str = str.replace(" ", "");
        TrippleInterface left = null;
        TrippleInterface right = null;
        String operand = null;
        int inBracketsCount = 0;
        for(int i = 0; i < str.length(); i++){
            String currentCharacter = ((Character) str.charAt(i)).toString();
            if (isVariable(currentCharacter)){
                if  (left == null){
                    left = new Variable(currentCharacter);
                }else{
                    right = new Variable(currentCharacter);
                    try {
                        operandsList.put(newOperation(left, right, operand), getPriority(operand, inBracketsCount));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    left = null;
                }
            }
            else if (isConst(currentCharacter)){
                if  (left == null){
                    left = new Variable(currentCharacter);
                }else{
                    right = new Variable(currentCharacter);
                    try {
                        operandsList.put(newOperation(left, right, operand), getPriority(operand, inBracketsCount));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    left = null;
                }
            }
            else if (isOpenBracket(currentCharacter)){
                inBracketsCount++;
            }
            else if (isClosedBracket(currentCharacter)){
                inBracketsCount--;
            }
            else if (isOperand(currentCharacter)){
                operand = currentCharacter;
            }
        }
        return left;
    }
    public TrippleInterface newOperation(TrippleInterface left, TrippleInterface right, String operand) throws ParseException {
        switch (operand){
            case "+" : return new Add(left, right);
            case "-" : return new Substract(left, right);
            case "*" : return new Multiply(left, right);
            case "/" : return new Divide(left,right);
        }
        throw new ParseException("Unknown operand: " + operand);
    }
    public boolean isOperand(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
    public boolean isVariable(String str){
        return str.equals("x") || str.equals("y") || str.equals("z");
    }
    public boolean isConst(String str){
        return str.matches("[0-9]");
    }
    public boolean isOpenBracket(String str){
        return str.equals("(");
    }
    public boolean isClosedBracket(String str){
        return str.equals(")");
    }
    public int getPriority(String operand, int inBracketsCount){
        return ((operand.equals("+")) ? 1 : operand.equals("-") ? 1 : operand.equals("*") ? 2 : operand.equals("/") ? 2 : 0) + inBracketsCount * 10;
    }
}
