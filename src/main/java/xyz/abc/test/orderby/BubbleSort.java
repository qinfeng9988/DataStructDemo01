package xyz.abc.test.orderby;

/**
 * @author 秦江峰
 * @date 2018/11/21 10:23
 * 冒泡排序
 */
public class BubbleSort implements IOrderByBase {

    @Override
    public void sortByAsc(int[] arrays) {
//        sort(arrays, (x, y) -> x > y);
//        sort2(arrays, (x, y) -> x < y);
        sort3(arrays, (x, y) -> x < y);
    }

    @Override
    public void sortByDesc(int[] arrays) {
//        sort2(arrays, (x, y) -> x > y);
//        sort(arrays, (x, y) -> x < y);
        sort3(arrays, (x, y) -> x > y);
    }

    private void sort(int[] arrays, Commpare commpare) {
        int length = arrays.length;
        int currentValue = 0;
        boolean isBreak;
        for (int x = 0; x < length; x++) {
            currentValue = arrays[x];
            isBreak = true;
            for (int i = x + 1; i < length; i++) {
                if (commpare.compare(currentValue, arrays[i])) {
                    arrays[x] = arrays[i];
                    arrays[i] = currentValue;
                    currentValue = arrays[x];
                    isBreak = false;
                }
            }
            if (isBreak) break;
        }
        for (int array2 : arrays) {
            System.out.println(array2);
        }
    }

    private void sort2(int[] arrays, Commpare commpare) {
        int length = arrays.length;
        int currentValue;
        for (int i = 0; i <= length - 1; i++) {
            currentValue = arrays[length - (i + 1)];
            for (int j = 0; j < length - 1 - i; j++) {
                if (commpare.compare(arrays[j], currentValue)) {
                    arrays[length - 1 - i] = arrays[j];
                    arrays[j] = currentValue;
                    currentValue = arrays[length - 1 - i];
                }
            }
        }
        for (int array : arrays) {
            System.out.println(array);
        }
    }

    private void sort3(int[] arrays, Commpare commpare) {
        int n;
        boolean isBreak ;
        for (int i = arrays.length - 1; i > 0; i--) {
            isBreak = true;
            for (int j = 0; j < i; j++) {
                if (commpare.compare(arrays[j], arrays[j + 1])) {
                    n = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = n;
                    isBreak = false;
                }
            }
            if(isBreak) break;
        }
        for (int array : arrays) {
            System.out.println(array);
        }
    }


    interface Commpare {
        boolean compare(int val, int val2);
    }
}
