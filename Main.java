public class Main {
    public static void coldDays (int []tomb){
        int a= 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i]<0){
                a++;
            }
        }

        int [] coldDays2 = new int[a];
        int b=0;
        for (int i = 0; i < tomb.length; i++) {

            if (tomb[i]<0){
                coldDays2[b] = tomb[i];
                b++;
            }
        }
        for (int i = 0; i < coldDays2.length; i++) {
            System.out.println(coldDays2[i]);
        }
    }

    public static void main(String[] args) {
        //1. 2. 3. feladat
      /*  int[] szamtomb = new int[10];
        for (int i = 0; i < szamtomb.length; i++) {
            szamtomb[i] = i+12;
        }
        for (int i = 0; i < szamtomb.length; i++) {
            if (szamtomb[i] % 3 == 0)
            System.out.print(szamtomb[i] + " ");
        }
       */
        int[] tomb = new int[15];
        tomb[0] = 12;
        tomb[1] = 22;
        tomb[2] = -4;
        tomb[3] = 27;
        tomb[4] = -5;
        tomb[5] = 6;
        tomb[6] = -2;
        tomb[7] = -7;
        tomb[8] = 5;
        tomb[9] = 23;
        tomb[10] = 20;
        tomb[11] = 0;
        tomb[12] = -12;
        tomb[13] = 21;
        tomb[14] = 19;
        // 4. 5. 6. 7.
     /*   for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] > 0 && tomb[i]%2==0)
            System.out.println(tomb[i]);
        }
        System.out.println(tomb[0]);
        System.out.println(tomb[9]);

      */
        // 8. feladat és 17. - 18. feladat

       /* for (int i = 1; i < tomb.length -1; i++) {
            int secondVar = i+1;
            int thirdVar = i-1;
            if (tomb[i] == (tomb[secondVar] + tomb[thirdVar])){
                System.out.println(tomb[i] + " egyenlő" + tomb[secondVar] + " + " + tomb[thirdVar]);}
        }
        */


        // 9. feladat
/*
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < 0) {
                tomb[i] = Math.abs(tomb[i]);
                }
        }
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
        */

        // 10. és 11. feladat
        /*
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] > -5 && tomb[i] > -10)
                System.out.println(tomb[i]);

        }

         */
        // 12. feladat
        /*
        for (int i = tomb.length -1; i >= 0; i--) {
            System.out.println(tomb[i]);
        }

         */
        // Bónusz 1. és 2. feladat
        /*
        String[] firstNames = new String [4];
        String[] lastNames = new String [4];
        lastNames[0] = "Kiss";
        lastNames[1] = "Nagy";
        lastNames[2] = "Pintér";
        lastNames[3] = "Kovács";

        firstNames[0] = "Szabolcs";
        firstNames[1] = "Gyula";
        firstNames[2] = "Ferenc";
        firstNames[3] = "István";

        for (int i = 0; i < lastNames.length; i++) {
            for (int j = 0; j < firstNames.length; j++) {
                System.out.println(firstNames[j] + " " + lastNames[i]);

            }

        } */
        /*
        // 14. feladat
int a = tomb[0];
int b = tomb[tomb.length-1];
tomb[0]=b;
tomb[tomb.length-1]=a;

        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);

        }
         */
        /*  //15. feladat
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i]%5==0 && tomb[i]%10 !=0){
                System.out.println(tomb[i]);
            }
        }
         */
/* // 16. feladat
        for (int i = 0; i < tomb.length; i++) {
            if ((tomb[i]>-100 && tomb[i]<100) && tomb[i] % 11 == 0)
            {System.out.println(tomb[i]);}
            if (tomb[i]%111==0){
                System.out.println(tomb[i]);
            }



        }
 */ //20-tól 23-as feladatig + a 30-as is ez
       /* double sum = 0;
        for (int i = 0; i < tomb.length; i++) {
        sum=sum+tomb[i];
            }
        double average= sum/ tomb.length;
        System.out.println(average);
        }

        */
        // 24-29-es feladatok
/*
        int biggest=0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i]>20){
                biggest++;
            }
        }
        if (biggest>0)
        System.out.println("van 20 foknál melegebb nap: " + biggest + " darab");


 */
        /*
        // 31. feladat
        int leghidegebb = 40;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i]<leghidegebb){
                leghidegebb=tomb[i];
            }
        }
        System.out.println("a legalacsonyabb hőfok=" + leghidegebb);
        int count=0;
        for (int i = 0; i < tomb.length; i++) {
            count++;
            if (tomb[i]==leghidegebb){
                System.out.println("a " + count + ". napon");
                break;
            }

         */
       /*
       // 32. feladat
        int count=0;
        for (int i = 0; i < tomb.length; i++) {
            count++;
            if (tomb[i]<0)
                System.out.println("fagypont alatt volt a " + count +". nap." + tomb[i] + " fokkal");
        }
        */
   /*     int a= 0;
    for (int i = 0; i < tomb.length; i++) {
            if (tomb[i]<0){
                a++;
            }
        }

        int [] coldDays2 = new int[a];
        int b=0;
        for (int i = 0; i < tomb.length; i++) {

            if (tomb[i]<0){
                coldDays2[b] = tomb[i];
                b++;
            }
        }
        for (int i = 0; i < coldDays2.length; i++) {
            System.out.println(coldDays2[i]);

        }
       /* for (int i = 0; i < coldDays.length; i++) {
            System.out.println(coldDays[i]);
        }

    */
 coldDays(tomb);


        }
        }




