package server;

public class Methods {

    public double addition(double num1, double num2) {
        return (num1 + num2);

    }

    public String act2 (double num1, double num2, double num3, double num4) {
        double producto = num1 * num2 * num3 * num4;
        double suma = num1 + num2 + num3 + num4;
        double promedio = suma / 4;

        return "Hola, el producto es: "+ producto + "\n"+"la suma es: "+ suma + "\n"+ "y el promedio es: "+ promedio;
    }

    public String act3 (int num1, int num2) {
        int suma = 0;
        int temp = num1;
        for (int i=num1; i<num2; i++) {
            num1 = num1 + 1;
            suma = suma + num1;
        }
        suma = suma + temp;
        return "La suma de los rangos es: "+ suma;

    }

    public String act4 (int num1, int num2, int num3, int num4, int num5) {
        int [] numeros = {num1, num2, num3, num4, num5};

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        return "Lista ordenada: "+"\n"+ numeros[0] +"\n"+ numeros[1]
                +"\n"+ numeros[2] +"\n"+ numeros[3] +"\n"+ numeros[4];
    }
}
