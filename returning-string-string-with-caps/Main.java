class Main {
    
    public static void main(String[] args) {
        
        for(String indivStr : args){

            if(indivStr.charAt(0) > 'A' && indivStr.charAt(0) < 'Z')
                System.out.println(indivStr);

        }

    }

}
