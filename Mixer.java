import java.util.Scanner;
class Mixer{
    int arr[];
    int n;
    public Mixer(int num){
        n = num;
        arr = new int[n];
    }

    public void accept(){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < n;){
            System.out.print("Enter element " + (i + 1) + ": ");
            int x = Integer.parseInt(in.nextLine());
            boolean valid = true;
            for(int j = 0; j < i; j++){
                if(arr[j] >= x){
                    valid = false;
                    break;
                }
            }
            if(valid)
                arr[i++] = x;
        }
    }

    public Mixer mix(Mixer a){
        Mixer t = new Mixer(this.n + a.n);
        int index = 0;
        int p = 0;
        int q = 0;
        for(int i = 0; i < t.n; i++){
            if(p < n && q < a.n){
                if(arr[p] < a.arr[q])
                    t.arr[index++] = arr[p++];
                else
                    t.arr[index++] = a.arr[q++];
            }
            else if(p < n){
                for(int k = p; k < n; k++)
                    t.arr[index++] = arr[k];
                break;
            }
            else if(q < a.n){
                for(int k = q; k < a.n; k++)
                    t.arr[index++] = a.arr[k];
                break;
            }
        }
        return t;
    }

    public void display(){
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Size of array 1: ");
        int size1 = Integer.parseInt(in.nextLine());
        Mixer x = new Mixer(size1);
        System.out.print("Size of array 2: ");
        int size2 = Integer.parseInt(in.nextLine());
        Mixer y = new Mixer(size2);
        System.out.println("Array 1 input");
        x.accept();
        System.out.println("Array 2 input");
        y.accept();
        Mixer z = new Mixer(size1 + size2);
        z = x.mix(y);
        System.out.println("Resultant array:");
        z.display();
    }
}

