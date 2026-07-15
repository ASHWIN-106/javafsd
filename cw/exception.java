class exception{
    public static void main(String args[]){
    try{
        int i= Integer.parseInt("12abc");
    double price = 100.0;
    double total = i*price ;
    System.out.println(total);
    }
    catch(NumberFormatException e){
        System.out.println("Invalid input");

    }
}
}