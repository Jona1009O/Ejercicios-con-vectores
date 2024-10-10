import java.util.Scanner;

   public class SumaVectores {
    

    //Escribe un programa que reciba dos vectores de enteros del
    //mismo tamaño y calcule su suma. El resultado debe ser un tercer vector, donde
    //cada elemento es la suma de los elementos correspondientes en los vectores
    //originales.
    

 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Ingrese el tamaño de los vectores: ");
            int tamaño = sc.nextInt();
    
            int[] vec1 = new int[tamaño];
            int[] vec2 = new int[tamaño];
            int[] vecResultado = new int[tamaño];
    
            System.out.println("Carga del primer vector.");
            cargarVector(vec1, sc);
    
            System.out.println("Carga del segundo vector.");
            cargarVector(vec2, sc);
    
            sumarVectores(vec1, vec2, vecResultado);
    
            imprimirVector(vecResultado);
        }
    
        public static void cargarVector(int[] vec, Scanner sc) {
            for (int i = 0; i < vec.length; i++) {
                System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                vec[i] = sc.nextInt();
            }
        }
    
        public static void sumarVectores(int[] vec1, int[] vec2, int[] vecResultado) {
            for (int i = 0; i < vec1.length; i++) {
                vecResultado[i] = vec1[i] + vec2[i];
            }
        }
    }
        public static void imprimirVector(int[] vec) {
            System.out.println("Vector resultante:");
            for (int num : vec) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    


    //Crea un programa que calcule el producto escalar de dos
    //vectores de enteros del mismo tamaño. El producto escalar se obtiene sumando
    //los productos de los elementos correspondientes de los vectores.

    public class ProductoEscalarVectores {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Ingrese el tamaño de los vectores: ");
            int tamaño = sc.nextInt();
    
            int[] vec1 = new int[tamaño];
            int[] vec2 = new int[tamaño];
    
            System.out.println("Carga del primer vector.");
            cargarVector(vec1, sc);
    
            System.out.println("Carga del segundo vector.");
            cargarVector(vec2, sc);
    
            int resultado = productoEscalar(vec1, vec2);
    
            System.out.println("El producto escalar de los vectores es: " + resultado);
        }
    
        public static void cargarVector(int[] vec, Scanner sc) {
            for (int i = 0; i < vec.length; i++) {
                System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                vec[i] = sc.nextInt();
            }
        }
    
        public static int productoEscalar(int[] vec1, int[] vec2) {
            int resultado = 0;
            for (int i = 0; i < vec1.length; i++) {
                resultado += vec1[i] * vec2[i];
            }
            return resultado;
        }
    }
    

    //Escribe un programa que tome un vector de enteros y cree
    //otro vector que contenga los mismos elementos, pero en orden inverso.

public class InvertirVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = sc.nextInt();

        int[] vec = new int[tamaño];
        int[] vecInvertido = new int[tamaño];

        cargarVector(vec, sc);

        invertirVector(vec, vecInvertido);

        imprimirVector(vecInvertido);
    }

    public static void cargarVector(int[] vec, Scanner sc) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vec[i] = sc.nextInt();
        }
    }

    public static void invertirVector(int[] vec, int[] vecInvertido) {
        for (int i = 0; i < vec.length; i++) {
            vecInvertido[i] = vec[vec.length - 1 - i];
        }
    }

    public static void imprimirVector(int[] vec) {
        System.out.println("Vector invertido:");
        for (int num : vec) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


    //Desarrolla un programa que multiplique un vector por un
    //número escalar. El programa debe recibir un vector de enteros y un número
    //escalar y devolver un nuevo vector con los valores multiplicados por el
    //escalar.
public class MultiplicarVectorEscalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = sc.nextInt();

        int[] vec = new int[tamaño];
        int[] vecResultado = new int[tamaño];

        cargarVector(vec, sc);

        System.out.print("Ingrese el escalar para la multiplicación: ");
        int escalar = sc.nextInt();

        multiplicarPorEscalar(vec, vecResultado, escalar);

        imprimirVector(vecResultado);
    }

    public static void cargarVector(int[] vec, Scanner sc) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vec[i] = sc.nextInt();
        }
    }

    public static void multiplicarPorEscalar(int[] vec, int[] vecResultado, int escalar) {
        for (int i = 0; i < vec.length; i++) {
            vecResultado[i] = vec[i] * escalar;
        }
    }

    public static void imprimirVector(int[] vec) {
        System.out.println("Vector resultante:");
        for (int num : vec) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
