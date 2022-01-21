package GBLVL2.Homework5;

public class ThreadLesson extends Thread {
    private static final int size = 10_000_000;
    private static final int h = size / 2;

    public static void main(String[] args) {
        ThreadLesson test = new ThreadLesson();
        float[] arr = new float[size];
        test.firstMethod(arr);
        test.secondMethod(arr);
    }

    private void firstMethod(float[] arr) {
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.currentTimeMillis();
        System.out.println("Время выполнения в одном потоке " + (System.currentTimeMillis() - currentTime));
    }

    private synchronized void secondMethod(float[] arr) {
        float[] arr1 = new float[size];
        float[] arr2 = new float[size];
        Thread thread1 = new Thread(() -> {
            long currentTimeMillis = System.currentTimeMillis();
            System.arraycopy(arr, 0, arr1, 0, h);
            System.arraycopy(arr, h, arr2, 0, h);
            System.currentTimeMillis();
            System.out.println("Разделение массива на 2 части " + (System.currentTimeMillis() - currentTimeMillis));
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = 1;
            }
            long crntTimeForThrd1 = System.currentTimeMillis();
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.currentTimeMillis();
            System.out.println("Время просчета первой половины массива " + (System.currentTimeMillis() - crntTimeForThrd1));

        });
        Thread thread2 = new Thread(() -> {
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < arr2.length; i++) {
                arr[i] = 1;
            }
            for (int i = 0; i < arr2.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.currentTimeMillis();
            System.out.println("Время просчета второй половины массива " + (System.currentTimeMillis() - currentTimeMillis));
            long arrCorpy = System.currentTimeMillis();
            System.arraycopy(arr1, 0, arr, 0, h);
            System.arraycopy(arr2, 0, arr, h, h);
            System.currentTimeMillis();
            System.out.println("Обратная склейка готового массива " + (System.currentTimeMillis() - arrCorpy));
        });

        thread1.start();
        thread2.start();
    }
}

