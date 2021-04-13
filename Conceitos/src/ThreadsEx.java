public class ThreadsEx {
    public static void main(String[] args) throws Exception {
        /*Thread é um pequeno programa que trabalha como um subsistema, forma de
        um processo se autodividir em duas ou mais tarefas.
        Executar vários processos de forma paralela.*/
    
        /*Processo síncrono: ocorrem em sequencia, em fila, um depois o outro */
        /*Processo assíncrono: dois ou mais processos realizados ao mesmo tempo, paralelo*/
        
        BarraDeCarregamento2 barra = new BarraDeCarregamento2();
        BarraDeCarregamento3 barra3 = new BarraDeCarregamento3();
        barra.start();
        barra3.start();
    }
}

class GerarPDF implements Runnable {
    @Override
    public void run(){System.out.println("Gerar PDF");}
}

class BarraDeCarregamento implements Runnable {
    @Override
    public void run(){System.out.println("Loading ...");}
}

class BarraDeCarregamento2 extends Thread {
    @Override
    public void run(){
        super.run();
        
        try {
            Thread.sleep(1000);
            System.out.println("Rodei eu 2." + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}

class BarraDeCarregamento3 extends Thread {
    @Override
    public void run(){
        super.run();
        
        try {
            Thread.sleep(5000);
            System.out.println("Rodei eu 3." + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}