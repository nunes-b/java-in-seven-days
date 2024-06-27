public  class DesafioDois {
    int number;

    DesafioDois(int number){
        this.number =number;
    }

public int Verify() {

    if(this.number % 2 != 0){
        System.out.println("Impar");
    }

    if (this.number % 2 == 0) {
        if(this.number <= 5 &&  this.number >=2){
            System.out.println("A");
        }
        if(this.number >= 6 && this.number <=20){
            System.out.println("B");
        }
        if(this.number > 20){
            System.out.println("C");
        }
    }
    return this.number;
}

}