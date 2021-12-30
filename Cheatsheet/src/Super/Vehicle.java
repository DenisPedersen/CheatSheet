package Super;
//super er en reference-variabel og refererer til super-klassen i et inheritance-forhold mellem klasser.
// Altså benyttes super()-metoder til at modificere i parent-klassens konstruktør.
 class Vehicle { //Vehicle er Super-klassen //ingen public før Class når der er flere klasser i samme
    Vehicle() {
        System.out.println("VEHICLE KONSTRUKTØR");
    }

    }

 class Car extends Vehicle { //ligesom med inheritance, giver extends-keywordet Car-klassen alle de egenskaber som Vehicle-klassen har.
     int maxSpeed;
    Car(int maxSpeed){
        super(); //kalder super til Car
        System.out.println("HER ER BILENS KONSTRUKTØR");
        this.maxSpeed = maxSpeed; //med "this" refereres til den nuværende klasse, med super. refereres til super-klassen
    }

 }

