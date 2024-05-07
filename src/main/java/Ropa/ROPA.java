package Ropa;

public enum ROPA {
        CAMISA("algodón", "M", 29.99, "casual") {
            @Override
            public void ponerPrenda() {

            }
        },
        PANTALON("denim", "L", 39.99, "formal") {
            @Override
            public void ponerPrenda() {

            }
        },
        SOMBRERO("Cuero", "M", 23.11, "formal") {
            @Override
            public void ponerPrenda() {

            }
        },
        CALCETINES("Poliester","XS",9.99, "casual") {
            @Override
            public void ponerPrenda() {
            }
        },;

    ROPA(String material, String talla, double precio, String estilo) {
        this.material = material;
        this.talla = talla;
        this.precio = precio;
        this.estilo = estilo;
    }

    private String material;
        private String talla;
        private double precio;
        private String estilo;

    public static ROPA getPrendaMasCara() {
        double precioMax = Double.MIN_VALUE;
        ROPA prendaMasCara = null;
        for (ROPA prenda : ROPA.values()) {
            if (prenda.precio > precioMax) {
                precioMax = prenda.precio;
                prendaMasCara = prenda;
            }
        }
        return prendaMasCara;
    }
    public abstract void ponerPrenda();

    @Override
    public String toString() {
        return "Prenda: " + name() + ", Material: " + material + ", Talla: " + talla + ", Precio: $" + precio + ", Estilo: " + estilo;
    }
    }

