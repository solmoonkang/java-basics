package section11.multitasking.chapter02.handling_thread;

public class Ex01 {
    public static void main(String[] args) {

        Thread tarzanThread = new Thread(new TarzanRun(100));

        //  💡 쓰레드에 이름 붙이기
        //tarzanThread.setName("타잔송");

        tarzanThread.start();
    }
}
