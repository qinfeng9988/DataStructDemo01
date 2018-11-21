package xyz.abc.test.orderby;

/**
 * @author 秦江峰
 * @date 2018/11/21 10:23
 * 冒泡排序
 */
public class BubbleSort implements IOrderByBase {

    @Override
    public void sortByAsc(int[] arrays) {
        sort(arrays,OrderbyEnum.ASC);
    }

    @Override
    public void sortByDesc(int[] arrays) {
        sort(arrays,OrderbyEnum.DESC);
    }

    private void sort(int[] arrays, OrderbyEnum orderbyEnum){
        int length = arrays.length;
        int currentValue = 0;
        for (int x = 0; x < length; x++) {
            currentValue = arrays[x];
            for (int i = x; i < length; i++) {
                if (equals(currentValue,arrays[i],orderbyEnum)) {
                    arrays[x] = arrays[i];
                    arrays[i] = currentValue;
                    currentValue = arrays[x];
                }
            }
        }
        for (int array2 : arrays) {
            System.out.println(array2);
        }
    }

    private boolean equals(int val, int val2, OrderbyEnum orderbyEnum) {
        switch (orderbyEnum) {
            case ASC:
                return val > val2;
            default:
                return val < val2;
        }
    }
}
