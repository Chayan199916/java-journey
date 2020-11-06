class Main {
    
    public static void main(String[] args) {
        
        String maxString = "";
        for(String indivStr : args){

            if(indivStr.length() > maxString.length())
                maxString = indivStr;

        }
        System.out.println(maxString);

    }

}
