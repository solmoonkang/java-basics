package section11.multitasking.chapter02.handling_thread;

public class PrintThrNoRun implements Runnable {

    int no;
    public PrintThrNoRun(int no) {
        this.no = no;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.print(no);

            // 시간지연
            for (int j = 0; j < Integer.MAX_VALUE; j++) {}
        }
    }
}
