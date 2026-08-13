public class Mascota{

    String nombre;
    String raza;
    int edad;

    void AumentarEdad(){
       
        edad++;
        
        if (edad > 0)
            System.out.println("La edad de la mascota es: " + edad);
        else
            System.out.println("La edad de la mascota no puede ser negativa");

    }

    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        m1.nombre = "Firulais";
        m1.raza = "Labrador";
        m1.edad = 3;

        System.out.println("Nombre: " + m1.nombre);
        System.out.println("Raza: " + m1.raza);
        System.out.println("Edad: " + m1.edad);

        m1.AumentarEdad();

        Mascota m2 = new Mascota();

        m2.nombre = "Michi";
        m2.raza = "Siames";
        m2.edad = -1;

        System.out.println("Nombre: " + m2.nombre);
        System.out.println("Raza: " + m2.raza);
        System.out.println("Edad: " + m2.edad);

        m2.AumentarEdad();
    }
}