class Calculator{  
    public static void main(String args[])throws Exception{  
    
        if(args.length != 3)
            throw new Exception("You should follow the format of input(<first_input> <operand> <second_input>");
        
        else{

            int first_input = Integer.parseInt(args[0]);
            int second_input = Integer.parseInt(args[2]);
            char operand = args[1].charAt(0) == '"' ? args[1].charAt(1) : args[1].charAt(0);
            
            if(operand == '+')
                System.out.println(first_input + " + " + second_input + " = " + (first_input + second_input));
            else if(operand == '-')
                System.out.println(first_input + " - " + second_input + " = " + (first_input - second_input));
            else if(operand == '*')
                System.out.println(first_input + " x " + second_input + " = " + (first_input * second_input));
            else if(operand == '/')
                System.out.println(first_input + " / " + second_input + " = " + (first_input / second_input));
            else
                System.out.println("No other operators are allowed...");
                
        }
    }  
}  