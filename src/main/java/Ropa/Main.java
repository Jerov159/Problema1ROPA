package Ropa;


import static Ropa.ROPA.getPrendaMasCara;

public class Main {
    public static void main(String[] args) {
        for (ROPA ropa : ROPA.values()) {
            System.out.println(ropa);
        }
        System.out.println("La prenda más cara es: " + getPrendaMasCara());
    }
    }
