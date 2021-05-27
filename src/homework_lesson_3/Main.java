package homework_lesson_3;

public class Main {

    public static void main(String[] args) {

// Задание 1.
        int [] a = new int[10];
        a[0] = 1;
        a[1] = 1;
        a[2] = 0;
        a[3] = 0;
        a[4] = 1;
        a[5] = 0;
        a[6] = 1;
        a[7] = 1;
        a[8] = 0;
        a[9] = 0;
        for (int a1 = 0; a1 < a.length; a1++){
            if(a[a1]-1 == 0){
                a[a1] = 0;
            }else{
                a[a1] = 1;
            }
            System.out.print(a[a1] + " ");
        }
        System.out.println("\n");
// Задание 2.
        int [] b = new int [100];
        for (int b1 =0; b1 < b.length; b1++){
            b[b1] = b1;
            System.out.print(b[b1] + " " );
        }
        System.out.println("\n");
// Задание 3.
        int [] c = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1  };
        for (int ci = 0; ci < c.length; ci++){
            if(c[ci] < 6){
                c[ci] *= 2;
            }
            System.out.print(c[ci] + " ");
        }
        System.out.println("\n");
// Задание 4.
        int [][] d = new int[3][3];
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j){
                    d[i][j] = 1;
                }else if (i+j == 2){
                    d[i][j] = 1;
                }
                System.out.print(d[i][j] + " ");
            }
            System.out.println("\n");
        }
// Задание 5.
        int len = 10;
        int initialValue = 6;
        int [] returnMassive = Massive(len , initialValue);
        for (int n = 0; n <returnMassive.length; n++){
            System.out.print(returnMassive[n] + " ");
        }
        System.out.println("\n");
// Задание 6.
        maxMin();
    }
    public static int [] Massive (int w, int q){
        int [] privateMassive = new int[w];
        for (int v = 0; v < privateMassive.length; v++){
            privateMassive[v] = q;
        }
        return privateMassive ;
    }
    public static void maxMin (){
        int [] bMassive = { 1, 3, 1, 7, 6 , 4, 4, 2};
        int first = bMassive [0];
        for (int x = 1; x < bMassive.length; x++){
            first = Math.max(first, bMassive[x]);
        }
        System.out.println("Max value = " + first);
    }

    }

