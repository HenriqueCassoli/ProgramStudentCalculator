package entities;

public class Student {

 public String name;
 public double fistNota;
 public double secondNota;
 public  double thirdNota;


public double finalNota(){
  return  fistNota +  secondNota + thirdNota;
}

    public double missingPoints() {
        if (finalNota() < 60.0) {
            return 60.0 - finalNota();
        }
        else {
            return 0.0;
        }
    }

}
