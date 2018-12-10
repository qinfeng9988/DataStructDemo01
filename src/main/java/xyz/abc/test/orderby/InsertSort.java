package xyz.abc.test.orderby;

/**
 * @author 秦江峰
 * @date 2018/11/22 11:34
 * 插入排序
 */
public class InsertSort implements IOrderByBase {

    /**
     * 4 5 6 1 3 2
     *
     * @param arrays1
     */
    public void sortByAsc(int[] arrays1) {
//        for (int i = 1; i < arrays1.length; i++) {
//            int b = arrays1[i];
//            int j = i - 1;
//            for (; j >= 0; j--) {
//                if (arrays1[j + 1] < b) {
//                    arrays1[j + 1] = arrays1[j];
////                    arrays1[j] = b;
//                } else {
//                    break;
//                }
//            }
//            arrays1[j + 1] = b;
//        }

        for (int i = 1; i < arrays1.length; i++) {
            int value = arrays1[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arrays1[j] > value) {
                    arrays1[j + 1] = arrays1[j];
                } else {
                    break;
                }
            }
            arrays1[j + 1] = value;
        }


        for (int i : arrays1) {
            System.out.println(i);
        }
    }

    public void sortByDesc(int[] arrays) {
        for (int i = 1; i < arrays.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (arrays[j + 1] > arrays[j]) {
                    int b = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = b;
                } else {
                    break;
                }
            }
        }

        for (int i : arrays) {
            System.out.println(i);
        }
    }

    private void sort(int[] arrays, Commpare commpare) {
        for (int i = 1; i < arrays.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (arrays[j + 1] < arrays[j]) {
                    int b = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = b;
                } else {
                    break;
                }
            }
        }

        for (int i : arrays) {
            System.out.println(i);
        }
    }
}
