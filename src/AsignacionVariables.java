public class AsignacionVariables {
    public static void main(String[] args) {
    //Asignación:
//    int a = 2;
//
//    int b;
//    b = 2 + 2 + 3;
//        System.out.println(b);

      // Operadores de Preincremento
//      int
//        a = 5;
//        ++a;
//        System.out.println(a);

      //Operadores de Postincremento:
//        int b = 0;
//        b++;
//        System.out.println(b);

//      int a = 3;
//      int b = 2;
//      /* Preincremento : Incrementa el valor de la variable
//         antes de calcular el valor
//       */
//      int c = a * ++b;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        int a = 3;
        int b = 2;
      /* Postincremento : Incrementa el valor de la variable
         despues de calcular el valor
       */
        int c = a * b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        b++;
        c = a * b;

    }

}
