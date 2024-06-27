public class WhileLoops {
    public static void main(String[] args) {

        int index = 0 ;
        int target = 5;
        while(index < target){
            System.out.println(index+ " - não é maior que: " + target);
            index++;
            if(index == target){
                System.out.println(target + " é o numero que você tem como objetivo.");
            }
        }

    }
}