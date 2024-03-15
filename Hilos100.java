
public class Hilos100 extends Thread{    

    private int number;
    private boolean ascendente;

    public Hilos100(int n, boolean asc){
        number = n;
        ascendente = asc;
    }

    @Override
    public void run(){
        for (int i = 0; i < 101 ; i++){
            System.out.print(number+" ");
            if(ascendente){
                number++;
                if(number == 101){
                    break;
                }
            }
            else{
                number--;
                if(number == 0){
                    break;
                }
            }
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        Hilos100 hilo1 = new Hilos100(1, true);
        Hilos100 hilo100 = new Hilos100(100, false);
        hilo1.start();
        hilo100.start();
    }
}