package org.example.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BraceChecker {
    private final Map<Character, Character> braceMap = new HashMap<>();

    public BraceChecker(){
        braceMap.put('[', ']');
        braceMap.put('{', '}');
        braceMap.put('(', ')');
    }

    public boolean isValid(String braces){
        final Stack<Character> stack = new Stack<>();

        for (char brace: braces.toCharArray()){
            if(braceMap.containsValue(brace)){
                if(stack.empty()){
                    return false;
                }

                char openBrace = stack.pop();

                if(!braceMap.get(openBrace).equals(brace)){
                    return false;
                }

                continue;
            }

            stack.push(brace);
        }

        return stack.empty();
    }
}
