import java.util.LinkedList;

public class ListCal {
    private LinkedList<Integer> list_1 = new LinkedList<Integer>();
    private LinkedList<Integer> list_2 = new LinkedList<Integer>();

    private LinkedList<Integer> list_T = new LinkedList<Integer>(); // temp
    private LinkedList<Integer> list_R = new LinkedList<Integer>(); // result
    
    public ListCal() {
        // list Create
        this.setList1();
        this.setList2();
        
        for (Integer num : list_1) {
            list_T.add(num);
        }
        
        for (Integer num : list_2) {
            list_T.add(num);
        }

        SortList();
    }
    
    private void SortList() {
        while (list_T.size() != 0) {
            int min = list_T.get(0);
            int j = 0;
            for (int i = 0; i < list_T.size(); i++) {
                if (min > list_T.get(i)) {
                    min = list_T.get(i);
                    j = i;
                }
            }
            list_R.add(min);
            list_T.remove(j);
        }
    }



    public void setList1() {
        // list 1 create
        list_1.add(1);
        list_1.add(4);
        list_1.add(5);
        list_1.add(8);
    }

    
    public void setList2() {
        // list 2 create
        list_2.add(2);
        list_2.add(3);
        list_2.add(5);
        list_2.add(7);
        list_2.add(9);
    }


    public LinkedList<Integer> getListR() {
        return list_R;
    }


    public LinkedList<Integer> getList1() {
        return list_1;
    }


    public LinkedList<Integer> getList2() {
        return list_2;
    }

}
