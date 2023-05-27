public class vetores {
    public static void main(String[] args){

        int[] numeros = new int[5];

        // Corresponde ao index, a posição dentro do array [0] [1] [2] [3] [4]
        // Seguido da declaração dos valores em cada index

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        //Com um laço for iremos imprimir cada valor buscando a referencia do index, ou seja a posição que o valor se encintra dentro da array

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //Declaração das strings a seguir direto na criação da array

            String[] letras = {"A", "B", "C", "D", "E"};
            for (int j = 0; j < letras.length; j++) {
                 System.out.println(letras[j]);
            }

            int[] numbers = { 7, 32, 24, 17, 87, 44};
            int maior = numbers[0];
            int menor = numbers[0];
            float media = (float) 0;

            for (int k = 0; k < numbers.length; k++) {
                if (numbers[k] > maior) {
                    maior = numbers[k];
                }
                if (numbers[k] < menor) {
                    menor = numbers[k];
                }
                media += numbers[k];
            }
        System.out.println("Maior: " + maior);
        System.out.println("Menor:" + menor);
        System.out.println("Media:" + media/numbers.length);
        }
    }

