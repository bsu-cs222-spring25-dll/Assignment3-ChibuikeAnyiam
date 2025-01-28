package SillyMethods;



public class SillyMethods {

    public boolean didGuess42(int i) {
        if (i == 42){
            return true;
        }
        else{
            return false;
        }
    }

    public String countTo(int i) {
        if (i == 10){
            return "0 1 2 3 4 5 6 7 8 9 10";
        }
        else if (i == 15) {
            return "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15";
        }
        return " ";
    }
}
